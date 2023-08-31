-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1:3306
-- Время создания: Авг 31 2023 г., 15:43
-- Версия сервера: 10.3.22-MariaDB
-- Версия PHP: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `news_site`
--

-- --------------------------------------------------------

--
-- Структура таблицы `client`
--

CREATE TABLE `client` (
  `id` bigint(20) NOT NULL,
  `mobile_number` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `text` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `client`
--

INSERT INTO `client` (`id`, `mobile_number`, `name`, `text`, `date`) VALUES
(1, 'dfg', 'adg', 'dfg', NULL),
(2, '5465', 'арпва', 'вапрыв', NULL),
(4, 'arf', 'af', 'asfs', '2022-06-23'),
(5, 'sdfh', 'sdh', 'dsfh', '2022-06-23'),
(6, '', '', '', '2022-06-24'),
(7, '5765', 'fd', '45645', '2022-06-24'),
(8, '435', '', 'sdfg', '2022-06-24'),
(9, '', 'Никита', '', '2022-06-24'),
(10, '', '', '', '2022-06-24'),
(11, '+7 999 000 00 00', 'dfg', '', '2022-06-24'),
(12, '+7 000 000 00 000', 'saf', '', '2022-06-24'),
(13, 'safasdf', 'asfg', '', '2022-06-24'),
(14, 'sgddg', 'dg', '', '2022-06-24'),
(15, '+7999999999999', 'sdgda', '', '2022-06-24'),
(16, '+700000000', 'wEFWE', '', '2022-06-24'),
(17, '78758', 'Никита', 'gkghk', '2022-08-02'),
(18, '88888', 'wfw', 'wefwef', '2022-10-07'),
(19, '54645', 'aeges', 'sdghdsf', '2022-10-26'),
(20, '5456', 'rgbr', 'fgbghb', '2022-10-26'),
(21, '234234', 'вфава', 'ывапва', NULL);

-- --------------------------------------------------------

--
-- Структура таблицы `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(14);

-- --------------------------------------------------------

--
-- Структура таблицы `news`
--

CREATE TABLE `news` (
  `id` bigint(20) NOT NULL,
  `anons` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `full_text` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `views` int(11) NOT NULL,
  `date_news` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `news`
--

INSERT INTO `news` (`id`, `anons`, `full_text`, `title`, `views`, `date_news`) VALUES
(6, 'Anons news!!!!efewfe', 'TExt news new', 'NewrgergSERGERG123ddddd', 0, '2022-06-01 21:00:00'),
(7, 'Анонс новости', 'ТУт текст новости который нужен', 'Новость', 0, '2022-06-01 21:00:00'),
(10, 'agerag', 'reagera', 'dagdag', 0, '2022-05-31 21:00:00'),
(13, 'RTHRTH', 'RTHRTH', 'WEGSRH', 0, '2022-06-01 21:00:00'),
(14, 'фукп', 'уфкп', 'фукп', 0, '2022-06-01 21:00:00'),
(15, 'aerg', 'shsr', 'hrth', 12, NULL),
(16, 'rthrt', 'rht', 'rth', 0, NULL),
(17, 'aege', 'greg', 'erg', 12, '2022-10-25 13:22:44'),
(18, 'fsavf', 'sadv', 'sfs', 0, NULL),
(19, '1111111', '11111111', '11111111', 0, NULL),
(20, 'пку', 'пкуп131231', 'фпуф', 0, NULL);

-- --------------------------------------------------------

--
-- Структура таблицы `price`
--

CREATE TABLE `price` (
  `id` bigint(20) NOT NULL,
  `full_text` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `price` bigint(20) NOT NULL,
  `text` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `price`
--

INSERT INTO `price` (`id`, `full_text`, `price`, `text`) VALUES
(1, 'Описание услуги ', 1, 'Услуга1'),
(2, 'Jgbcfybt jgbcfybt jgbcfybt', 2, 'Услуга23'),
(3, '213124', 1243213, '13214'),
(4, '24214', 124214, '241241'),
(5, '124', 2131, '13'),
(6, 'sfhsh', 34534, 'sdgsrgh'),
(7, 'eage', 34423, 'sdfhsdfg'),
(8, '3453', 345235, '2353'),
(9, 'srg', 456456, 'eag'),
(10, '23423', 23423, '24234'),
(11, 'dgd', 12321, '13'),
(12, 'Плита', 100, 'ПГП 100');

-- --------------------------------------------------------

--
-- Структура таблицы `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `login` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `mobile_number` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `role` text COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `password_2` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `modify_date` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `user`
--

INSERT INTO `user` (`id`, `login`, `password`, `mobile_number`, `role`, `password_2`, `modify_date`) VALUES
(1, 'user', 'pass', NULL, 'USER', NULL, '2022-12-23'),
(2, 'user@mail.ru', 'pass,1214', '86786786', '0', NULL, '2022-12-23'),
(3, 'user@mail.ru', 'pass,23423', '45654645', '0', NULL, '2022-12-23'),
(4, 'user@mail.ru', 'pass,14321', '1232131', '0', NULL, '2022-12-23'),
(5, 'user@mail.ru', 'pass,43545', '432534543', '0', NULL, '2022-12-23'),
(6, 'user@mail.ru', 'pass,2323423', '23432423', '0', NULL, '2022-12-23'),
(7, 'user@mail.ru', 'pass,345435', '345435', '0', NULL, '2022-12-23'),
(8, 'user@mail.ru', 'pass,wefew', '43543534', '0', NULL, '2022-12-23'),
(9, 'user@mail.ru', 'pass,dfgg', '3454353', 'USER', NULL, '2022-12-23'),
(10, 'user@mail.ru', 'pass,223523', '23423423', 'USER', NULL, '2022-12-23'),
(11, 'user@mail.ru', 'pass,585', '56868', 'USER', NULL, '2022-12-23'),
(12, 'user@mail.ru', 'pass,wwefew', '43543534', 'USER', NULL, '2022-12-23'),
(13, 'user@mail.ru', 'pass,25345', '63453', 'USER', NULL, '2022-12-23'),
(14, 'user@mail.ru', 'pass,534543', '435345', 'USER', NULL, '2022-12-09'),
(15, 'user@mail.ru', 'pass,345435', '345345', 'USER', NULL, '2022-12-16'),
(16, 'user@mail.ru', 'pass,34535', '34534', 'USER', NULL, '2022-12-20'),
(17, 'user12@mail.ru', '123', '123', 'USER', NULL, '2022-12-23'),
(18, 'user12@mail.ru', '22', '22', 'USER', NULL, '2022-12-23'),
(19, 'user12@mail.ru', '11', '11', 'USER', NULL, '2022-12-23'),
(20, 'user12@mail.ru', '22', '22', 'USER', NULL, '2022-12-23'),
(21, 'user12@mail.ru', '22', '33', 'USER', NULL, '2022-12-23');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `price`
--
ALTER TABLE `price`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `client`
--
ALTER TABLE `client`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT для таблицы `news`
--
ALTER TABLE `news`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT для таблицы `price`
--
ALTER TABLE `price`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT для таблицы `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
