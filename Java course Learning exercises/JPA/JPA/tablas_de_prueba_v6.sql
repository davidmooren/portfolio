CREATE DATABASE  IF NOT EXISTS `tablas_de_prueba` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `tablas_de_prueba`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: tablas_de_prueba
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `app_user`
--

DROP TABLE IF EXISTS `app_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `app_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `age` int(11) NOT NULL,
  `salary` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `app_user`
--

LOCK TABLES `app_user` WRITE;
/*!40000 ALTER TABLE `app_user` DISABLE KEYS */;
INSERT INTO `app_user` VALUES (1,'Sam',30,70000),(2,'Tom',40,50000),(3,'Samm',45,111);
/*!40000 ALTER TABLE `app_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blog_user`
--

DROP TABLE IF EXISTS `blog_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blog_user` (
  `username` varchar(50) NOT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `created_on` datetime DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog_user`
--

LOCK TABLES `blog_user` WRITE;
/*!40000 ALTER TABLE `blog_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `blog_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `id` varchar(255) NOT NULL,
  `author` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `ID` int(11) NOT NULL,
  `FIRSTNAME` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `LASTNAME` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `BIRTHDATE` date DEFAULT NULL,
  `SALARY` double DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (101,'Abhijit','Gopali','1956-06-01',89345),(102,'Peter','Forrester','1965-11-01',99345),(110,'Troy','Hammer','1965-03-31',102109.15),(111,'Matthieu','Williams','1966-05-31',100345.15),(120,'Rajiv','Sudahari','1969-12-22',68400.22),(121,'Kenny','Arlington','1959-10-22',78405.22),(123,'Michael','Walton','1986-08-25',93400.2),(124,'Michael','McGinn','1979-01-25',99400.2),(129,'Cindy','Colchester','1965-03-24',902109.15),(130,'David','OReilly','1969-12-25',88400.22),(133,'Clarence','Dupree','1986-08-11',103400.2),(151,'Arfat','Poland','1956-06-11',99345),(190,'Patrice','Bergeron','1970-09-18',109345),(191,'Jill','Molinair','1968-08-18',119345),(200,'Patricia','Arnant','1970-10-31',79345),(201,'Thomas','Fitzpatrick','1961-09-22',75123.45),(202,'Thomas','Heimer','1967-07-22',79123.45),(211,'patatita','Lays','1961-09-13',18000);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hits`
--

DROP TABLE IF EXISTS `hits`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hits` (
  `idhits` int(11) NOT NULL AUTO_INCREMENT,
  `contador` int(11) DEFAULT NULL,
  PRIMARY KEY (`idhits`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hits`
--

LOCK TABLES `hits` WRITE;
/*!40000 ALTER TABLE `hits` DISABLE KEYS */;
INSERT INTO `hits` VALUES (1,0);
/*!40000 ALTER TABLE `hits` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mensajes`
--

DROP TABLE IF EXISTS `mensajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mensajes` (
  `idMensaje` int(11) NOT NULL AUTO_INCREMENT,
  `mensaje` varchar(160) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idMensaje`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mensajes`
--

LOCK TABLES `mensajes` WRITE;
/*!40000 ALTER TABLE `mensajes` DISABLE KEYS */;
/*!40000 ALTER TABLE `mensajes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paises`
--

DROP TABLE IF EXISTS `paises`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paises` (
  `code` varchar(3) COLLATE utf8_spanish_ci NOT NULL,
  `Nombre` varchar(52) COLLATE utf8_spanish_ci NOT NULL,
  `Continente` varchar(1005) COLLATE utf8_spanish_ci NOT NULL DEFAULT 'Asia',
  `Region` varchar(26) COLLATE utf8_spanish_ci NOT NULL,
  `Poblacion` int(11) NOT NULL DEFAULT '0',
  `Capital` int(11) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paises`
--

LOCK TABLES `paises` WRITE;
/*!40000 ALTER TABLE `paises` DISABLE KEYS */;
INSERT INTO `paises` VALUES ('ABW','Aruba1','NorteAmerica','Caribe',103000,129),('AFG','Afganistan','Asia','Sur y centro e Asia',22720000,1),('AGO','Angola','Africa','Africa central',12878000,56),('AIa','Anguilla','NorteAmérica','caribe',8000,62),('ALB','Albania','Europa','Sur de Europa',3401200,34),('AND','Andorra','Europa','Suroeste de Europa',78000,55);
/*!40000 ALTER TABLE `paises` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `palabras`
--

DROP TABLE IF EXISTS `palabras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `palabras` (
  `idPalabras` int(11) NOT NULL AUTO_INCREMENT,
  `palabra` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `significado` varchar(1024) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idPalabras`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `palabras`
--

LOCK TABLES `palabras` WRITE;
/*!40000 ALTER TABLE `palabras` DISABLE KEYS */;
INSERT INTO `palabras` VALUES (1,'abad','Dar verbo del imperfecto preterito'),(2,'abadia','Abadibi abodebeeeee, abadibi quiere decir te quiero amor. Gran canción del Chaval de la Peca'),(3,'abadesa','Dicese de cuando en una abadía se les pide a los monjes que elijan su cama. - Oye, ¿qué cama quieres? ¡¡Abad... esa!'),(4,'aceituna','Es la Española una aceituna como ninguna (que está rellena de rica anchoa)'),(5,'acatamiento','Acto de acatar. acataaaaa!!!!! Vease acatar, claro'),(6,'aceite','Líquido denso que se extrae de la aceituna. A veces puede perderse...'),(7,'abeja','Insecto que fabrica miel y cera. La más famosa fue Maya y la de Rumasa'),(8,'abotargado','Lo que ocurre después de comer de primero una fabes con almejas, luego un cachopo y de postre 8 filloas'),(9,'abolengo','Ascendencia de antepasados.. cuando se tiene mucho, es rancio'),(10,'acalabrotar','Aunque no lo parezca, es un término marítimo que indica un cabo de tres cordones compuesto de otros tres cada uno... sí.. ya sé.. que creía que era una palabrota..'),(11,'acatar','Irse de vinos o tapas. ¡Me voy acatar! Tambien puede decirse de un hombre o mujer cuando va por la noche a ver que pilla. ¡Voy ver acatar lo que pueda!'),(12,'abastos','Y a copas.. voy a lo que pueda... ¡¡¡A catar!!!');
/*!40000 ALTER TABLE `palabras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `ID` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `FIRSTNAME` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `LASTNAME` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES ('4','Antonio','Santos');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `apellido` varchar(25) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'Antonio','Santos XLVIII'),(2,'Bill','Gates XLIV'),(3,'Antonio','Santos XVII'),(4,'Bill','Gates XXXVIII');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` VALUES (1,'Antonio Santos'),(2,'Bill Gates');
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesores`
--

DROP TABLE IF EXISTS `profesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profesores` (
  `id` int(11) DEFAULT NULL,
  `tema_id` int(11) DEFAULT NULL,
  `nombre` varchar(40) COLLATE utf8_spanish_ci DEFAULT NULL,
  `apellido` varchar(40) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesores`
--

LOCK TABLES `profesores` WRITE;
/*!40000 ALTER TABLE `profesores` DISABLE KEYS */;
INSERT INTO `profesores` VALUES (1,1,'Erich','Gamma'),(2,1,'Antonio','Santos'),(3,1,'James','Gosling'),(4,2,'Rod','Johnson'),(5,2,'Grady','Booch'),(6,2,'Antonio','Santos');
/*!40000 ALTER TABLE `profesores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relacion_11_direccion`
--

DROP TABLE IF EXISTS `relacion_11_direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relacion_11_direccion` (
  `idDireccion` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `zipcode` int(5) NOT NULL,
  `city` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `persona_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`idDireccion`),
  KEY `FK_Persona_2` (`persona_id`),
  CONSTRAINT `FK_Persona_2` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relacion_11_direccion`
--

LOCK TABLES `relacion_11_direccion` WRITE;
/*!40000 ALTER TABLE `relacion_11_direccion` DISABLE KEYS */;
INSERT INTO `relacion_11_direccion` VALUES (28,'Calle XLII',29022,'Málaga',1),(29,'Calle I',1664,'Alava',2),(30,'Calle XXI',34132,'Palencia',3),(31,'Calle XXXVII',28220,'Madrid',4);
/*!40000 ALTER TABLE `relacion_11_direccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relacion_1n_telefono`
--

DROP TABLE IF EXISTS `relacion_1n_telefono`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relacion_1n_telefono` (
  `idTelefono` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `codigoPais` int(3) NOT NULL,
  `numero` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `persona_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`idTelefono`),
  KEY `FK_Persona` (`persona_id`),
  CONSTRAINT `FK_Persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relacion_1n_telefono`
--

LOCK TABLES `relacion_1n_telefono` WRITE;
/*!40000 ALTER TABLE `relacion_1n_telefono` DISABLE KEYS */;
INSERT INTO `relacion_1n_telefono` VALUES (1,'Movil',95,'623151515',1),(2,'Movil',76,'349350734',1),(3,'Movil',26,'784594310',2),(4,'Movil',78,'616940449',2),(5,'Movil',45,'215319084',3),(6,'Fijo',72,'181651351',3),(7,'Movil',10,'297345348',4),(8,'Fijo',57,'961140831',4);
/*!40000 ALTER TABLE `relacion_1n_telefono` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relacion_nm_carrito`
--

DROP TABLE IF EXISTS `relacion_nm_carrito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relacion_nm_carrito` (
  `id_carrito` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fecha_creacion` date DEFAULT NULL,
  PRIMARY KEY (`id_carrito`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relacion_nm_carrito`
--

LOCK TABLES `relacion_nm_carrito` WRITE;
/*!40000 ALTER TABLE `relacion_nm_carrito` DISABLE KEYS */;
INSERT INTO `relacion_nm_carrito` VALUES (1,'Carrito_1758','2010-03-21'),(2,'Carrito_2064','2008-09-19'),(3,'Carrito_269','2007-03-18'),(4,'Carrito_620','2009-09-12');
/*!40000 ALTER TABLE `relacion_nm_carrito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relacion_nm_carrito_producto`
--

DROP TABLE IF EXISTS `relacion_nm_carrito_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relacion_nm_carrito_producto` (
  `id_carrito` int(11) unsigned NOT NULL,
  `id_producto` int(11) unsigned NOT NULL,
  PRIMARY KEY (`id_carrito`,`id_producto`),
  KEY `FK_CARRITO_ID` (`id_carrito`),
  KEY `FK_PRODUCTO_ID` (`id_producto`),
  CONSTRAINT `FK_CARRITO_ID` FOREIGN KEY (`id_carrito`) REFERENCES `relacion_nm_carrito` (`id_carrito`),
  CONSTRAINT `FK_PRODUCTO_ID` FOREIGN KEY (`id_producto`) REFERENCES `relacion_nm_producto` (`id_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relacion_nm_carrito_producto`
--

LOCK TABLES `relacion_nm_carrito_producto` WRITE;
/*!40000 ALTER TABLE `relacion_nm_carrito_producto` DISABLE KEYS */;
INSERT INTO `relacion_nm_carrito_producto` VALUES (1,1),(2,2),(3,3),(3,4),(4,5),(4,6);
/*!40000 ALTER TABLE `relacion_nm_carrito_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relacion_nm_producto`
--

DROP TABLE IF EXISTS `relacion_nm_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relacion_nm_producto` (
  `id_producto` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `descripcion` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_producto`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relacion_nm_producto`
--

LOCK TABLES `relacion_nm_producto` WRITE;
/*!40000 ALTER TABLE `relacion_nm_producto` DISABLE KEYS */;
INSERT INTO `relacion_nm_producto` VALUES (1,'Producto_1747','aecenas nec maximus felis'),(2,'Producto_2176','. Maecenas nec maximus felis'),(3,'Producto_1946','us eu enim pulvinar auctor'),(4,'Producto_1820','a massa quis scelerisque'),(5,'Producto_428','sa quis scelerisque'),(6,'Producto_2406','etus eu enim pulvinar auctor');
/*!40000 ALTER TABLE `relacion_nm_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `temas`
--

DROP TABLE IF EXISTS `temas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `temas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(80) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `duracion` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `temas`
--

LOCK TABLES `temas` WRITE;
/*!40000 ALTER TABLE `temas` DISABLE KEYS */;
INSERT INTO `temas` VALUES (1,'Parte I - Java SE 7.0','2015-06-03',50),(2,'Parte II - Java EE 6.0','2015-06-03',70);
/*!40000 ALTER TABLE `temas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (16,'antonio','123','antonio@'),(17,'chiliwilly','456','chili@willy.com');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users2`
--

DROP TABLE IF EXISTS `users2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users2` (
  `uname` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `registeredon` date DEFAULT NULL,
  PRIMARY KEY (`uname`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users2`
--

LOCK TABLES `users2` WRITE;
/*!40000 ALTER TABLE `users2` DISABLE KEYS */;
INSERT INTO `users2` VALUES ('Antonio','t13','asd@asda.com','2013-12-11');
/*!40000 ALTER TABLE `users2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `webmaster`
--

DROP TABLE IF EXISTS `webmaster`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `webmaster` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `webmaster` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `email` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `website` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `mensaje` varchar(150) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `webmaster`
--

LOCK TABLES `webmaster` WRITE;
/*!40000 ALTER TABLE `webmaster` DISABLE KEYS */;
INSERT INTO `webmaster` VALUES (1,'Antonio','antoniosantosramos@gmail.com','www.increibleperocierto.es','Es buena gente'),(2,'Luis','luis@gmail.com','www','becario');
/*!40000 ALTER TABLE `webmaster` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-18 16:57:42
