# Wishlists

Backend-приложение для работы с вишлистами на Java 21 с использованием Spring Boot и Maven.

## О проекте

Проект представляет собой backend-сервис для управления вишлистами.  
Планируются основные сущности:

- User — пользователь системы  
- Wishlist — список желаний  
- Gift — подарок из вишлиста  

В данный момент реализован только CRUD для сущности User.

## Технологии

- Java 21  
- Spring Boot  
- Maven  
- PostgreSQL (в качестве базы данных)

## Запуск проекта

1. Клонируйте репозиторий:  
   ```bash
   git clone <URL_твоего_репозитория>
   cd Wishlists

2.	Настройте подключение к PostgreSQL в файле src/main/resources/application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

3.	Соберите и запустите проект с помощью Maven:
./mvnw spring-boot:run

4.	Backend будет доступен по адресу: http://localhost:8080

План развития
	•	Реализация CRUD для сущностей Wishlist и Gift
	•	Добавление функционала авторизации и аутентификации
	•	Тестирование и улучшение качества кода


