DROP TABLE if EXISTS customer;

CREATE TABLE IF NOT EXISTS `customer` (
                                          `iuser` INT NULL AUTO_INCREMENT,
                                          `uid` VARCHAR(20) NOT NULL,
    `upw` VARCHAR(100) NOT NULL,
    `nm` VARCHAR(8) NOT NULL,
    `adr` VARCHAR(100) NOT NULL,
    `mail` VARcustomerCHAR(45) NOT NULL,
    `birth` VARCHAR(8) NOT NULL,
    `phoneno` VARCHAR(13) NOT NULL,
    gender TINYINT NOT NULL CHECK(gender IN (1, 2 ,3)),
    PRIMARY KEY (`iuser`),
    UNIQUE INDEX `uid_UNIQUE` (`uid` ASC) VISIBLE);

