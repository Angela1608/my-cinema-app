# Cinema App
### Project description:
This is a simple project that is based on the user's role, imitates work of the cinema service, maintains CRUD operations and authentication.
### Endpoints:
- POST: /register - permitted for all;
- GET: /cinema-halls - permitted for user/admin;
- POST: /cinema-halls - permitted for admin;
- GET: /movies - permitted for user/admin;
- POST: /movies - permitted for admin;
- GET: /movie-sessions/available - permitted for user/admin;
- POST: /movie-sessions - permitted for admin;
- PUT: /movie-sessions/{id} - permitted for admin;
- DELETE: /movie-sessions/{id} - permitted for admin;
- GET: /orders - permitted for user;
- POST: /orders/complete - permitted for user;
- PUT: /shopping-carts/movie-sessions - permitted for user;
- GET: /shopping-carts/by-user - permitted for user;
- GET: /users/by-email - permitted for admin.

### Project structure (3-layer architecture):
- DAO - data access layer;
- Service - application logic layer;
- Controller - presentation layer.
### Used technologies and libraries:
- Java 11;
- Spring MVC;
- Spring Security;
- Git;
- Apache Tomcat 9.0.65;
- Apache Maven;
- MySQL;
- Hibernate;
- JDBC.
### Steps to run the program on your computer:
- install and configure Apache Tomcat version 9 for your IDE;
- install MySQL;
- fork this project and clone it;
- add your information to  resources/db.properties (URL, login, password, JDBC driver) to be able to connect to your database;
- you have two registered users: 
      - login - bob, password - 123 (ROLE_ADMIN, ROLE_USER); 
      - login - alice, password - 12345 (ROLE_ADMIN);
- run the project.
 


