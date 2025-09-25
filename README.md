🛒 E-Commerce Web Application

A full-stack E-Commerce Web Application built with React.js frontend and Spring Boot backend, providing a seamless shopping experience with product browsing, cart management, authentication, and order checkout.

🚀 Features

User Authentication & Authorization (Sign up, Login, Secure Sessions)

Product Catalog – browse products with details and categories

Shopping Cart – add, remove, and update items in real time

Order Management – place orders and track order history

Responsive UI – mobile-friendly, clean, and intuitive design

RESTful APIs – robust backend with Spring Boot and database integration

🛠️ Tech Stack
Frontend (React.js)

React.js, JavaScript, HTML, CSS

Axios for API communication

Responsive design for cross-device compatibility

Backend (Spring Boot)

Java with Spring Boot

RESTful API development

Database integration (MySQL / PostgreSQL)

Authentication & session management

📂 Project Structure
ECommerce-site/
│
├── frontend/           # React.js client-side code
│   ├── public/
│   └── src/
│       ├── components/
│       ├── pages/
│       ├── services/
│       └── App.js
│
├── EcomBackend/        # Spring Boot backend
│   ├── src/main/java/
│   │   └── com/ecommerce/...
│   ├── src/main/resources/
│   │   └── application.properties
│   └── pom.xml
│
└── README.md           # Project documentation

⚙️ Installation & Setup
Prerequisites

Node.js & npm

Java JDK (11 or higher)

Maven

MySQL / PostgreSQL

Backend Setup
cd EcomBackend
mvn spring-boot:run

Frontend Setup
cd frontend
npm install
npm start


The app will be available at:

Frontend → http://localhost:3000

Backend API → http://localhost:8080

🔗 API Endpoints (Sample)
Method	Endpoint	Description
POST	/api/auth/signup	User registration
POST	/api/auth/login	User login
GET	/api/products	Fetch all products
POST	/api/cart/add	Add item to cart
GET	/api/orders	Fetch order history
📸 Screenshots

(Add screenshots of your UI here – Home page, Product Page, Cart, Checkout, etc.)

🎯 Learning Outcomes

Hands-on experience with full-stack development using React and Spring Boot

Understanding of REST API design and frontend-backend integration

Built and deployed a scalable, modular, and maintainable e-commerce solution

🤝 Contribution

Contributions are welcome! Please open an issue or submit a pull request for improvements.

📧 Contact

Bandi Chiranjeevi

GitHub: https://github.com/chiranjeevibandi

LinkedIn: https://www.linkedin.com/in/chiranjeevibandi/
