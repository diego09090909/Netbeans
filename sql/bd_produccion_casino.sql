-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-11-2025 a las 06:18:27
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
CREATE DATABASE IF NOT EXISTS bd_produccion_casino;
USE bd_produccion_casino;

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
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `id_producto` int(11) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text DEFAULT NULL,
  `tipo` enum('ACTIVO','CONSUMIBLE') NOT NULL,
  `stock_actual` int(11) NOT NULL DEFAULT 0,
  `stock_minimo` int(11) NOT NULL DEFAULT 0,
  `ubicacion` varchar(100) DEFAULT NULL,
  `fecha_registro` timestamp NOT NULL DEFAULT current_timestamp(),
  `estado` enum('DISPONIBLE','AGOTADO','INACTIVO') DEFAULT 'DISPONIBLE'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario_activos`
--

CREATE TABLE `inventario_activos` (
  `id_activo` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `marca` varchar(100) DEFAULT NULL,
  `modelo` varchar(100) DEFAULT NULL,
  `numero_serie` varchar(100) DEFAULT NULL,
  `fecha_adquisicion` date DEFAULT NULL,
  `valor_inicial` decimal(10,2) DEFAULT NULL,
  `vida_util` int(11) DEFAULT NULL,
  `responsable` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario_consumibles`
--

CREATE TABLE `inventario_consumibles` (
  `id_consumible` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `unidad_medida` varchar(30) DEFAULT NULL,
  `costo_unitario` decimal(10,2) DEFAULT NULL,
  `fecha_vencimiento` date DEFAULT NULL,
  `proveedor` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `minutas`
--

CREATE TABLE `minutas` (
  `id_minuta` int(11) NOT NULL,
  `tipo` enum('DIARIA','MENSUAL') NOT NULL,
  `fecha` date NOT NULL,
  `nombre` varchar(150) DEFAULT NULL,
  `descripcion` text DEFAULT NULL,
  `fecha_creacion` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `minuta_detalle`
--

CREATE TABLE `minuta_detalle` (
  `id_detalle` int(11) NOT NULL,
  `id_minuta` int(11) NOT NULL,
  `comida` enum('DESAYUNO','ALMUERZO','CENA','COLACION','ONCE') NOT NULL,
  `plato_principal` varchar(200) NOT NULL,
  `acompanamiento` varchar(200) DEFAULT NULL,
  `postre` varchar(200) DEFAULT NULL,
  `bebida` varchar(200) DEFAULT NULL,
  `observaciones` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `minuta_detalle_ingredientes`
--

CREATE TABLE `minuta_detalle_ingredientes` (
  `id_ingrediente` int(11) NOT NULL,
  `id_detalle` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `cantidad` decimal(10,2) NOT NULL,
  `unidad_medida` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `ingresoUsuario` varchar(30) DEFAULT NULL,
  `ingresoContrasenia` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `ingresoUsuario`, `ingresoContrasenia`) VALUES
(1, 'admin', '1234'),
(2, 'kevin', '1234');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`rut`);

--
-- Indices de la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`id_producto`),
  ADD UNIQUE KEY `codigo` (`codigo`);

--
-- Indices de la tabla `inventario_activos`
--
ALTER TABLE `inventario_activos`
  ADD PRIMARY KEY (`id_activo`),
  ADD UNIQUE KEY `numero_serie` (`numero_serie`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `inventario_consumibles`
--
ALTER TABLE `inventario_consumibles`
  ADD PRIMARY KEY (`id_consumible`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `minutas`
--
ALTER TABLE `minutas`
  ADD PRIMARY KEY (`id_minuta`);

--
-- Indices de la tabla `minuta_detalle`
--
ALTER TABLE `minuta_detalle`
  ADD PRIMARY KEY (`id_detalle`),
  ADD KEY `id_minuta` (`id_minuta`);

--
-- Indices de la tabla `minuta_detalle_ingredientes`
--
ALTER TABLE `minuta_detalle_ingredientes`
  ADD PRIMARY KEY (`id_ingrediente`),
  ADD KEY `id_detalle` (`id_detalle`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `inventario`
--
ALTER TABLE `inventario`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `inventario_activos`
--
ALTER TABLE `inventario_activos`
  MODIFY `id_activo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `inventario_consumibles`
--
ALTER TABLE `inventario_consumibles`
  MODIFY `id_consumible` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `minutas`
--
ALTER TABLE `minutas`
  MODIFY `id_minuta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `minuta_detalle`
--
ALTER TABLE `minuta_detalle`
  MODIFY `id_detalle` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `minuta_detalle_ingredientes`
--
ALTER TABLE `minuta_detalle_ingredientes`
  MODIFY `id_ingrediente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inventario_activos`
--
ALTER TABLE `inventario_activos`
  ADD CONSTRAINT `inventario_activos_ibfk_1` FOREIGN KEY (`id_producto`) REFERENCES `inventario` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `inventario_consumibles`
--
ALTER TABLE `inventario_consumibles`
  ADD CONSTRAINT `inventario_consumibles_ibfk_1` FOREIGN KEY (`id_producto`) REFERENCES `inventario` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `minuta_detalle`
--
ALTER TABLE `minuta_detalle`
  ADD CONSTRAINT `minuta_detalle_ibfk_1` FOREIGN KEY (`id_minuta`) REFERENCES `minutas` (`id_minuta`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `minuta_detalle_ingredientes`
--
ALTER TABLE `minuta_detalle_ingredientes`
  ADD CONSTRAINT `minuta_detalle_ingredientes_ibfk_1` FOREIGN KEY (`id_detalle`) REFERENCES `minuta_detalle` (`id_detalle`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `minuta_detalle_ingredientes_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `inventario` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
