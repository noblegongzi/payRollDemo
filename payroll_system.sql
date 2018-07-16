/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : payroll_system

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-07-10 15:08:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_admin`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_admin`;
CREATE TABLE `tbl_admin` (
  `admin_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `admin_name` text,
  `admin_pwd` text,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_admin
-- ----------------------------
INSERT INTO `tbl_admin` VALUES ('1', 'afsgdhf', 'asd');
INSERT INTO `tbl_admin` VALUES ('2', 'aaaa', 'qwer');
INSERT INTO `tbl_admin` VALUES ('3', '1001', 'qwer');

-- ----------------------------
-- Table structure for `tbl_day`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_day`;
CREATE TABLE `tbl_day` (
  `employee_id` int(11) unsigned NOT NULL,
  `sickDays` int(11) DEFAULT NULL,
  `busyDays` int(11) DEFAULT NULL,
  `lateDays` int(11) DEFAULT NULL,
  `overtimeDays` int(11) DEFAULT NULL,
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `employee_id` FOREIGN KEY (`employee_id`) REFERENCES `tbl_employee` (`employee_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_day
-- ----------------------------
INSERT INTO `tbl_day` VALUES ('1001', '1', '2', '1', '15');

-- ----------------------------
-- Table structure for `tbl_department`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_department`;
CREATE TABLE `tbl_department` (
  `department_id` int(11) NOT NULL,
  `department_name` text NOT NULL,
  PRIMARY KEY (`department_id`),
  UNIQUE KEY `department_id` (`department_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_department
-- ----------------------------
INSERT INTO `tbl_department` VALUES ('101', 'wdedcsff');

-- ----------------------------
-- Table structure for `tbl_efficient`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_efficient`;
CREATE TABLE `tbl_efficient` (
  `taxRate` double(11,4) NOT NULL,
  `pensionRateByE` double(11,4) NOT NULL,
  `pensionRateByC` double(11,4) NOT NULL,
  `medicRateByE` double(11,4) NOT NULL,
  `medicRateByC` double(11,4) NOT NULL,
  `unempRateByE` double(11,4) NOT NULL,
  `unempRateByC` double(11,4) NOT NULL,
  `injuryRateByC` double(11,4) NOT NULL,
  `fertiRateByC` double(11,4) NOT NULL,
  `proFundRateByE` double(11,4) NOT NULL,
  `proFundRateByC` double(11,4) NOT NULL DEFAULT '0.0000',
  `moneyOfSick` double(11,0) NOT NULL,
  `moneyOfBusy` double(11,0) NOT NULL,
  `moneyOfLate` double(11,0) NOT NULL,
  `moneyOfOver` double(11,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_efficient
-- ----------------------------
INSERT INTO `tbl_efficient` VALUES ('1.5500', '1.5500', '0.1500', '0.0000', '0.0000', '0.2100', '0.2100', '0.2100', '0.2100', '0.2200', '0.2500', '0', '0', '0', '0');

-- ----------------------------
-- Table structure for `tbl_employee`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_employee`;
CREATE TABLE `tbl_employee` (
  `employee_id` int(11) unsigned NOT NULL,
  `employee_name` text,
  `employee_pwd` text NOT NULL,
  `department_id` int(11) DEFAULT NULL,
  `station_id` int(11) DEFAULT NULL,
  `employee_sex` tinytext,
  `employee_birthday` date DEFAULT NULL,
  `employee_phone` int(11) DEFAULT NULL,
  `employee_address` text,
  PRIMARY KEY (`employee_id`),
  UNIQUE KEY `employee_id` (`employee_id`) USING BTREE,
  KEY `department_id` (`department_id`),
  KEY `station_id` (`station_id`),
  CONSTRAINT `department_id` FOREIGN KEY (`department_id`) REFERENCES `tbl_department` (`department_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `station_id` FOREIGN KEY (`station_id`) REFERENCES `tbl_station` (`station_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_employee
-- ----------------------------
INSERT INTO `tbl_employee` VALUES ('1001', 'fedsfn', 'asd', '101', '10101', '男', '2018-07-10', '1300', 'wefgrtyn');

-- ----------------------------
-- Table structure for `tbl_payroll`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_payroll`;
CREATE TABLE `tbl_payroll` (
  `month` int(11) DEFAULT NULL,
  `employee_id` int(11) unsigned NOT NULL,
  `basicSalary` double(11,0) DEFAULT NULL,
  `heatSubsidy` double(11,0) DEFAULT NULL,
  KEY `employee_ID` (`employee_id`) USING BTREE,
  CONSTRAINT `employee` FOREIGN KEY (`employee_id`) REFERENCES `tbl_employee` (`employee_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_payroll
-- ----------------------------
INSERT INTO `tbl_payroll` VALUES (null, '1001', '2000', '1000');

-- ----------------------------
-- Table structure for `tbl_station`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_station`;
CREATE TABLE `tbl_station` (
  `station_id` int(11) NOT NULL,
  `station_name` text NOT NULL,
  PRIMARY KEY (`station_id`),
  UNIQUE KEY `station_id` (`station_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_station
-- ----------------------------
INSERT INTO `tbl_station` VALUES ('10101', 'wqwgehtryt');

-- ----------------------------
-- View structure for `view_day`
-- ----------------------------
DROP VIEW IF EXISTS `view_day`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_day` AS select `tbl_day`.`employee_id` AS `employee_id`,`tbl_employee`.`employee_name` AS `employee_name`,`tbl_day`.`sickDays` AS `sickDays`,`tbl_day`.`busyDays` AS `busyDays`,`tbl_day`.`lateDays` AS `lateDays`,`tbl_day`.`overtimeDays` AS `overtimeDays` from (`tbl_day` join `tbl_employee`) where (`tbl_day`.`employee_id` = `tbl_employee`.`employee_id`) order by `tbl_day`.`employee_id` ;

-- ----------------------------
-- View structure for `view_static_payroll`
-- ----------------------------
DROP VIEW IF EXISTS `view_static_payroll`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_static_payroll` AS select `tbl_employee`.`employee_id` AS `employee_id`,`tbl_employee`.`employee_name` AS `employee_name`,`tbl_department`.`department_name` AS `department_name`,`tbl_station`.`station_name` AS `station_name`,`tbl_payroll`.`basicSalary` AS `basicSalary`,`tbl_payroll`.`heatSubsidy` AS `heatSubsidy` from (((`tbl_employee` join `tbl_payroll`) join `tbl_department`) join `tbl_station`) where ((`tbl_employee`.`employee_id` = `tbl_payroll`.`employee_id`) and (`tbl_employee`.`station_id` = `tbl_station`.`station_id`) and (`tbl_employee`.`department_id` = `tbl_department`.`department_id`)) order by `tbl_employee`.`employee_id` ;
