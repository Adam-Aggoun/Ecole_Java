-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Dim 21 Mars 2021 à 21:10
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `ecole_java`
--

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

CREATE TABLE IF NOT EXISTS `classe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(30) NOT NULL,
  `Effectif` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Contenu de la table `classe`
--

INSERT INTO `classe` (`id`, `Nom`, `Effectif`) VALUES
(1, 'STI2D', 30),
(2, 'S', 20),
(3, 'BN', 15),
(4, 'SISR', 30),
(5, 'STMG', 25);

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

CREATE TABLE IF NOT EXISTS `compte` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(40) COLLATE utf8_bin NOT NULL,
  `Prenom` varchar(40) COLLATE utf8_bin NOT NULL,
  `Email` varchar(40) COLLATE utf8_bin NOT NULL,
  `Classe` varchar(40) COLLATE utf8_bin NOT NULL,
  `Mdp` varchar(40) COLLATE utf8_bin NOT NULL,
  `Rôle` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Nom` (`Nom`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=4 ;

--
-- Contenu de la table `compte`
--

INSERT INTO `compte` (`id`, `Nom`, `Prenom`, `Email`, `Classe`, `Mdp`, `Rôle`) VALUES
(1, 'a', 'a', 'a@a', 'STI2D', 'a', 'Professeur'),
(2, 'serva', 'theo', 't@t', 'SLAM', 't', 'admin'),
(3, 'b', 'b', 'b@b', 'STI2D', 'b', 'Professeur');

-- --------------------------------------------------------

--
-- Structure de la table `cours`
--

CREATE TABLE IF NOT EXISTS `cours` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(40) COLLATE utf8_bin NOT NULL,
  `Classe` varchar(40) COLLATE utf8_bin NOT NULL,
  `Heure_debut` varchar(40) COLLATE utf8_bin NOT NULL,
  `Heure_fin` varchar(40) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_nom` (`Nom`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=3 ;

--
-- Contenu de la table `cours`
--

INSERT INTO `cours` (`id`, `Nom`, `Classe`, `Heure_debut`, `Heure_fin`) VALUES
(1, 'a', 'STI2D', '8:00', '10:00'),
(2, 'a', 'SISR', '10:00', '12:00');

-- --------------------------------------------------------

--
-- Structure de la table `eleve`
--

CREATE TABLE IF NOT EXISTS `eleve` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(30) NOT NULL,
  `Prenom` varchar(30) NOT NULL,
  `Classe` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Contenu de la table `eleve`
--

INSERT INTO `eleve` (`id`, `Nom`, `Prenom`, `Classe`) VALUES
(1, 'g', 'adam', 'SLAM'),
(7, 'serva', 'tttt', 'SLAM'),
(8, '', '', '');

-- --------------------------------------------------------

--
-- Structure de la table `gestion_classe`
--

CREATE TABLE IF NOT EXISTS `gestion_classe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(30) NOT NULL,
  `Prenom` varchar(30) NOT NULL,
  `Date` varchar(30) NOT NULL,
  `Sanction` varchar(30) NOT NULL,
  `Motif` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `gestion_classe`
--

INSERT INTO `gestion_classe` (`id`, `Nom`, `Prenom`, `Date`, `Sanction`, `Motif`) VALUES
(1, 'serva', 'theo', '22/03/2001', 'colle', 'parle trop');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `cours`
--
ALTER TABLE `cours`
  ADD CONSTRAINT `fk_nom` FOREIGN KEY (`Nom`) REFERENCES `compte` (`Nom`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
