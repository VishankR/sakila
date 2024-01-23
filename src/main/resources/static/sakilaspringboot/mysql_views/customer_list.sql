CREATE ALGORITHM = UNDEFINED DEFINER =`root`@`localhost` SQL SECURITY DEFINER VIEW `sakilaspringboot`.`customer_list` AS
select `cu`.`customer_id`                                       AS `customer_id`,
       concat(`cu`.`first_name`, _utf8mb4' ', `cu`.`last_name`) AS `name`,
       `a`.`address`                                            AS `address`,
       `a`.`postal_code`                                        AS `zip code`,
       `a`.`phone`                                              AS `phone`,
       `sakilaspringboot`.`city`.`city`                                   AS `city`,
       `sakilaspringboot`.`country`.`country`                             AS `country`,
       if(`cu`.`active`, _utf8mb4'active', _utf8mb4'')          AS `notes`,
       `cu`.`store_id`                                          AS `store_id`
from (((`sakilaspringboot`.`customer` `cu` join `sakilaspringboot`.`address` `a`
        on ((`cu`.`address_id` = `a`.`address_id`))) join `sakilaspringboot`.`city`
       on ((`a`.`city_id` = `sakilaspringboot`.`city`.`city_id`))) join `sakilaspringboot`.`country`
      on ((`sakilaspringboot`.`city`.`country_id` = `sakilaspringboot`.`country`.`country_id`)))