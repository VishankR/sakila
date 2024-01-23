CREATE ALGORITHM = UNDEFINED DEFINER = `root`@`localhost` SQL SECURITY DEFINER VIEW `sakilaspringboot`.`sales_by_film_category` AS
SELECT `c`.`name`        AS `category`,
       SUM(`p`.`amount`) AS `total_sales`
FROM (((((`sakilaspringboot`.`payment` `p`
    JOIN `sakilaspringboot`.`rental` `r` ON ((`p`.`rental_id` = `r`.`rental_id`)))
    JOIN `sakilaspringboot`.`inventory` `i` ON ((`r`.`inventory_id` = `i`.`inventory_id`)))
    JOIN `sakilaspringboot`.`film` `f` ON ((`i`.`film_id` = `f`.`film_id`)))
    JOIN `sakilaspringboot`.`film_category` `fc` ON ((`f`.`film_id` = `fc`.`film_id`)))
    JOIN `sakilaspringboot`.`category` `c` ON ((`fc`.`category_id` = `c`.`category_id`)))
GROUP BY `c`.`name`
ORDER BY `total_sales` DESC