-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 06, 2024 at 06:44 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ems_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `emp_info`
--

CREATE TABLE `emp_info` (
  `id` int(11) NOT NULL,
  `f_name` varchar(255) DEFAULT NULL,
  `l_name` varchar(255) DEFAULT NULL,
  `designation` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `emp_info`
--

INSERT INTO `emp_info` (`id`, `f_name`, `l_name`, `designation`, `gender`, `address`, `email`, `salary`) VALUES
(21, 'Taher', 'Mahmud', 'CEO', 'Male ', 'Jatrabari', 'taher@gmail.com', 100000),
(22, 'Karniz', 'Fatema', 'Manager', 'Female', 'Shewrapara', 'karniz@gmail.com', 40000),
(23, 'Abdullah', 'Sardar', 'Manager', 'Male ', 'Motijheel', 'arafat@gmail.com', 40000),
(24, 'Anushka', 'Raiyaan', 'Content Writer', 'Female', 'Mirpur', 'anushka@gmail.com', 30000),
(25, 'Kazi', 'Mihad', 'Graphics Designer', 'Male ', 'Gazipur', 'mihad@gmail.com', 40000);

--
-- Triggers `emp_info`
--
DELIMITER $$
CREATE TRIGGER `trigger1` AFTER INSERT ON `emp_info` FOR EACH ROW BEGIN
    INSERT INTO emp_info_backup (id, f_name, l_name, designation, gender, address, email, salary)
    VALUES (NEW.id, NEW.f_name, NEW.l_name, NEW.designation, NEW.gender, NEW.address, NEW.email, NEW.salary);
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `trigger2` AFTER UPDATE ON `emp_info` FOR EACH ROW BEGIN
    UPDATE emp_info_backup
    SET f_name = NEW.f_name,
        l_name = NEW.l_name,
        designation = NEW.designation,
        gender = NEW.gender,
        address = NEW.address,
        email = NEW.email,
        salary = NEW.salary
    WHERE id = NEW.id;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `emp_info_backup`
--

CREATE TABLE `emp_info_backup` (
  `id` int(11) NOT NULL,
  `f_name` varchar(255) DEFAULT NULL,
  `l_name` varchar(255) DEFAULT NULL,
  `designation` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `emp_info_backup`
--

INSERT INTO `emp_info_backup` (`id`, `f_name`, `l_name`, `designation`, `gender`, `address`, `email`, `salary`) VALUES
(21, 'Taher', 'Mahmud', 'CEO', 'Male ', 'Jatrabari', 'taher@gmail.com', 100000),
(22, 'Karniz', 'Fatema', 'Manager', 'Female', 'Shewrapara', 'karniz@gmail.com', 40000),
(23, 'Abdullah', 'Sardar', 'Manager', 'Male ', 'Motijheel', 'arafat@gmail.com', 40000),
(24, 'Anushka', 'Raiyaan', 'Content Writer', 'Female', 'Mirpur', 'anushka@gmail.com', 30000),
(25, 'Kazi', 'Mihad', 'Graphics Designer', 'Male ', 'Gazipur', 'mihad@gmail.com', 40000);

-- --------------------------------------------------------

--
-- Table structure for table `leave_table`
--

CREATE TABLE `leave_table` (
  `leave_id` int(11) NOT NULL,
  `emp_id` int(11) DEFAULT NULL,
  `leave_type` varchar(255) DEFAULT NULL,
  `days_allowed` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `leave_table`
--

INSERT INTO `leave_table` (`leave_id`, `emp_id`, `leave_type`, `days_allowed`) VALUES
(6, 21, 'Vacation', 7),
(7, 21, 'Sick Leave', 7),
(8, 21, 'Vacation', 10);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `emp_info`
--
ALTER TABLE `emp_info`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `emp_info_backup`
--
ALTER TABLE `emp_info_backup`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `leave_table`
--
ALTER TABLE `leave_table`
  ADD PRIMARY KEY (`leave_id`),
  ADD KEY `emp_id` (`emp_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `emp_info`
--
ALTER TABLE `emp_info`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `leave_table`
--
ALTER TABLE `leave_table`
  MODIFY `leave_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `leave_table`
--
ALTER TABLE `leave_table`
  ADD CONSTRAINT `leave_table_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `emp_info` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
