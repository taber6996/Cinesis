-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 28-05-2018 a las 19:35:06
-- Versión del servidor: 5.6.35
-- Versión de PHP: 7.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cinesis`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrada`
--

CREATE TABLE `entrada` (
  `id` int(11) NOT NULL,
  `sala_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `pelicula_id` int(11) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  `numeroAsiento` varchar(5) DEFAULT NULL,
  `horario` varchar(30) DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `entrada`
--

INSERT INTO `entrada` (`id`, `sala_id`, `user_id`, `pelicula_id`, `precio`, `numeroAsiento`, `horario`, `updated_at`, `created_at`) VALUES
(2, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:34:27', NULL),
(3, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:31:54', NULL),
(4, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:34:39', NULL),
(5, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:34:39', NULL),
(6, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:34:39', '2018-05-27 22:46:16'),
(7, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:34:39', '2018-05-27 22:46:26'),
(8, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:34:39', '2018-05-27 22:48:30'),
(9, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:34:39', '2018-05-27 22:48:33'),
(10, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:34:39', '2018-05-27 22:48:37'),
(11, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:34:39', '2018-05-27 22:48:54'),
(12, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:34:39', '2018-05-27 22:49:03'),
(13, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:34:39', '2018-05-27 22:50:38'),
(14, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:34:39', '2018-05-27 22:51:48'),
(15, 6, NULL, 3, 123, '123', '13', '2018-05-28 17:34:39', '2018-05-27 22:51:58'),
(17, 6, NULL, 3, 111, '11', '111', '2018-05-28 17:34:39', '2018-05-28 13:30:46'),
(18, 6, NULL, 3, 9999, '999', '9999', '2018-05-28 17:34:39', '2018-05-28 13:32:53');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas`
--

CREATE TABLE `peliculas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `slug` varchar(200) NOT NULL,
  `duracion` int(11) DEFAULT NULL,
  `imagen_principal` longtext,
  `imagen_secundario` text,
  `sinopsis` text,
  `calificacion` int(11) DEFAULT NULL,
  `categoria` varchar(100) DEFAULT NULL,
  `pais` varchar(100) DEFAULT NULL,
  `estreno` varchar(50) DEFAULT NULL,
  `director` varchar(100) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `peliculas`
--

INSERT INTO `peliculas` (`id`, `nombre`, `slug`, `duracion`, `imagen_principal`, `imagen_secundario`, `sinopsis`, `calificacion`, `categoria`, `pais`, `estreno`, `director`, `updated_at`, `created_at`) VALUES
(3, 'num uno', 'num-uno', 11, '1200x600', '1200x600', 'num unonum unonum unonum unonum uno', 11, 'COMEDIA', 'num uno', '2018-05-26 00:00:00', 'num uno', '2018-05-26 22:39:35', NULL),
(4, 'titulo', 'slug', 120, '1200x600', '1200x600', 'asdasd asd asd asd asd as', 2, 'HORROR', 'esp', '2018-05-26', 'alejandro', '0000-00-00 00:00:00', NULL),
(5, 'titulo', 'slug', 120, '1200x600', '1200x600', 'asdasd asd asd asd asd as', 2, 'HORROR', 'esp', '2018-05-26', 'alejandro', '0000-00-00 00:00:00', NULL),
(6, 'titulo', 'slug', 120, '1200x600', '1200x600', 'asdasd asd asd asd asd as', 2, 'HORROR', 'esp', '2018-05-26', 'alejandro', '0000-00-00 00:00:00', NULL),
(7, 'titulo', 'titulo', 1, '1200x600', '1200x600', 'asdas dasd asd as d', 2, 'HORROR', 'es', '2018-05-27', 'dire', '0000-00-00 00:00:00', NULL),
(8, 'titulo', 'titulo', 1, '1200x600', '1200x600', 'asdas dasd asd as d', 2, 'HORROR', 'es', '2018-05-27', 'dire', '0000-00-00 00:00:00', '2018-05-26 22:44:41'),
(9, 'titulo', 'titulo', 1, '1200x600', '1200x600', 'asdas dasd asd as d', 2, 'HORROR', 'es', '2018-05-27', 'dire', '0000-00-00 00:00:00', '2018-05-26 22:44:47'),
(10, 'titulo', 'titulo', 1, '1200x600', '1200x600', 'asdas dasd asd as d', 2, 'HORROR', 'es', '2018-05-27', 'dire', '0000-00-00 00:00:00', '2018-05-26 22:44:58'),
(11, 'tsadsad', 'tsadsad', 11, '1200x600', '1200x600', 'asd as das d', 11, 'HORROR', 'sasdasd', '2018-05-03', 'sadasd', '0000-00-00 00:00:00', '2018-05-27 19:34:29'),
(12, '1111', '1111', 1313, '1200x600', '1200x600', '123123123123', 1232, 'HORROR', '123', '2018-05-31', '123123', '0000-00-00 00:00:00', '2018-05-27 20:20:56'),
(13, 'nueva', 'nueva', 123123, '1250x625', '1250x625', 'asdasdasdasd', 132123, 'HORROR', '123', '2018-05-03', 'dire', '0000-00-00 00:00:00', '2018-05-27 22:01:17'),
(14, 'nueva', 'nueva', 123123, '1250x625', '1250x625', 'asdasdasdasd', 132123, 'HORROR', '123', '2018-05-03', 'dire', '0000-00-00 00:00:00', '2018-05-27 22:01:45'),
(15, '213', '213', 123, '1200x600', '1200x600', '123123', 123, 'HORROR', '123', '2018-05-28', '123', '0000-00-00 00:00:00', '2018-05-28 17:15:21');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sala`
--

CREATE TABLE `sala` (
  `id` int(11) NOT NULL,
  `num_filas` int(11) DEFAULT NULL,
  `num_columnas` int(11) DEFAULT NULL,
  `num_asientos_vip` int(11) DEFAULT NULL,
  `num_asientos_minusvalidos` int(11) DEFAULT NULL,
  `calidad_sonido` varchar(100) DEFAULT NULL,
  `3d` tinyint(1) DEFAULT '1',
  `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `sala`
--

INSERT INTO `sala` (`id`, `num_filas`, `num_columnas`, `num_asientos_vip`, `num_asientos_minusvalidos`, `calidad_sonido`, `3d`, `updated_at`, `created_at`) VALUES
(6, 123, 123, 123, 123, 'ESTEREO', 0, '2018-05-27 22:03:31', NULL),
(7, 23123, 123123, 123123, 123123, 'ESTEREO', 0, '2018-05-28 12:43:36', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trailers`
--

CREATE TABLE `trailers` (
  `id` int(11) NOT NULL,
  `pelicula_id` int(11) DEFAULT NULL,
  `titulo` varchar(200) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `trailers`
--

INSERT INTO `trailers` (`id`, `pelicula_id`, `titulo`, `descripcion`, `updated_at`, `created_at`) VALUES
(1, 12, 'asdasd', 'asdasd', '0000-00-00 00:00:00', NULL),
(2, 8, 'asdasd', 'asdasd', '0000-00-00 00:00:00', NULL),
(3, 8, 'asdasd', 'asdasd', '0000-00-00 00:00:00', NULL),
(4, 8, 'asdasd', 'asdasd', '0000-00-00 00:00:00', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `rol` varchar(100) DEFAULT NULL,
  `nombre` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `telefono` varchar(14) DEFAULT NULL,
  `password` varchar(300) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`id`, `rol`, `nombre`, `email`, `telefono`, `password`, `updated_at`, `created_at`) VALUES
(1, '1', 'User', 'user@user.com', '911111111', '1234', '0000-00-00 00:00:00', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `entrada`
--
ALTER TABLE `entrada`
  ADD PRIMARY KEY (`id`),
  ADD KEY `sala_id` (`sala_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `entrada_pelicula_id` (`pelicula_id`);

--
-- Indices de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `slug` (`slug`),
  ADD KEY `categoria` (`categoria`);

--
-- Indices de la tabla `sala`
--
ALTER TABLE `sala`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `trailers`
--
ALTER TABLE `trailers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pelicula_id` (`pelicula_id`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `entrada`
--
ALTER TABLE `entrada`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `sala`
--
ALTER TABLE `sala`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `trailers`
--
ALTER TABLE `trailers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `entrada`
--
ALTER TABLE `entrada`
  ADD CONSTRAINT `entrada_pelicula_id` FOREIGN KEY (`pelicula_id`) REFERENCES `peliculas` (`id`) ON DELETE SET NULL,
  ADD CONSTRAINT `entrada_sala_id` FOREIGN KEY (`sala_id`) REFERENCES `sala` (`id`) ON DELETE SET NULL,
  ADD CONSTRAINT `entrada_user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE SET NULL;

--
-- Filtros para la tabla `trailers`
--
ALTER TABLE `trailers`
  ADD CONSTRAINT `trailer_pelicula_id` FOREIGN KEY (`pelicula_id`) REFERENCES `peliculas` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
