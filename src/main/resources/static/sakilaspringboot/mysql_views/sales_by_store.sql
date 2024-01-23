CREATE ALGORITHM = UNDEFINED DEFINER = `root`@`localhost` SQL SECURITY DEFINER VIEW `sakilaspringboot`.`sales_by_store` AS
SELECT CONCAT(`c`.`city`, _utf8mb4 ',', `cy`.`country`) AS `store`,
       CONCAT(`m`.`first_name`,
              _utf8mb4 ' ',
              `m`.`last_name`)                          AS `manager`,
       SUM(`p`.`amount`)                                AS `total_sales`
FROM (((((((`sakilaspringboot`.`payment` `p`
    JOIN `sakilaspringboot`.`rental` `r` ON ((`p`.`rental_id` = `r`.`rental_id`)))
    JOIN `sakilaspringboot`.`inventory` `i` ON ((`r`.`inventory_id` = `i`.`inventory_id`)))
    JOIN `sakilaspringboot`.`store` `s` ON ((`i`.`store_id` = `s`.`store_id`)))
    JOIN `sakilaspringboot`.`address` `a` ON ((`s`.`address_id` = `a`.`address_id`)))
    JOIN `sakilaspringboot`.`city` `c` ON ((`a`.`city_id` = `c`.`city_id`)))
    JOIN `sakilaspringboot`.`country` `cy` ON ((`c`.`country_id` = `cy`.`country_id`)))
    JOIN `sakilaspringboot`.`staff` `m` ON ((`s`.`manager_staff_id` = `m`.`staff_id`)))
GROUP BY `s`.`store_id`
ORDER BY `cy`.`country`, `c`.`city`