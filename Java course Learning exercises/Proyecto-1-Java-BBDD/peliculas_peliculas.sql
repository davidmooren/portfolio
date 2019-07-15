CREATE DATABASE  IF NOT EXISTS `peliculas` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `peliculas`;
-- MySQL dump 10.13  Distrib 5.7.24, for Win64 (x86_64)
--
-- Host: 10.90.36.117    Database: peliculas
-- ------------------------------------------------------
-- Server version	5.7.24-log

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
-- Table structure for table `peliculas`
--

DROP TABLE IF EXISTS `peliculas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peliculas` (
  `nombrepeli` varchar(80) DEFAULT NULL,
  `anno` int(4) DEFAULT NULL,
  `categoria` int(11) DEFAULT NULL,
  `id_pelicula` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_pelicula`),
  UNIQUE KEY `id_pelicula_UNIQUE` (`id_pelicula`),
  KEY `FK_cat_peli_idx` (`categoria`),
  CONSTRAINT `FK_cat_peli` FOREIGN KEY (`categoria`) REFERENCES `categorias` (`idcategorias`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peliculas`
--

LOCK TABLES `peliculas` WRITE;
/*!40000 ALTER TABLE `peliculas` DISABLE KEYS */;
INSERT INTO `peliculas` VALUES ('La vida es bella',1997,2,1),('Intocable',2011,4,2),('Regreso al futuro',1985,4,3),('El gran dictador',1940,4,4),('Luces de la ciudad',1931,4,5),('Forrest Gump',1994,4,6),('Casablanca',1942,2,7),('Amelia',2001,2,8),('El indomable Will Hunting',1997,2,9),('El Rey León',1994,5,10),('Coco',2017,5,11),('La princesa Mononoke',1997,5,12),('Up',2009,5,13),('Toy Story',1995,5,14),('Inside Out',2015,5,15),('Forrest Gump',1994,2,16),('El Club de los poetas muertos',1989,2,17),('El caballero oscuro',2008,6,18),('Origen',2010,6,19),('Sospechosos habituales',1995,6,20),('El apartamento',1960,2,21),('El secreto de tus ojos',2009,2,22),('Seven',1995,6,23),('El silencio de los corderos',1991,6,24),('Memento',2000,6,25),('El señor de los anillos: El retorno del rey',2003,3,26),('Los siete samuráis',1954,3,27),('Interstellar',2014,3,28),('La guerra de las galaxias',1997,3,29),('Gladiator',2000,3,30),('El caso Bourne',2002,1,31),('La noche de los cristales rotos',1991,1,32),('Arma letal',1987,1,33),('La jungla de cristal',1988,1,34),('El padrino',1972,1,35),('Ciudad de Dios',2002,1,36),('Uno de los nuestros',1990,1,37),('Pulp Fiction',1994,1,38),('Avengers: Infinity War',2018,3,39),('Jurassic World: Fallen Kingdom',2018,3,40),('Venom',2018,3,41),('Avatar',2009,3,42),('Deadpool',2016,4,43),('Un Lugar tranquilo',2018,6,44),('Lo imposible',2012,6,45),('Fargo',1996,1,46),('Shutter Island',2010,1,47),('El caballero oscuro',2008,6,48),('TED 2',2015,4,49),('Harakiri',1962,2,50),('Titanic',1997,2,51),('Zootropolis',2016,5,52),('Your name',2016,5,53),('Dejame salir',2017,6,54),('Multiple',2016,6,55),('Resacon en Las Vegas',2009,4,56),('The others',2001,6,57),('El sexto sentido',1999,6,58),('La pelicula de los simpson',2014,5,59),('Fast & furious 8',2017,3,60),('Harry Potter y el prisionero de azkaban',2004,3,61),('Shrek',2001,5,62),('Corpse Bride',2005,5,63),('Spirit',2002,5,64),('A Silent Voice',2016,5,65),('El Diario de Noa',2004,2,66),('Bajo la misma estrella',2014,2,67),('Con derecho a roce',2011,2,68),('Postdata: Te Quiero',2007,2,69),('Pretty Woman',1990,2,70),('Juego de Ladrones. El atraco perfecto',2018,1,71),('La isla siniestra',2010,1,72),('Ralph Rompe internet',2018,5,73),('Los increibles ',2004,5,74),('Los intocables de Eliot Ness',1987,1,75),('Bobby Z',2007,1,76),('Deadpool',2016,4,77),('Ocho apellidos vascos',2014,4,78),('Scary Movie',2000,4,79),('Ensalada de Pepino en el colegio femenino',1999,2,80),('Dos tontos muy tontos',1994,4,81),('asodas',1998,2,82),('Peliculon',2002,6,83),('dfds',55,6,84),('peliculaaa',1999,3,85),('jose',1666,5,86),('jose',1666,5,87),('Peliculazaaaaa!!!',2019,2,88),('Peliculazaaaaa!!!',2019,2,89),('raul',1998,1,91),('gggg',1990,3,93),('antonio',1234,2,94),('antonio',1234,2,95),('pepe',1258,2,96),('prueba1',1900,5,97),('holasdlas',1990,2,98),('Peliiii',1999,4,99);
/*!40000 ALTER TABLE `peliculas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-12 14:16:46
