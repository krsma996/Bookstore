
# Bookstore Web Application  

The **Bookstore Web Application** is a comprehensive full-stack project for purchasing books and comic books online. It features user account management, seamless order processing, and an admin portal for inventory management. Built with **Spring Boot**, **Thymeleaf**, and **MySQL**, this application showcases modern web development practices.  

---

## 🌟 Features  

### 📖 User Features  
- **Account Management**:  
  - Register with email verification.  
  - Secure login/logout functionality.  
- **Address Management**:  
  - Add and manage multiple shipping and billing addresses.  
  - Set default addresses for easier checkout.  
- **Bookstore Functionality**:  
  - Browse books and view detailed descriptions.  
  - Add books to your shopping cart.  
  - Update or remove items in your cart.  
  - Checkout with custom billing and shipping details.  
- **Order Management**:  
  - Place orders and receive confirmation emails.  
  - Track order history in the "My Account" section.  

### 🛠️ Admin Features  
- **Inventory Management**:  
  - Add, update, or delete books using the admin portal.  

---

## 🔧 Technologies Used  

- **Backend**: Spring Boot, Hibernate  
- **Frontend**: Thymeleaf, Bootstrap 3.4, HTML, CSS, JavaScript (jQuery)  
- **Database**: MySQL  
- **Email Service**: JavaMailSender  
- **Tools**: Spring Tool Suite (STS), Eclipse  

---

## ⚙️ Setup Instructions  

### Prerequisites  
1. **MySQL**: Install and ensure it’s running.  
2. **Development Environment**: Install **Spring Tool Suite (STS)** or **Eclipse**.  
3. Clone the repository:  
   ```bash  
   git clone https://github.com/NikolaKrsmanovic1996/bookstore.git  
   ```  

### Database Setup  
1. Create a MySQL database (e.g., `bookstore`).  
2. Update the `application.properties` file in `src/main/resources` with your database credentials:  
   ```properties  
   spring.datasource.url=jdbc:mysql://localhost:3306/bookstore  
   spring.datasource.username=YOUR_USERNAME  
   spring.datasource.password=YOUR_PASSWORD  
   spring.jpa.hibernate.ddl-auto=update  
   ```  

### Email Configuration  
1. Configure email settings in `application.properties` for email verification and order confirmation:  
   ```properties  
   spring.mail.host=smtp.gmail.com  
   spring.mail.port=587  
   spring.mail.username=YOUR_EMAIL  
   spring.mail.password=YOUR_PASSWORD  
   spring.mail.properties.mail.smtp.auth=true  
   spring.mail.properties.mail.smtp.starttls.enable=true  
   ```  

### Run the Application  
Start the application using your IDE or terminal:  
```bash  
mvn spring-boot:run  
```  
This will initialize the required database tables.  

---

## 🌐 Access the Application  

- Open your browser and navigate to: [http://localhost:8080](http://localhost:8080)  

---

## 📖 Usage Guide  

### User Workflow  

1. **Create an Account**:  
   - Register on the "My Account" page and verify your email.  
2. **Set Up Addresses**:  
   - Add billing and shipping addresses on the "Shipping" page.  
   - Mark default addresses for faster checkout.  
3. **Browse and Buy Books**:  
   - Navigate to the "Bookshelf" page to browse available books.  
   - Add books to your cart and adjust quantities if needed.  
4. **Place an Order**:  
   - Proceed to checkout, set your addresses, and confirm payment.  
   - Receive a confirmation email with order details.  
5. **Track Your Orders**:  
   - View order history in the "My Account" section.  

### Admin Workflow  

1. **Access Admin Portal**:  
   - Use the admin credentials to log in to the portal.  
     - **Username**: `admin`  
     - **Password**: `admin`  
2. **Manage Inventory**:  
   - Add, update, or delete books as needed.  

---

## 🚀 Future Enhancements  

- Integration with popular payment gateways.  
- Enhanced search and filtering options for books.  
- Responsive design with Bootstrap 5.  
- REST API for frontend-backend separation.  

---

## 📜 License  

This project is licensed under the **MIT License**.  

---

Enjoy shopping with the Bookstore Web Application! Feel free to explore the code and suggest improvements. 😊  
