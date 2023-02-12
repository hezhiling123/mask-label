/*
 Navicat Premium Data Transfer

 Source Server         : 47.95.192.141
 Source Server Type    : MySQL
 Source Server Version : 50740
 Source Host           : 47.95.192.141:3306
 Source Schema         : mask

 Target Server Type    : MySQL
 Target Server Version : 50740
 File Encoding         : 65001

 Date: 11/02/2023 21:11:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for label
-- ----------------------------
DROP TABLE IF EXISTS `label`;
CREATE TABLE `label`  (
  `LABEL_ID` int(11) NOT NULL COMMENT '标签ID',
  `LABEL_CATEGORY_ID` int(11) NOT NULL COMMENT '标签类别ID',
  `LABEL_NAME` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标签名称',
  `STATE` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标签状态（UNINITIALIZED未激活，NORMAL正常，FROZEN冻结，CANCEL注销）',
  `OWNER_ID` int(11) NULL DEFAULT NULL COMMENT '拥有者ID',
  `ACTIVE_TIME` datetime(6) NULL DEFAULT NULL COMMENT '激活时间',
  `CRTER_ID` int(11) NOT NULL DEFAULT 0 COMMENT '创建者ID',
  `CRTER_NAME` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建者名称',
  `CRTE_TIME` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) COMMENT '创建时间',
  `UPDTER_ID` int(11) NOT NULL COMMENT '更新者ID',
  `UPDTER_NAME` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '更新者名称',
  `UPDT_TIME` datetime(6) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`LABEL_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

SET FOREIGN_KEY_CHECKS = 1;
