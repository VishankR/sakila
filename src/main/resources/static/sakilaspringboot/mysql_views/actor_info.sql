CREATE ALGORITHM = UNDEFINED DEFINER = `root`@`localhost` SQL SECURITY INVOKER VIEW `sakilaspringboot`.`actor_info` AS
SELECT `a`.`actor_id`               AS `actor_id`,
       `a`.`first_name`             AS `first_name`,
       `a`.`last_name`              AS `last_name`,
       GROUP_CONCAT(DISTINCT CONCAT(`c`.`name`,
                                    ': ',
                                    (SELECT GROUP_CONCAT(`f`.`title`
                                                         ORDER BY `f`.`title` ASC
                                                         SEPARATOR ', ')
                                     FROM ((`sakilaspringboot`.`film` `f`
                                         JOIN `sakilaspringboot`.`film_category` `fc` ON ((`f`.`film_id` = `fc`.`film_id`)))
                                         JOIN `sakilaspringboot`.`film_actor` `fa` ON ((`f`.`film_id` = `fa`.`film_id`)))
                                     WHERE ((`fc`.`category_id` = `c`.`category_id`)
                                         AND (`fa`.`actor_id` = `a`.`actor_id`))))
                    ORDER BY `c`.`name` ASC
                    SEPARATOR '; ') AS `film_info`
FROM (((`sakilaspringboot`.`actor` `a`
    LEFT JOIN `sakilaspringboot`.`film_actor` `fa` ON ((`a`.`actor_id` = `fa`.`actor_id`)))
    LEFT JOIN `sakilaspringboot`.`film_category` `fc` ON ((`fa`.`film_id` = `fc`.`film_id`)))
    LEFT JOIN `sakilaspringboot`.`category` `c` ON ((`fc`.`category_id` = `c`.`category_id`)))
GROUP BY `a`.`actor_id`, `a`.`first_name`, `a`.`last_name`
