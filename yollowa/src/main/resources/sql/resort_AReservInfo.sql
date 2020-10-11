-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: resort
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `areservinfo`
--

DROP TABLE IF EXISTS `areservinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `areservinfo` (
  `AReservInfo_number` int NOT NULL AUTO_INCREMENT,
  `AReservInfo_userNumber` int NOT NULL,
  `AReservInfo_articleNumber` int NOT NULL,
  `AReservInfo_checkIn` date NOT NULL,
  `AReservInfo_checkOut` date DEFAULT NULL,
  `AReservInfo_phoneNumber` varchar(11) NOT NULL,
  `AReservInfo_reservDate` date NOT NULL,
  `AReservInfo_payment` int NOT NULL,
  `AReservInfo_reservStatus` int NOT NULL DEFAULT '0',
  `AReservInfo_cartStatus` int NOT NULL,
  PRIMARY KEY (`AReservInfo_number`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `areservinfo`
--

LOCK TABLES `areservinfo` WRITE;
/*!40000 ALTER TABLE `areservinfo` DISABLE KEYS */;
INSERT INTO `areservinfo` VALUES (1,24,1,'2020-10-01','2020-10-01','01028542879','2020-09-30',1000,1,0),(2,24,8,'2020-10-01','2020-10-04','01028542879','2020-10-01',1000,1,0),(3,24,9,'2020-10-01','2020-10-05','01028542879','2020-10-01',1000,1,0),(4,24,1,'2020-10-20','2020-10-20','01028542879','2020-10-09',1000,1,0),(5,24,2,'2020-10-21','2020-10-21','01028542879','2020-10-09',1000,1,0),(6,24,1,'2020-10-22','2020-10-22','01028542879','2020-10-09',1000,1,0),(7,24,2,'2020-10-23','2020-10-25','01028542879','2020-10-07',1000,0,1),(8,24,1,'2020-10-24','2020-10-27','01028542879','2020-10-04',1000,0,1),(9,24,1,'2020-10-25','2020-10-25','01028542879','2020-10-09',1000,0,1),(10,24,1,'2020-10-01','2020-10-01','01028542879','2020-09-30',1000,1,0),(11,24,2,'2020-10-01','2020-10-01','01028542879','2020-09-30',1000,1,0);
/*!40000 ALTER TABLE `areservinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-11 20:46:16
