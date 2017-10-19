-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Värd: 127.0.0.1
-- Tid vid skapande: 19 okt 2017 kl 13:19
-- Serverversion: 10.1.26-MariaDB
-- PHP-version: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Databas: `moviedatabase`
--

-- --------------------------------------------------------

--
-- Tabellstruktur `movies`
--

CREATE TABLE `movies` (
  `id` int(11) NOT NULL,
  `type` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `description` varchar(200) NOT NULL,
  `director` varchar(20) NOT NULL,
  `seasons` int(11) DEFAULT NULL,
  `episodes` int(11) DEFAULT NULL,
  `releasedate` varchar(10) NOT NULL,
  `length` int(11) DEFAULT NULL,
  `rating` float NOT NULL,
  `imdbrating` float NOT NULL,
  `imdb_link` varchar(200) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `movies`
--

INSERT INTO `movies` (`id`, `type`, `title`, `description`, `director`, `seasons`, `episodes`, `releasedate`, `length`, `rating`, `imdbrating`, `imdb_link`, `status`) VALUES
(1, 1, 'hej', 'hejdå', 'pelle', 10, 10, 'pelle', 180, 1.2, 1.2, 'http://www.imdb.com/title/tt0120737/?ref_=nv_sr_2', 1),
(2, 1, 'Blade Runner', 'blaablabsfjaslkdjlasjdlj', 'Ridley Scott', NULL, 0, '2017-10-09', 117, 8.2, 0, 'http://www.imdb.com/title/tt0083658/?ref_=nv_sr_2', 0),
(3, 1, 'askdj', 'salfjlkj', 'saljkfklj', NULL, NULL, 'asfsf', 120, 1.2, 4.3, 'asfsaf', 1),
(4, 1, 'SA', 'SDA', 'DD', NULL, NULL, 'IUJ', 120, 1.2, 1.3, 'DSDFFSD', 2),
(5, 1, 'lkjlkj', 'kkljl', 'kljl', NULL, NULL, 'kljlj', 123, 1.2, 1.2, '', 2),
(6, 1, 'kljkl', 'kljklj	', '.klj', 123, 123, 'asklfj', NULL, 1.2, 1.2, ',jk', 1),
(7, 1, 'pelle', 'pell', 'pell', NULL, NULL, 'eqkljkl', 123, 1.2, 1.2, '', 2),
(8, 1, 'Game of Thrones', 'Nine noble families fight for control over the mythical lands of Westeros, while a forgotten race returns after being dormant for thousands of years.', 'David Benioff', 7, 73, '2011', NULL, 9, 9.5, 'http://www.imdb.com/title/tt0944947/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2240084122&pf_rd_r=1JZMBZ7G9ZXXGWGQHHSX&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=tvmeter&ref_=chttvm_tt_1', 1),
(9, 1, 'sklfjklj', 'kljkljkl', 'kljkl', 2, 2, 'jkhkj', NULL, 9, 9, '', 2),
(10, 1, 'lukljklj', 'kljkljkl', '.lkl', 9, 9, 'kljkjk', NULL, 9, 9, 'ölklk', 2),
(11, 2, 'Game of Thrones', 'Nine noble families fight for control over the mythical lands of Westeros, while a forgotten race returns after being dormant for thousands of years.', 'David Benioff', 7, 73, '2011', NULL, 9, 9.5, 'http://www.imdb.com/title/tt0944947/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=2240084122&pf_rd_r=1JZMBZ7G9ZXXGWGQHHSX&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=tvmeter&ref_=chttvm_tt_1', 1),
(12, 1, 'Sagan om ringen: Härskarringen', 'A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle Earth from the Dark Lord Sauron.', 'Peter Jackson', NULL, NULL, '01-12-19', 178, 9, 8.8, 'http://www.imdb.com/title/tt0120737/?ref_=nv_sr_1', 1),
(13, 1, '', '', '', NULL, NULL, '', 0, 0, 0, '', 0),
(14, 2, '', '', '', 0, 0, '', NULL, 0, 0, '', 0),
(15, 1, '', '', '', NULL, NULL, '', 0, 0, 0, '', 0),
(16, 2, '', '', '', 0, 0, '', NULL, 0, 0, '', 0);

--
-- Index för dumpade tabeller
--

--
-- Index för tabell `movies`
--
ALTER TABLE `movies`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT för dumpade tabeller
--

--
-- AUTO_INCREMENT för tabell `movies`
--
ALTER TABLE `movies`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
