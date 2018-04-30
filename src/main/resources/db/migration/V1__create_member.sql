
CREATE TABLE member(
   id INT AUTO_INCREMENT,
   first_name varchar(255),
   last_name varchar(255),
   username varchar(255),
   email varchar(255),
   password varchar(50),
   phone_number varchar(50),
   location varchar(255),
   occupation varchar(255),
   profile_picture varchar(255),
   PRIMARY KEY (ID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
