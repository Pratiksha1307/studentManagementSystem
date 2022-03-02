-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Mar 02, 2022 at 10:06 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance_student`
--

CREATE TABLE `attendance_student` (
  `rollno` varchar(30) NOT NULL,
  `datetime` datetime DEFAULT NULL,
  `attendance` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance_student`
--

INSERT INTO `attendance_student` (`rollno`, `datetime`, `attendance`) VALUES
('1', '2022-02-26 20:26:14', 'Present'),
('10', '2022-02-26 20:30:37', 'Present'),
('101', '2022-02-18 23:16:39', 'present'),
('1121', '2022-02-16 00:00:00', 'present'),
('1123', '2022-02-20 18:30:24', 'present'),
('1124', '2022-02-18 23:18:20', 'present'),
('1125', '2022-02-25 13:36:37', 'Present'),
('2', '2022-02-26 20:26:49', 'Present'),
('3', '2022-02-26 20:27:16', 'Present'),
('4', '2022-02-26 20:28:08', 'Present'),
('5', '2022-02-26 20:28:38', 'Present'),
('6', '2022-02-26 20:28:59', 'Present'),
('7', '2022-02-26 20:29:21', 'Present'),
('8', '2022-02-26 20:29:48', 'Present'),
('9', '2022-02-26 20:30:11', 'Present');

-- --------------------------------------------------------

--
-- Table structure for table `fee`
--

CREATE TABLE `fee` (
  `rollno` varchar(30) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `course` varchar(30) DEFAULT NULL,
  `branch` varchar(30) DEFAULT NULL,
  `semester` varchar(30) DEFAULT NULL,
  `fee_paid` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `rollno` varchar(25) DEFAULT NULL,
  `marks1` varchar(20) DEFAULT NULL,
  `marks2` varchar(20) DEFAULT NULL,
  `marks3` varchar(20) DEFAULT NULL,
  `marks4` varchar(20) DEFAULT NULL,
  `marks5` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `rollno` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `age` varchar(20) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone` varchar(25) DEFAULT NULL,
  `email` varchar(35) DEFAULT NULL,
  `class_x` varchar(30) DEFAULT NULL,
  `class_xii` varchar(30) DEFAULT NULL,
  `aadhar` varchar(25) DEFAULT NULL,
  `course` varchar(20) DEFAULT NULL,
  `branch` varchar(25) DEFAULT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`rollno`, `name`, `age`, `dob`, `address`, `phone`, `email`, `class_x`, `class_xii`, `aadhar`, `course`, `branch`, `password`) VALUES
('1', 'Leena', '25', '1999-02-04', 'Pune', '8976545679', 'leena@gmail.com', '98', '78', '342567891234', 'BE', 'computer', '1**'),
('2', 'Manjusha', '23', '2005-04-09', 'Pune', '9637978967', 'Manju@gmail.com', '89', '78', '233145657896', 'Bsc', 'Botany', '2*'),
('3', 'Krishna', '25', '2007-08-21', 'Pune', '9178685748', 'krish@gmail', '78', '87', '324156765432', 'BTech', 'computer', '3*'),
('4', 'Devanshi', '21', '2000-12-31', 'Chenai', '9821345671', 'deu@gmail.com', '80', '82', '213451678123', 'BE', 'Machanical', '4*'),
('5', 'Arnav', '20', '2001-03-05', 'Mumbai', '91234562780', 'arnav@gmail.com', '90', '70', '543627189234', 'Bsc', 'Zology', '5*'),
('6', 'Aaradhya', '23', '2002-01-03', 'Pune', '9187254673', 'aaradhya@gmail.com', '70', '90', '321454321234', 'Bsc', 'computer', '6*'),
('7', 'leena ', '23', '1999-02-18', 'Mumbai', '2345678901', 'leena@gmail.com', '80', '90', '1232456786789', 'ComputerSci', 'Computer Science', '7*'),
('8', 'Rahul ', '22', '1999-02-18', 'Malegoan', '65748678901', 'r@gmail.com', '99', '90', '123245678654', 'java', 'bsc', '8*'),
('9', 'Priyanka ', '24', '1997-04-05', 'Dehli', '9156784356', 'priyanka@gmail.com', '78', '87', '897654321234', 'Bsc', 'Computer Science', '9*'),
('10', 'Ridhi  ', '21', '1997-06-01', 'Pune', '2345678901', 'ridhi@gmail.com', '60', '80', '123245678654', 'BE', 'Computer Science', '10*');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `rollno` varchar(25) DEFAULT NULL,
  `subject1` varchar(30) DEFAULT NULL,
  `subject2` varchar(30) DEFAULT NULL,
  `subject3` varchar(30) DEFAULT NULL,
  `subject4` varchar(30) DEFAULT NULL,
  `subject5` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `course` varchar(50) DEFAULT NULL,
  `emp_id` varchar(15) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`name`, `address`, `phone`, `email`, `course`, `emp_id`, `password`) VALUES
('Rahul patil', 'Malegoan', '234567890', 'r@gmail.com', 'ComputerSc', '101', '123'),
('Rahul patil', 'Malegoan', '2345678901', 'r@gmail.com', 'ComputerSci', '101', '123'),
('Ram Ahire', 'Malegoan', '65748678901', 'ram@gmail.com', 'Electronics', '102', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance_student`
--
ALTER TABLE `attendance_student`
  ADD PRIMARY KEY (`rollno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
