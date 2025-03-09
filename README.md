# Training Center API

## Overview
This is a Spring Boot-based REST API for managing training centers. It provides functionalities to:
- Create and save new training centers
- Retrieve all training centers

## Technologies Used
- Java 11+
- Spring Boot
- Spring Validation
- Maven
- Spring Intializer

## Prerequisites
Ensure you have the following installed on your system:
- **Java 11 or later** ([Download](https://www.oracle.com/java/technologies/javase-downloads.html))
- **Maven** ([Download](https://maven.apache.org/download.cgi))
- **IDE** (Eclipse, IntelliJ IDEA, or VS Code)

## Setup Instructions
### 1. Clone the Repository
```sh
git clone <repository-url>
cd training-center-api
```

### 2. Build the Project
```sh
mvn clean install
```

### 3. Run the Application
```sh
mvn spring-boot:run
```
The application will start on **http://localhost:8080**

## API Endpoints

### 1. Create a Training Center
- **Endpoint:** `POST /training-center`
- **Request Body (JSON):**
```json
{
  "CenterName": "ABC Training Center",
  "CenterCode": "ABC123456789",
  "Address": {
    "DetailedAddress": "123 Main St",
    "City": "Delhi",
    "State": "Delhi",
    "Pincode": "110001"
  },
  "StudentCapacity": 100,
  "CoursesOffered": ["Java", "Python"],
  "ContactEmail": "abc@example.com",
  "ContactPhone": "9876543210"
}
```
- **Response (Success):**
```json
{
  "CenterName": "ABC Training Center",
  "CenterCode": "ABC123456789",
  "Address": {
    "DetailedAddress": "123 Main St",
    "City": "Delhi",
    "State": "Delhi",
    "Pincode": "110001"
  },
  "StudentCapacity": 100,
  "CoursesOffered": ["Java", "Python"],
  "CreatedOn": 1712345678,
  "ContactEmail": "abc@example.com",
  "ContactPhone": "9876543210"
}
```

### 2. Get All Training Centers
- **Endpoint:** `GET /training-center`
- **Response (Example):**
```json
[
  {
    "CenterName": "ABC Training Center",
    "CenterCode": "ABC123456789",
    "Address": {
      "DetailedAddress": "123 Main St",
      "City": "Delhi",
      "State": "Delhi",
      "Pincode": "110001"
    },
    "StudentCapacity": 100,
    "CoursesOffered": ["Java", "Python"],
    "CreatedOn": 1712345678,
    "ContactEmail": "abc@example.com",
    "ContactPhone": "9876543210"
  }
]
```



## Exception Handling
- If a required field is missing, a **400 Bad Request** response is returned.
- If `CenterCode` is not exactly 12 alphanumeric characters, an error message is returned.
- If `ContactPhone` is not a valid 10-digit number, an error message is returned.
- If `ContactEmail` is invalid, an error message is returned.

## Running Tests
You can write and run JUnit tests using:
```sh
mvn test
```

## Conclusion
This API enables training center management with robust validation. Extend it by adding a database (e.g., MySQL, PostgreSQL) for persistent storage.

---
For any issues, feel free to contribute or raise an issue in the repository.

