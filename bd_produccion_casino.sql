-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-11-2025 a las 21:10:00
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
-- Crear y seleccionar la base de datos
--
CREATE DATABASE IF NOT EXISTS `bd_produccion_casino` CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bd_produccion_casino`;

-- --------------------------------------------------------
-- Tabla minuta
-- --------------------------------------------------------
DROP TABLE IF EXISTS `minuta`;
CREATE TABLE `minuta` (
  `id_minuta` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_minuta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
-- Tabla minuta_detalle
-- --------------------------------------------------------
DROP TABLE IF EXISTS `minuta_detalle`;
CREATE TABLE `minuta_detalle` (
  `id_detalle` INT(11) NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
-- Tabla detalle_ingrediente
-- --------------------------------------------------------
DROP TABLE IF EXISTS `detalle_ingrediente`;
CREATE TABLE `detalle_ingrediente` (
  `id_ingrediente` INT(11) NOT NULL AUTO_INCREMENT,
  `id_minuta` INT(11) NOT NULL,
  `id_detalle` INT(11) NOT NULL,
  `cantidad` INT(11) NOT NULL,
  `unidad_medida` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_ingrediente`),
  KEY `id_minuta` (`id_minuta`),
  KEY `id_detalle` (`id_detalle`),
  CONSTRAINT `detalle_ingrediente_ibfk_1` FOREIGN KEY (`id_minuta`) REFERENCES `minuta` (`id_minuta`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `detalle_ingrediente_ibfk_2` FOREIGN KEY (`id_detalle`) REFERENCES `minuta_detalle` (`id_detalle`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
-- Tabla inventario
-- --------------------------------------------------------
DROP TABLE IF EXISTS `inventario`;
CREATE TABLE `inventario` (
  `id_producto` INT(11) NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(50) NOT NULL,
  `nombre` VARCHAR(100) NOT NULL,
  `descripcion` VARCHAR(255) DEFAULT NULL,
  `tipo` VARCHAR(50) NOT NULL,
  `stock_actual` INT(11) NOT NULL,
  `stock_minimo` INT(11) NOT NULL,
  `ubicacion` VARCHAR(100) DEFAULT NULL,
  `estado` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_producto`),
  UNIQUE KEY `codigo` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
-- Tabla empresa
-- --------------------------------------------------------
DROP TABLE IF EXISTS `empresa`;
CREATE TABLE `empresa` (
  `rut` VARCHAR(12) NOT NULL,
  `nombre` VARCHAR(100) NOT NULL,
  `fono_fijo` VARCHAR(20) DEFAULT NULL,
  `direccion` VARCHAR(255) DEFAULT NULL,
  `cant_empleado` INT(11) NOT NULL,
  `cant_casino` INT(11) NOT NULL,
  `contrato_indefinido` TINYINT(1) NOT NULL,
  `fecha_inicio` DATE NOT NULL,
  `fecha_termino` DATE DEFAULT NULL,
  PRIMARY KEY (`rut`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
-- Tabla usuario
-- --------------------------------------------------------
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `id_usuario` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  `contrasenia` INT(11) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
-- Tabla contrato
-- --------------------------------------------------------
DROP TABLE IF EXISTS `contrato`;
CREATE TABLE `contrato` (
  `id_contrato` INT(11) NOT NULL AUTO_INCREMENT,
  `rut` VARCHAR(12) NOT NULL,
  `nombre` VARCHAR(100) NOT NULL,
  `fecha_inicio` DATE NOT NULL,
  `fecha_termino` DATE DEFAULT NULL,
  `tipo_horario` VARCHAR(50) NOT NULL,
  `sueldo` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`id_contrato`),
  KEY `rut` (`rut`),
  CONSTRAINT `contrato_ibfk_1` FOREIGN KEY (`rut`) REFERENCES `empresa` (`rut`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
-- Datos de ejemplo
-- --------------------------------------------------------
INSERT INTO `minuta` (`nombre`) VALUES ('Minuta de prueba');
INSERT INTO `minuta_detalle` (`descripcion`) VALUES ('Detalle de prueba');
INSERT INTO `detalle_ingrediente` (`id_minuta`, `id_detalle`, `cantidad`, `unidad_medida`)
VALUES (1, 1, 60, 'Gramo');

INSERT INTO `inventario` (`codigo`, `nombre`, `descripcion`, `tipo`, `stock_actual`, `stock_minimo`, `ubicacion`, `estado`)
VALUES 
('P001', 'Arroz', 'Arroz grano largo', 'Alimento', 100, 20, 'Bodega A1', 'Activo'),
('P002', 'Aceite', 'Aceite vegetal 1L', 'Alimento', 50, 10, 'Bodega A2', 'Activo');

INSERT INTO `empresa` (`rut`, `nombre`, `fono_fijo`, `direccion`, `cant_empleado`, `cant_casino`, `contrato_indefinido`, `fecha_inicio`, `fecha_termino`)
VALUES 
('76.123.456-7', 'Casino S.A.', '322345678', 'Av. Principal 123, Viña del Mar', 200, 3, 1, '2020-01-01', NULL);

INSERT INTO `usuario` (`nombre`, `contrasenia`)
VALUES 
('admin', 1234),
('usuario1', 5678);

INSERT INTO `contrato` (`rut`, `nombre`, `fecha_inicio`, `fecha_termino`, `tipo_horario`, `sueldo`)
VALUES 
('76.123.456-7', 'Juan Pérez', '2021-03-01', NULL, 'Tiempo completo', 850000.00);

COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
 /*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
 /*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;