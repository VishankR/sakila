CREATE ALGORITHM = UNDEFINED DEFINER = `root`@`localhost` SQL SECURITY DEFINER VIEW `sakilaspringboot`.`staff_list` AS
SELECT `s`.`staff_id`               AS `staff_id`,
       CONCAT(`s`.`first_name`,
              _utf8mb4 ' ',
              `s`.`last_name`)      AS `name`,
       `a`.`address`                AS `address`,
       `a`.`postal_code`            AS `zip code`,
       `a`.`phone`                  AS `phone`,
       `sakilaspringboot`.`city`.`city`       AS `city`,
       `sakilaspringboot`.`country`.`country` AS `country`,
       `s`.`store_id`               AS `store_id`
FROM (((`sakilaspringboot`.`staff` `s`
    JOIN `sakilaspringboot`.`address` `a` ON ((`s`.`address_id` = `a`.`address_id`)))
    JOIN `sakilaspringboot`.`city` ON ((`a`.`city_id` = `sakilaspringboot`.`city`.`city_id`)))
    JOIN `sakilaspringboot`.`country` ON ((`sakilaspringboot`.`city`.`country_id` = `sakilaspringboot`.`country`.`country_id`)))