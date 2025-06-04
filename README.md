
# 🛍️ Spring Boot E-Commerce Application

A full-featured e-commerce web application built with **Java**, **Spring Boot**, **Thymeleaf**, and **PostgreSQL**. This platform allows users to browse products, manage their shopping cart, and complete secure purchases. Administrators have access to manage products, orders, and users through a dedicated admin panel.([github.com][1])

## 🚀 Features

* **User Authentication & Authorization**: Secure user registration and login functionalities.
* **Product Management**: Admins can add, update, and delete products.
* **Shopping Cart**: Users can add products to their cart and proceed to checkout.
* **Order Processing**: Efficient order placement and management system.
* **Responsive Design**: User-friendly interface compatible with various devices.([github.com][1])

## 🛠️ Technologies Used

* **Backend**: Java, Spring Boot
* **Frontend**: Thymeleaf, HTML, CSS, Bootstrap
* **Database**: PostgreSQL
* **Build Tool**: Maven

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


