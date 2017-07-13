create database EPhotoAlbum;


create table user(
     userId int primary key auto_increment not null,
     userName varchar(32) default null,
     userAge  varchar(32) default null,
     userSex   varchar(32) default null,
     userQQ   varchar(32) default null,
     userTel  varchar(32) default null,
     userDate datetime DEFAULT NULL,
     userPhone  varchar(32) default null
     );

create table album(
     albumId int primary key auto_increment not null,
     albumName varchar(32) default null,
     albumDateNew  datetime default null,
     albumCreater   varchar(32) default null,
     albumNum   varchar(32) default null,
     albumDate datetime DEFAULT NULL,
     userId  varchar(32) default null
     );
	 
create table photos(
     photoId int primary key auto_increment not null,
     photoName varchar(32) default null,
     photoSrc  varchar(64) default null,
     photoCreater   varchar(32) default null,
     photoNum   varchar(32) default null,
     photoDate datetime DEFAULT NULL,
     albumId  varchar(32) default null
     );