create table IF NOT EXISTS  items(
  id integer not null AUTO_INCREMENT,
  name varchar(255),
  price integer not null,
  primary key(id)
);

create table IF NOT EXISTS  Orders(
  id integer not null,
  quantity integer not null,
  item_id integer not null,
  customer_id integer not null,
  unique (id,item_id,customer_id)
);

create table IF NOT EXISTS  customers(
  id integer not null AUTO_INCREMENT,
  name varchar(255) not null,
  email varchar(255) not null,
  primary key(id)
);