
-- БАЗА ДАНИХ
-- Можливість створення БД з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Можемо створити БД через візуальний інструмент, наприклад,
-- MySQL Workbench.
CREATE DATABASE demo_db;

-- ТАБЛИЦІ
-- Можливість створення таблиць БД, з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Попередньо, необхідно спроектувати таблиці та їх зв'язки,
-- на основі сутностей реального світу.
-- Можемо створити таблиці БД через візуальний інструмент, наприклад,
-- MySQL Workbench.

CREATE TABLE IF NOT EXISTS employees
( id BIGINT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(128) NOT NULL,
  last_name VARCHAR(128) NOT NULL,
  job_position VARCHAR(128) NOT NULL,
  phone VARCHAR(56) NOT NULL,
  PRIMARY KEY (id)
);

--Вставка данних в таблицю users - приклад два записи:
INSERT INTO employees
(first_name, last_name, job_position, phone)
VALUES
('John', 'Green', 'Engineer', '0883763332'),
('Bob', 'Bright', 'Worker', '0284759403');

--Вибірка данних - усіх записів з таблиці users.
SELECT * FROM employees;

--Видалення даних - запис користувача з ім'ям"Bob" з таблиці users.
DELETE FROM employees WHERE first_name = 'Bob';

--Перевірка, що користувач з ім'ям "Bob" був успішно видалений.
SELECT * FROM employees;

