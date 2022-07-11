-- 判断数据表是否存在，存在则删除
DROP TABLE IF EXISTS tb_user;
-- 判断数据表是否存在，存在则删除
DROP TABLE IF EXISTS book;

-- 创建“用户信息”数据表
CREATE TABLE tb_user
(
    user_id INT AUTO_INCREMENT PRIMARY KEY COMMENT '用户编号',
    user_name VARCHAR(50) NOT NULL COMMENT '用户姓名',
    province VARCHAR(50) NOT NULL COMMENT '省份',
    create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间'
);
-- 创建“用户信息”数据表
CREATE TABLE book
(
    id INT AUTO_INCREMENT PRIMARY KEY COMMENT '编号',
    title VARCHAR(50) NOT NULL COMMENT '书名',
    author VARCHAR(50) NOT NULL COMMENT '作者',
    publicationTime VARCHAR(50) NOT NULL COMMENT '出版时间',
    publicationDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '出版日期'
);