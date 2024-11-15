Bookstore Web Application
Welcome to the Bookstore Web Application, a platform designed for purchasing books and comic books online. This project demonstrates a full-stack web application built with Spring Boot, Thymeleaf, and MySQL, incorporating modern web development practices.

Features
User Account Management:
Register a new account with email verification.
Secure login system.
Address Management:
Add and manage multiple shipping and billing addresses.
Set default addresses for faster checkout.
Bookstore Functionality:
Browse books and view detailed information.
Add books to your shopping cart.
Update or remove items from the cart.
Proceed through a seamless checkout process.
Order Management:
Place orders with custom billing and shipping addresses.
Receive order confirmation via email.
View order history on the "My Account" page.
Admin Portal:
Manage the bookstore inventory with features to add, update, or delete books.
Technologies Used
Backend: Spring Boot, Hibernate
Frontend: Thymeleaf, Bootstrap 3.4, HTML, CSS, JavaScript (jQuery)
Database: MySQL
Email Service: JavaMailSender
Tools: Spring Tool Suite (STS) 4, Eclipse
Setup Instructions
Prerequisites
Install MySQL and ensure it's running.
Install Spring Tool Suite (STS) or Eclipse.
Clone this repository.
bash
Copy code
git clone https://github.com/NikolaKrsmanovic1996/bookstore.git
Import the project into your IDE.
Configuration
Database Setup:

Create a database in MySQL (e.g., bookstore).
Update the application.properties file in the src/main/resources folder with your MySQL credentials:
properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
Email Configuration:

Update the email settings in the application.properties file for sending activation and order confirmation emails.
properties
Copy code
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=YOUR_EMAIL
spring.mail.password=YOUR_PASSWORD
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
Run the Application:

Start the application using your IDE or via the terminal:
bash
Copy code
mvn spring-boot:run
This will initialize the required database tables.
Access the Application:

Navigate to http://localhost:8080 in your browser.
Usage Guide
For Users:
Create an Account:
Go to the "My Account" page and register.
Check your email for an activation link and activate your account.
Set Up Addresses:
Navigate to the "Shipping" page to add billing and shipping addresses.
Mark default addresses for easier checkout.
Browse Books:
Go to the "Bookshelf" page, select a book, and view its details.
Add the desired quantity to your cart.
Manage Your Cart:
View your cart, update quantities, or remove items.
Proceed to checkout.
Place an Order:
Set your billing and shipping details during checkout.
Confirm payment and place your order.
Receive a confirmation email with order details and delivery date.
Track Orders:
View your order history in the "My Account" section.
For Admins:
Access the Admin Portal:
Admin Portal Repository
Credentials:
Username: admin
Password: admin
Manage Inventory:
Add, update, or delete books in the store.
Future Improvements
Integration with payment gateways for seamless transactions.
Enhanced search and filtering options for books.
Responsive design upgrades with Bootstrap 5.
REST API implementation for better frontend-backend separation.
Contributing
Contributions are welcome! Feel free to fork the repository and submit a pull request with your enhancements or bug fixes.

License
This project is licensed under the MIT License.

Enjoy your shopping experience and feel free to explore the code! 😊
