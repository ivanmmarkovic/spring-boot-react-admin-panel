CREATE TABLE IF NOT EXISTS `user` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `username` VARCHAR(20) NOT NULL,
    `password` VARCHAR(80)
);

CREATE TABLE IF NOT EXISTS `role` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(10),
    `user_id` INT
);

ALTER TABLE `role` ADD FOREIGN KEY (`user_id`) REFERENCES `user`(`id`) ON DELETE SET NULL ON UPDATE NO ACTION;


CREATE TABLE IF NOT EXISTS `article` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `title` VARCHAR(100) NOT NULL,
    `body` TEXT DEFAULT NULL,
    `created_at` TIMESTAMP
);