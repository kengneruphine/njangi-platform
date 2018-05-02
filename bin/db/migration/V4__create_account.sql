CREATE TABLE account(
  id INT AUTO_INCREMENT,
  name varchar(255),
  amount double,
number_of_people int,
type_of_currency varchar(255),
meeting_date  Date,
   PRIMARY KEY (ID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
