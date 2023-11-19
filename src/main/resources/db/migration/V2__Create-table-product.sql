CREATE TABLE `tb_product` (
    `id` BIGINT AUTO_INCREMENT ,
    `name` VARCHAR(255),
    `description` varchar(100),
    `price` DOUBLE,
    `imgUrl` VARCHAR(255),
    
    primary key(`id`)
)