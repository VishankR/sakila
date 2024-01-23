CREATE ALGORITHM = UNDEFINED DEFINER = `root`@`localhost` SQL SECURITY DEFINER VIEW `sakilaspringboot`.`film_list` AS
SELECT `sakilaspringboot`.`film`.`film_id`     AS `film_id`,
       `sakilaspringboot`.`film`.`title`       AS `title`,
       `sakilaspringboot`.`film`.`description` AS `description`,
       `sakilaspringboot`.`category`.`name`    AS `category`,
       `sakilaspringboot`.`film`.`rental_rate` AS `price`,
       `sakilaspringboot`.`film`.`length`      AS `length`,
       `sakilaspringboot`.`film`.`rating`      AS `rating`,
       GROUP_CONCAT(CONCAT(`sakilaspringboot`.`actor`.`first_name`,
                           _utf8mb4 ' ',
                           `sakilaspringboot`.`actor`.`last_name`)
                    SEPARATOR ', ')  AS `actors`
FROM ((((`sakilaspringboot`.`film`
    LEFT JOIN `sakilaspringboot`.`film_category` ON ((`sakilaspringboot`.`film_category`.`film_id` = `sakilaspringboot`.`film`.`film_id`)))
    LEFT JOIN `sakilaspringboot`.`category` ON ((`sakilaspringboot`.`category`.`category_id` = `sakilaspringboot`.`film_category`.`category_id`)))
    LEFT JOIN `sakilaspringboot`.`film_actor` ON ((`sakilaspringboot`.`film`.`film_id` = `sakilaspringboot`.`film_actor`.`film_id`)))
    LEFT JOIN `sakilaspringboot`.`actor` ON ((`sakilaspringboot`.`film_actor`.`actor_id` = `sakilaspringboot`.`actor`.`actor_id`)))
GROUP BY `sakilaspringboot`.`film`.`film_id`, `sakilaspringboot`.`category`.`name`