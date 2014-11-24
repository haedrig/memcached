/*
Navicat MySQL Data Transfer

Source Server         : 192.168.18.50
Source Server Version : 50171
Source Host           : 192.168.18.50:3306
Source Database       : page

Target Server Type    : MYSQL
Target Server Version : 50171
File Encoding         : 65001

Date: 2014-11-21 14:30:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'a');
INSERT INTO `users` VALUES ('2', 'b');
INSERT INTO `users` VALUES ('3', 'c');
INSERT INTO `users` VALUES ('4', 'd');
INSERT INTO `users` VALUES ('5', 'e');
INSERT INTO `users` VALUES ('6', 'f');
INSERT INTO `users` VALUES ('7', 'g');
INSERT INTO `users` VALUES ('8', 'h');
INSERT INTO `users` VALUES ('9', 'i');
INSERT INTO `users` VALUES ('10', 'j');
INSERT INTO `users` VALUES ('11', 'k');
