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
INSERT INTO roles (title) VALUES ('administrator');//1
INSERT INTO roles (title) VALUES ('user');//2
INSERT INTO roles (title) VALUES ('guest');//3
INSERT INTO users (login, password, email, role_id) VALUES ('djin94', '123456', 'djin94@yandex.ru', 2);
INSERT INTO users (login, password, email, role_id) VALUES ('heilragnarock', '654321', 'heilragnarock@yandex.ru', 2);
INSERT INTO users (login, password, email, role_id) VALUES ('admin', 'admin', 'wotan.uber.alles@yandex.ru', 1);