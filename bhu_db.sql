/*
SQLyog Enterprise Trial - MySQL GUI v7.11 
MySQL - 8.0.18 : Database - bhu_lib
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`bhu_lib` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `bhu_lib`;

/*Table structure for table `books` */

DROP TABLE IF EXISTS `books`;

CREATE TABLE `books` (
  `ISBN` char(13) NOT NULL,
  `book_name` varchar(80) NOT NULL,
  `author_name` varchar(50) NOT NULL,
  `genre` varchar(20) DEFAULT NULL,
  `Qunatity` int(11) NOT NULL,
  PRIMARY KEY (`ISBN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `books` */

insert  into `books`(`ISBN`,`book_name`,`author_name`,`genre`,`Qunatity`) values ('10000000','The Second Lady','utkarsh','Thiller',20);

/*Table structure for table `books_trans` */

DROP TABLE IF EXISTS `books_trans`;

CREATE TABLE `books_trans` (
  `trans_id` int(11) NOT NULL AUTO_INCREMENT,
  `reader` varchar(50) NOT NULL,
  `ISBN` char(13) NOT NULL,
  `contact_no` char(10) NOT NULL,
  `issue_date` date NOT NULL,
  `expected_return_date` date NOT NULL,
  `actual_return_date` date DEFAULT NULL,
  PRIMARY KEY (`trans_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `books_trans` */

insert  into `books_trans`(`trans_id`,`reader`,`ISBN`,`contact_no`,`issue_date`,`expected_return_date`,`actual_return_date`) values (1,'utkarsh','10000000','9838886776','2020-01-06','2020-02-05',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
