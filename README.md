# 🗺️ SimpleGeo

SimpleGeo — это RESTful веб-сервис для работы с географическими объектами. Приложение построено с использованием **Spring Boot**, **MyBatis** и **PostgreSQL**, и предоставляет удобный API для управления сущностями, представляющими географические объекты.

## 📦 Технологии

- Java 17+
- Spring Boot 3.5
- MyBatis
- PostgreSQL
- Lombok
- MapStruct
- Gradle
- OpenAPI (Swagger)

## ⚙️ Архитектура

Проект построен по слоистой архитектуре:
- **Controller** — REST API
- **Service** — бизнес-логика
- **Mapper (MyBatis)** — SQL-запросы
- **DTO & Entity** — слои представления и модели базы данных

## 📁 Структура проекта

# API

# 📌 POST /api/geo/object/create

Создание нового географического объекта.

**URL:** `http://localhost:8080/api/geo/object/create`  
**Метод:** `POST`  
**Content-Type:** `application/json`

## 🔸 Пример запроса

```json
{
  "name": "Название объекта",
  "type": "Тип объекта",
  "geometryGeoJson": "{ "type": "Point", "coordinates": [30.5, 50.5] }"
}
```

## 🔹 Ответ

- `201 Created` при успешном создании
- `400 Bad Request` при ошибке валидации

# 🗑️ POST /api/geo/object/delete

Удаление географического объекта.

**URL:** `http://localhost:8080/api/geo/object/delete`  
**Метод:** `POST`  
**Content-Type:** `application/json`

## 🔸 Пример запроса

```json
{
  "id": "123",
  "name": "Название объекта",
  "type": "Тип объекта",
  "geometryGeoJson": "{ "type": "Point", "coordinates": [30.5, 50.5] }"
}
```

## 🔹 Ответ

- `200 OK` при успешном удалении
- `404 Not Found` если объект не найден

# 🌍 GET /api/geo/objects

Получение списка всех географических объектов.

**URL:** `http://localhost:8080/api/geo/objects`  
**Метод:** `GET`

## 🔹 Пример ответа

```json
[
  {
    "id": 1,
    "name": "Москва",
    "type": "CITY",
    "geometryGeoJson": "{ \"type\": \"Point\", \"coordinates\": [37.6176, 55.7558] }"
  },
  {
    "id": 2,
    "name": "Лондон",
    "type": "CITY",
    "geometryGeoJson": "{ \"type\": \"Point\", \"coordinates\": [-0.1276, 51.5074] }"
  }
]
```

## 🔸 Ответ

- `200 OK` всегда (может быть пустой массив)

