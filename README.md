# TechTrack Backend API
## Project Overview
TechTrack is a platform designed for monitoring and managing technical equipment such as industrial robots, manufacturing equipment, quality control systems, etc. The platform aims to solve the problem of managing data on the technical condition of equipment. This project implements a RESTful API to manage users and handle data related to equipment status, including monitoring temperature, speed, pressure, and alerting on abnormal situations.

The API supports basic authentication and authorization, allowing only authorized users to access and manipulate the data. It is designed to handle simultaneous requests from multiple clients and ensure high data availability.

## Features
- **User Management**: Create, read, update, and delete users with basic authentication and authorization.
- **Equipment Management**: CRUD operations for equipment data.
- **Data Management**: Store and retrieve equipment status indicators such as temperature, speed, and pressure.
- **Alert Management**: Manage alerts related to equipment, including warnings about possible failures or abnormal situations.
- **Concurrency Handling**: Optimistic locking for concurrent data updates.
- **Comprehensive Error Handling**: Return appropriate HTTP statuses and messages for different scenarios.
- **API Documentation**: Detailed API specification using Swagger/OpenAPI.

## Technologies Used

- Java
- Spring
- Spring boot
- Spring data jpa
- Spring web services
- Spring security
- JWT
- Postgresql
- Maven

## Getting Started

1. Clone the repository: `git clone <repository-url>`
2. Build the project: `mvn clean package`
3. Go to application.properties and do some change:
4. change `spring.datasource.url=jdbc:postgresql://localhost:5432/task3` to your own database url
5. change `spring.datasource.username=postgres` to your username
6. change `.datasource.password=57206700` to your password
7. Run the application

## Usage

- Access the admin panel at `http://localhost:2024/swagger-ui/index.html#/` to manage all endpoints.
- authorize like admin with credentials: 'admin@gmail.com' and 'admin123' or sign up and create your own admin account
-  ![image](https://github.com/b410asakura/Restaurant-SRM/assets/73512839/36d15d28-65d1-44bc-accf-8ab2d460f4df)
- After authorizing you will get jwt token, use it to get access to endpoints
- ![image](https://github.com/b410asakura/Restaurant-SRM/assets/73512839/9ab500dd-42ac-4715-a37f-024171dc0442)
![image](https://github.com/b410asakura/Restaurant-SRM/assets/73512839/64893d25-869b-4877-a41e-ee163d175cf6)

- Use API endpoints to interact with the system programmatically.
 

## API Endpoints
### endpoints to manage user entity
![image](https://github.com/b410asakura/Restaurant-SRM/assets/73512839/4f173fd0-ae7f-4922-a3da-6598e7051e39)

### endpoints to manage alert entity
![image](https://github.com/b410asakura/task3/assets/73512839/1ebf2e47-dcfa-4e3b-b9cd-847552cc06f3)

### endpoints to manage equipment entity
![image](https://github.com/b410asakura/task3/assets/73512839/c18f7fb5-0315-4223-a4fc-e1615805b234)

### endpoints to manage data entity
![image](https://github.com/b410asakura/task3/assets/73512839/6a11fe34-dad4-48d7-8664-626f1ae28f00)



## Video Demonstration

Video demonstration of the API in action can be found [here](https://drive.google.com/file/d/1UFfBEkdoXONptCqlmox1UMsHXSyNTzcm/view?usp=sharing)
