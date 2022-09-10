# Cinema App
### Project description:
This is a simple project that is based on the user's role, and imitates work of the cinema service, maintains CRUD operations and authentication.
### Project structure (3-layer architecture):
- Controller - presentation layer
- DAO - data access layer
- Service - application logic layer
### Used technologies and libraries:
- Java 11
- Spring MVC
- Spring Security
- Apache Tomcat 9.0.65
- Git
- Apache Maven
- MySQL
- Hibernate
```
ENDPOINTS:
- POST: /register - permitted for all
- GET: /cinema-halls - permitted for user/admin
- POST: /cinema-halls - permitted for admin
- GET: /movies - permitted for user/admin
- POST: /movies - permitted for admin
- GET: /movie-sessions/available - permitted for user/admin
- POST: /movie-sessions - permitted for admin
- PUT: /movie-sessions/{id} - permitted for admin
- DELETE: /movie-sessions/{id} - permitted for admin
- GET: /orders - permitted for user
- POST: /orders/complete - permitted for user
- PUT: /shopping-carts/movie-sessions - permitted for user
- GET: /shopping-carts/by-user - permitted for user
- GET: /users/by-email - permitted for admin
```
### Steps to run the program on your computer:
- Install Apache Tomcat 9.0.60.
- Install MySQL.
- Fork this project and clone it.
- Add your information to  resources/db.properties (URL, login, password, JDBC driver) to be able to connect to your database.
- Run the project.
- You already have two registered users:
    -login - bob, password - 123 (ROLE_USER);
    -login - alice, password - 12345 (ROLE_ADMIN).
 
