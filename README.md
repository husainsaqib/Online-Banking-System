# Online-Banking-System
Developed a secure online banking web application enabling users to create accounts, manage balances, transfer funds, and view transaction history. Implemented Spring Boot for backend APIs, MySQL for data persistence, and applied authentication/authorization to ensure safe access and operations.


🔐 SecureNet Banking – Online Banking System

SecureNet Banking is a secure and scalable Online Banking Web Application built with Spring Boot, React, and JWT token-based authentication.
It provides a real-world banking experience including user login, account details, and funds transfer.

🏗️ Tech Stack
Backend
1. Java 17 + Spring Boot 3
2. Spring Security + JWT Authentication
3. Spring Data JPA (Hibernate)
4. MySQL / H2 Support
5. Maven Build System
Frontend
1. React
2. Tailwind
3. CSSAxios (API Communication)
4. Vite Dev Environment

DevOps
GitHub Actions (CI)
Docker & Docker Compose (Optional)
Postman Collection (API Testing)

🌟 Features

Category	Features

🔐 Authentication	JWT-based login, Password encryption (BCrypt), Role-based access

💳 Account Management	View balance, account details, profile management

💸 Money Transfer	Secure fund transfers with validations

📜 Transaction History	Track successful transfers

🛡️ Security	CORS protected, input validation, secure password storage

📂 Project Structure
SecureNet-Banking/
│
├── backend/             
→ Spring Boot REST API

│   ├── src/main/java/com/bank
│   ├── src/main/resources
│   └── pom.xml
│
├── frontend/               → React Client UI
│   └── src/
│
├── docker-compose.yml      → Full system infrastructure
└── README.md
