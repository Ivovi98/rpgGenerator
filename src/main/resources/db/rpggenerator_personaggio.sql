-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: rpggenerator
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `personaggio`
--

DROP TABLE IF EXISTS `personaggio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personaggio` (
  `idPersonaggio` int NOT NULL AUTO_INCREMENT,
  `nomePersonaggio` varchar(45) DEFAULT NULL,
  `classePersonaggio` varchar(45) DEFAULT NULL,
  `livelloPersonaggio` int NOT NULL,
  `forzaPersonaggio` int NOT NULL,
  `intellijPersonaggio` int NOT NULL,
  `salutePersonaggio` int NOT NULL,
  `version` int DEFAULT NULL,
  `dataUltimaModifica` datetime DEFAULT NULL,
  `dataCreazione` datetime DEFAULT NULL,
  `Classe_nomeAttributiClasse` varchar(45) NOT NULL,
  PRIMARY KEY (`idPersonaggio`),
  UNIQUE KEY `nomePersonaggio_UNIQUE` (`nomePersonaggio`),
  KEY `fk_Personaggio_Classe_idx` (`Classe_nomeAttributiClasse`),
  CONSTRAINT `fk_Personaggio_Classe` FOREIGN KEY (`Classe_nomeAttributiClasse`) REFERENCES `classe` (`nomeAttributiClasse`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personaggio`
--

LOCK TABLES `personaggio` WRITE;
/*!40000 ALTER TABLE `personaggio` DISABLE KEYS */;
/*!40000 ALTER TABLE `personaggio` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-13 12:14:15
