/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : zx

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2017-04-07 09:46:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `zx_role`
-- ----------------------------
DROP TABLE IF EXISTS `zx_role`;
CREATE TABLE `zx_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NOT NULL,
  `RoleCode` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zx_role
-- ----------------------------
INSERT INTO `zx_role` VALUES ('1', '1', 'ROLE_ONE');

-- ----------------------------
-- Table structure for `zx_user`
-- ----------------------------
DROP TABLE IF EXISTS `zx_user`;
CREATE TABLE `zx_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zx_user
-- ----------------------------
INSERT INTO `zx_user` VALUES ('1', 'zhangxing', 'zhangxing');
