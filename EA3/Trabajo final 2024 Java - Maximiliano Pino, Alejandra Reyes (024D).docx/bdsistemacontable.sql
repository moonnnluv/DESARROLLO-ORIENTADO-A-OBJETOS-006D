-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-12-2024 a las 04:13:26
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdsistemacontable`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `idEmpresa` int(11) NOT NULL,
  `rut` varchar(15) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `giro` varchar(100) NOT NULL,
  `comuna` varchar(50) NOT NULL,
  `estado` int(11) NOT NULL,
  `mes` int(11) NOT NULL,
  `anio` int(11) NOT NULL,
  `idRepresentante` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`idEmpresa`, `rut`, `nombre`, `giro`, `comuna`, `estado`, `mes`, `anio`, `idRepresentante`) VALUES
(1, '77597027-8', 'NILO E HIJO LIMITADA','ACTIVIDADES ARTÍSTICAS, DE ENTRETENIMIENTO Y RECREATIVAS', 'Santiago', 1, 07, 2022, 1),
(2, '77631815-9','ECO SPACIO LUAR SpA', 'ACTIVIDADES DE ATENCIÓN DE LA SALUD HUMANA Y DE ASISTENCIA SOCIAL', 'Santiago', 1, 09, 2022, 2),
(3, '77594941-4','CHUCAW SpA','ACTIVIDADES PROFESIONALES, CIENTIFICAS Y TÉCNICAS','Santiago ', 1, 07, 2022, 3),
(4, '77500261-1','DISEÑOS Y TEXTILES MONICA ANDREA DURAN MILLABUR E.I.R.L.','ACTIVIDADES PROFESIONALES, CIENTIFICAS Y TÉCNICAS','Santiago', 1,  01, 2022, 4),
(5, '77594169-3','INGENIERIA Y DESARROLLO DE ALIMENTOS EXTRUIDOS SPA','ACTIVIDADES PROFESIONALES, CIENTIFICAS Y TÉCNICAS', 'Santiago', 1, 07, 2022, 5),
(6,'77650274-K', 'COMERCIALIZADORA Y LOGISTICA PARTYPLAY SPA', 'COMERCIO AL POR MAYOR Y AL POR MENOR', 'Santiago', 1,10, 2022,6),
(7, '77570636-8','CORPORACION MAF SpA',  'COMERCIO AL POR MAYOR Y AL POR MENOR', 'Santiago', 1, 05, 2022,7),
(8, '77485906-3','NATIONAL SPORT SPA',  'COMERCIO AL POR MAYOR Y AL POR MENOR', 'Santiago', 1 ,11, 2021,8),
(9, '77227304-5','SOCIEDAD COMERCIAL MATIZA SPA', 'COMERCIO AL POR MAYOR Y AL POR MENOR','Santiago', 1,09, 2020,9),
(10, '77153408-2','VIPA ESTRUCTURAS Y PUBLICIDAD SPA', 'CONSTRUCCIÓN', 'Santiago', 1,  05, 2020, 10),
(11, '77550678-4','CNC COMPANY SpA', 'INDUSTRIA MANUFACTURERA', 'Santiago', 1,   03, 2022, 11),
(12, '77564269-6','CEJITAS.CL SpA',  'OTRAS ACTIVIDADES DE SERVICIOS',  'Santiago', 1,  05, 2022, 12),
(13, '77574183-K','MABE FERNANDEZ STUDIO SpA',   'OTRAS ACTIVIDADES DE SERVICIOS','Santiago',1,05, 2022, 13),
(14, '77606502-1','COMERCIALIZADORA VC HNOS. SpA',  'REPARACIÓN DE VEHICULOS AUTOMOTORES Y MOTOCICLETAS','Santiago', 1,  07, 2022,14),
(15, '77284194-9','ALMACENES Y COMERCIALIZADORA DE PRODUCTOS CONGELADOS FERNÁNDEZ SpA',   'COMERCIO AL POR MAYOR Y AL POR MENOR','Santiago',1, 01, 2021, 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `representante`
--

CREATE TABLE `representante` (
  `idRepresentante` int(11) NOT NULL,
  `rut` varchar(15) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `nacionalidad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `representante`
--

INSERT INTO `representante` (`idRepresentante`,`rut`, `nombre`, `nacionalidad`) VALUES
(1, '13712932-9', 'Adrián', 'Chilena'),
(2, '13564581-8', 'Katherine', 'Chilena'),
(3, '13465410-4', 'Francisco', 'Chilena'),
(4, '14165750-K', 'Monica', 'Chilena'),
(5, '12123105-0', 'Alex', 'Chilena'),
(6, '15121466-5', 'Felipe', 'Chilena'),
(7, '26954368-K', 'Anderson', 'Extranjera'),
(8, '13030013-8', 'Marcelo', 'Chilena'),
(9, '17600364-2', 'Cristobal', 'Chilena'),
(10, '18929386-0', 'Juan', 'Chilena'),
(11, '17672980-5', 'Luciano', 'Chilena'),
(12, '26266134-2', 'Johanna', 'Extranjera'),
(13, '15775579-K', 'Mabel', 'Chilena'),
(14, '21564891-5', 'Miguel', 'Extranjera'),
(15, '16930757-1', 'Esteban', 'Chilena');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`idEmpresa`),
  ADD UNIQUE KEY `rut` (`rut`),
  ADD KEY `idRepresentante` (`idRepresentante`);

--
-- Indices de la tabla `representante`
--
ALTER TABLE `representante`
  ADD PRIMARY KEY (`idRepresentante`),
  ADD UNIQUE KEY `rut` (`rut`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empresa`
--
ALTER TABLE `empresa`
  MODIFY `idEmpresa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `representante`
--
ALTER TABLE `representante`
  MODIFY `idRepresentante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD CONSTRAINT `empresa_ibfk_1` FOREIGN KEY (`idRepresentante`) REFERENCES `representante` (`idRepresentante`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
