CREATE DATABASE Users default character set utf8 collate utf8_general_ci;
set names 'utf8';
USE Users;
create table userrs
(userrs_id char(20),
userrs_phonumber char(11),
userrs_password char(50),
userrs_name char(50),
userrs_words char(150),
primary key(userrs_id)
);

insert into userrs values ("U000001","18810331018","zulalakeai123","小绿","我爱权志龙");
insert into userrs values ("U000002","13772299958","yanyaya123","小橙","老八老八");
insert into userrs values ("U000003","18810312578","mihehe123","小红","我爱李钟硕");
insert into userrs values ("U000004","18810641018","nuomici123","小粉","我爱边伯贤");
insert into userrs values ("U000005","18812238876","alvlv1234","小黄","我爱剑三");
insert into userrs values ("U000006","15894172345","zhuixing123","小紫","我爱上铺");
insert into userrs values ("U000007","18810331199","siyaoyao123","唐帅哥","滚蛋吧肿瘤君");
insert into userrs values ("U000008","13772299967","ameimei123","啊梅","我爱肉夹馍");
insert into userrs values ("U000009","13772298876","lizhongshuo","小明","我爱肖战");
insert into userrs values ("U000010","13772228876","wangyib0123","小兰","我爱网易");


create table publishment
(
book_id char(20) not null,
book_name char(20),
userrs_id char(11),
edit_writer char(15),
edit_place char(20),
degree enum("几乎全新","轻微勾画","大量笔记","不影响阅读"),
old_price float,
new_price float,
publish_time datetime,
primary key(book_id)
);
insert into publishment values("A000001","数据库","U000002",
"张艺","中央民族大学出版社","几乎全新",45.9,13.0,"2019-10-09 17:53:04");
insert into publishment values("B000001","线性代数","U000003",
"啦啦","江苏科技出版社","大量笔记",27.9,9.0,"2019-10-08 9:53:04");
insert into publishment values("C000001","文言文","U000003",
"雅雅","中央民族大学出版社","几乎全新",45.9,13.0,"2019-10-02 17:53:04");
insert into publishment values("B000002","概率论","U000004",
"咪咪","中国人民教育出版社","不影响阅读",23.9,7.0,"2019-9-09 6:53:04");
insert into publishment values("D000001","星火英语","U000002",
"吕吕","电子工业出版社","几乎全新",45.9,13.0,"2019-7-09 17:53:04");
insert into publishment values("G000003","叶修同人本","U000005",
"小胖","上海交通大学出版社","几乎全新",195.9,72.0,"2019-3-09 17:53:04");
insert into publishment values("A000002","Python","U000006",
"黄黄","延安大学出版社","不影响阅读",37.8,13.0,"2019-2-13 17:16:04");
insert into publishment values("A000003","Java","U000002",
"思瑶","黄土情出版社","几乎全新",25.9,11.0,"2018-10-09 17:53:04");
insert into publishment values("G000001","红秀","U000003",
"梅梅","窑洞出版社","几乎全新",15.9,9.0,"2019-9-09 17:53:04");
insert into publishment values("G000002","怖客","U000004",
"黑江","陕西科技大学出版社","几乎全新",7.9,3.0,"2019-4-09 17:53:04");

create table donate
(
donate_id char(12) NOT NULL,
userrs_id char(20),
tel varchar(11) DEFAULT NULL,
num varchar(10) DEFAULT NULL,

start_time date,
time_choose enum("9:00-11:00","14:00-16:00","18:00-20:00"),
collect_time date,
dorm_number enum("1号学生公寓","2号学生公寓","3号学生公寓","4号学生公寓","5号学生公寓","6号学生公寓","7号学生公寓","8号学生公寓"),

room_number varchar(20) DEFAULT NULL,
  PRIMARY KEY (donate_ID)
);
insert  into donate(donate_id,userrs_id,tel,num,start_time,time_choose,collect_time,dorm_number,room_number) 
values ('Z000001','U000001','18546975966','3','2016-01-01','14:00-16:00','2016-01-03','1号学生公寓','n740'),
('Z000002','U000002','18985975914','5','2018-07-06','9:00-11:00','2018-07-09','1号学生公寓','n440'),
('Z000003','U000003','14958635597','2','2018-09-01','14:00-16:00','2018-09-03','4号学生公寓','240'),
('Z000004','U000003','15874963582','1','2019-04-01','14:00-16:00','2019-04-02','8号学生公寓','910'),
('Z000005','U000004','18596387415','3','2018-07-06','9:00-11:00','2018-07-09','1号学生公寓','n440'),
('Z000006','U000005','19587463581','10','2018-10-06','9:00-11:00','2018-07-09','7号学生公寓','240'),
('Z000007','U000006','14695871236','6','2019-07-06','14:00-16:00','2018-07-09','8号学生公寓','440'),
('Z000008','U000006','19865297462','4','2019-08-06','9:00-11:00','2018-07-09','4号学生公寓','660'),
('Z000009','U000007','10659288921','9','2019-09-06','14:00-16:00','2018-07-09','3号学生公寓','320'),
('Z000010','U000008','16258869923','5','2019-10-06','9:00-11:00','2018-07-09','1号学生公寓','460');


create table Orders
(
order_id char(20) not null ,
book_id char(20) not null,
userrs_id char(20) not null,
complete_time datetime,
primary key(order_id)
);
insert  into Orders(order_id,book_id,userrs_id,complete_time) 
values ('O000001','A000001','U000003','2019-10-11 17:53:04'),
('O000002','B000001','U000002','2019-10-19 11:08:04'),
('O000003','C000001','U000004','2019-10-09 9:53:04');