-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-11-2025 a las 16:32:35
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_produccion_casino`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `rut` varchar(20) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `fono_fijo` varchar(20) NOT NULL,
  `direccion` varchar(20) NOT NULL,
  `cant_empleado` int(11) NOT NULL,
  `cant_casino` int(11) NOT NULL,
  `contrato_indefinido` tinyint(1) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_termino` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`rut`, `nombre`, `fono_fijo`, `direccion`, `cant_empleado`, `cant_casino`, `contrato_indefinido`, `fecha_inicio`, `fecha_termino`) VALUES
('12238821-2', 'ronalcito', '3123', 'PEO', 0, 0, 1, '1984-10-10', NULL),
('20332540-4', 'pompi', '3123', 'diego', 0, 0, 0, '1999-09-09', '0009-09-09');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventariodeactivos`
--

CREATE TABLE `inventariodeactivos` (
  `id_producto` varchar(20) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` int(11) NOT NULL,
  `tipo_activo` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`rut`);

--
-- Indices de la tabla `inventariodeactivos`
--
ALTER TABLE `inventariodeactivos`
  ADD PRIMARY KEY (`id_producto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
