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

 Date: 11/02/2023 21:11:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for label_category
-- ----------------------------
DROP TABLE IF EXISTS `label_category`;
CREATE TABLE `label_category`  (
  `LABEL_CATEGORY_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标签类型id',
  `LABEL_CATEGORY_NAME` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标签类型名称',
  `PIC_URL` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片地址',
  `SHARE_URL` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分享地址',
  `ON_SALE` tinyint(2) NULL DEFAULT NULL COMMENT '售卖状态',
  `NEW_FLAG` tinyint(1) NULL DEFAULT NULL COMMENT '新品',
  `HOT_FLAG` tinyint(2) NULL DEFAULT NULL COMMENT '热卖',
  `CRTER_ID` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者id',
  `CRTER_NAME` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者名称',
  `CRTER_TIME` datetime(6) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDTER_ID` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者id',
  `UPDTER_NAME` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者名称',
  `UPDT_TIME` datetime(6) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`LABEL_CATEGORY_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

SET FOREIGN_KEY_CHECKS = 1;
