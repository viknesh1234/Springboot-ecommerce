# 🛒 VikMart - Spring Boot E-Commerce Platform

Welcome to **VikMart**, a full-stack e-commerce web application built with **Java Spring Boot** and **PostgreSQL**. This project demonstrates a scalable backend for managing products, users, carts, and orders — ideal for learning or expanding into a production-level solution.

## 🚀 Features

- ✅ User registration and login (JWT secured)
- 🛍️ Product catalog with add/update/delete (Admin only)
- 🛒 Add-to-cart and checkout process
- 💳 Order placement and history
- 🔐 Role-based authentication (Admin/User)
- 📦 RESTful API architecture

## 🛠️ Tech Stack

| Layer        | Technology           |
|--------------|----------------------|
| Backend      | Java, Spring Boot    |
| Database     | PostgreSQL           |
| ORM          | Spring Data JPA      |
| Security     | Spring Security, JWT |
| Build Tool   | Maven                |
| API Testing  | Postman / Swagger    |

## 📦 Installation & Setup

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/viknesh1234/Springboot-ecommerce.git
   cd Springboot-ecommerce
   ```



2. **Configure the Database**:

   * Ensure PostgreSQL is installed and running.
   * Create a database named `ecommerce`.
   * Update the `application.properties` file with your database credentials:([github.com][2], [github.com][3])

     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```

3. **Build and Run the Application**:

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```



4. **Access the Application**:

   * Frontend: `http://localhost:8080/`
   * Admin Panel: `http://localhost:8080/admin`([github.com][4])

## 📁 Project Structure

```plaintext
Springboot-ecommerce/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── ecommerce/
│   │   │           ├── controller/
│   │   │           ├── model/
│   │   │           ├── repository/
│   │   │           └── service/
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
├── pom.xml
└── README.md
```



## 🤝 Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---


