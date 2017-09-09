create table users (
	id serial primary key,
	login VARCHAR(255),
	password VARCHAR(255),
	email VARCHAR(255),
    role_id INT
);
create table messages (
	id serial primary key,
	user_id INT,
	message VARCHAR(255),
  date DATE
);
create table roles(
	id serial primary key,
	title VARCHAR(255)
);
create table private_messages (
	id serial primary key,
	user_id_sender INT,
	user_id_recipient INT,
	message VARCHAR(255),
  date DATE
);
INSERT INTO roles (title) VALUES ('administrator');
INSERT INTO roles (title) VALUES ('user');
INSERT INTO roles (title) VALUES ('guest');