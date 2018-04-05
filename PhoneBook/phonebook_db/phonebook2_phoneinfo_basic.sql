-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: phonebook2
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `phoneinfo_basic`
--

DROP TABLE IF EXISTS `phoneinfo_basic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `phoneinfo_basic` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `fr_name` varchar(45) NOT NULL,
  `fr_phone` varchar(45) NOT NULL,
  `fr_email` varchar(45) NOT NULL,
  `fr_address` varchar(45) NOT NULL,
  `fr_regdate` datetime DEFAULT CURRENT_TIMESTAMP,
  `fr_ref_idx` int(11) NOT NULL,
  PRIMARY KEY (`idx`),
  KEY `fr_ref_id_idx` (`fr_ref_idx`),
  CONSTRAINT `fr_ref_idx` FOREIGN KEY (`fr_ref_idx`) REFERENCES `member` (`idx`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phoneinfo_basic`
--

LOCK TABLES `phoneinfo_basic` WRITE;
/*!40000 ALTER TABLE `phoneinfo_basic` DISABLE KEYS */;
INSERT INTO `phoneinfo_basic` VALUES (52,'김비트','010-1234-5678','bit@naver.com','강남','2018-04-05 09:39:53',9),(53,'김주환','010-9999-4527','wwwnghks@naver.com','의정부','2018-04-05 09:40:17',10),(54,'최비트','010-1234-5678','bit@daum.net','강남','2018-04-05 09:40:53',10),(55,'홍길동','010-4321-8765','ghdrlfehd@naver.com','동해번쩍!','2018-04-05 09:42:46',11),(56,'박비트','010-1111-2222','bitcamp@naver.com','서초','2018-04-05 09:43:19',11),(57,'이도은','010-9925-1964','ehdms@naver.com','경기도','2018-04-05 14:53:59',9);
/*!40000 ALTER TABLE `phoneinfo_basic` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-05 16:49:43
