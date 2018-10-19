/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : admin

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-09-26 15:42:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for abs_ngari_loan_result
-- ----------------------------
DROP TABLE IF EXISTS `abs_ngari_loan_result`;
CREATE TABLE `abs_ngari_loan_result` (
  `id` varchar(32) NOT NULL COMMENT '主键\r\n主键',
  `event_type` varchar(4) NOT NULL COMMENT '事件码',
  `event_data` varchar(1024) NOT NULL COMMENT '事件内容',
  `version` int(4) NOT NULL COMMENT '接口版本号(默认为1)',
  `comment` varchar(1024) NOT NULL COMMENT '备注',
  `order_id` varchar(32) NOT NULL COMMENT '业务订单号',
  `cur_date` varchar(8) DEFAULT NULL COMMENT '财务日期(T日)',
  `tran_time` varchar(14) NOT NULL COMMENT '交易时间(YYYYMMDDHHMMSS)',
  `leader` varchar(8) NOT NULL COMMENT '牵头方',
  `partner` varchar(30) NOT NULL COMMENT '合作方',
  `cust_name` varchar(64) NOT NULL COMMENT '客户姓名',
  `cert_type` varchar(2) NOT NULL COMMENT '证件类型(01--身份证)',
  `cert_no` varchar(18) NOT NULL COMMENT '证件号',
  `loan_id` varchar(32) DEFAULT NULL COMMENT '借据号',
  `apply_date` varchar(8) NOT NULL COMMENT '申请日期',
  `start_date` varchar(8) DEFAULT NULL COMMENT '确认日期',
  `first_due_date` varchar(8) DEFAULT NULL COMMENT '第一期还款日',
  `due_day` int(2) DEFAULT NULL COMMENT '还款日',
  `end_date` varchar(8) DEFAULT NULL COMMENT '到期日期',
  `seq_no` varchar(128) DEFAULT NULL COMMENT '机构放款交易流水号',
  `encash_amt` int(11) NOT NULL COMMENT '机构金额(分)',
  `currency` varchar(3) NOT NULL COMMENT '币种(人民币)',
  `repay_mode` varchar(2) DEFAULT NULL COMMENT '还款方式(01--等额本金;02--等额本息)',
  `repay_cycle` varchar(1) DEFAULT NULL COMMENT '还款周期(月)',
  `total_terms` int(2) DEFAULT NULL COMMENT '总期数',
  `grace_day` int(2) DEFAULT NULL COMMENT '宽限期(天)',
  `schedule_id` varchar(32) NOT NULL COMMENT '分期计划id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='还款结果表\r\n';
