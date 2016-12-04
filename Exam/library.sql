-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Ноя 01 2014 г., 13:21
-- Версия сервера: 5.6.20
-- Версия PHP: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `library`
--

-- --------------------------------------------------------

--
-- Структура таблицы `book`
--

CREATE TABLE IF NOT EXISTS `book` (
`idbook` int(10) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `author` varchar(100) DEFAULT NULL,
  `categorybook` varchar(255) DEFAULT NULL,
  `releasedate` date NOT NULL,
  `price` decimal(20,0) DEFAULT NULL,
  `surnamebook` int(10) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Дамп данных таблицы `book`
--

INSERT INTO `book` (`idbook`, `title`, `description`, `author`, `categorybook`, `releasedate`, `price`, `surnamebook`) VALUES
(1, 'English Grammar', 'English Grammar in Use Fourth Edition is an updated version of the best-selling grammar title.', 'Raymond Murphy', 'english', '2011-05-10', '12000', 1),
(2, 'Effective Java', 'Are you looking for a deeper understanding of the Java', 'Joshua Bloch', 'computer', '2012-06-20', '6000', 2),
(3, 'The Chefs Companion', 'The indispensable guide to over 5000 culinary terms', 'Elizabeth Riely', 'cookery', '2013-01-28', '9000', 3);

-- --------------------------------------------------------

--
-- Структура таблицы `user`
--

CREATE TABLE IF NOT EXISTS `user` (
`iduser` int(10) NOT NULL,
  `first` varchar(100) DEFAULT NULL,
  `surnameuser` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Дамп данных таблицы `user`
--

INSERT INTO `user` (`iduser`, `first`, `surnameuser`, `email`, `password`) VALUES
(1, 'Sergey', 'Kuleshov', 'SergeyKuleshov@gmail.com', '12345'),
(2, 'Nikolai', 'Svirid', 'NikolaiSvirid@gmail.com', '54321'),
(3, 'Oleg', 'Provado', 'OlegProvado@gmail.com', '67890');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
 ADD PRIMARY KEY (`idbook`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`iduser`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
MODIFY `idbook` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
MODIFY `iduser` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
