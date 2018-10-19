/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : admin

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-09-26 15:42:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for abs_baidu_stages_details
-- ----------------------------
DROP TABLE IF EXISTS `abs_baidu_stages_details`;
CREATE TABLE `abs_baidu_stages_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `schedule_id` varchar(32) NOT NULL COMMENT '主键',
  `schedule_no` int(2) NOT NULL COMMENT '期数',
  `start_date` varchar(8) NOT NULL COMMENT '开始日期',
  `end_date` varchar(8) NOT NULL COMMENT '到期日期',
  `amounts` varchar(255) NOT NULL COMMENT '金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='分期计划详情表';
