                             【T】【a】【x】【i】-【s】【e】【r】【v】【i】【c】【e】

![img_2.png](img_2.png)

🚖ℙ𝕣𝕠𝕛𝕖𝕔𝕥 𝔻𝕖𝕤𝕔𝕣𝕚𝕡𝕥𝕚𝕠𝕟:🚖
_______________________________________________
This is a web application a taxi service.The main purpose of this application is to keep records of taxi service drivers and cars.
To use all features you need to create new driver and log in
![img.png](img.png)
![img_4.png](img_4.png)
after that you can:
![img_3.png](img_3.png)

🚖𝕊𝕖𝕥𝕦𝕡:🚖
_________________________
🔸Clone this project.
🔸Set up Apache Tomcat (required version 9.0.50) and MySQL.
🔸Add a new Tomcat Server configuration and select a war-torn artifact to deploy. Set the application context parameter to "/".
🔸Open MySQL. Create SQL query and copy everything from init_db.sql
🔸In the package utility, open the ConnectionUtil class and set your credentials there instead of dummies to connect to the database:
private static final String USERNAME = "<DATABASE_USERNAME>";
private static final String PASSWORD = "<DATABASE_PASSWORD>";
private static final String URL = "<URL_TO_DATABASE>";
where:
   <DATABASE_NAME> - database name
   <DATABASE_USERNAME> - username
   <DATABASE_PASSWORD> - password for the user
   <URL_TO_DATABASE> is the database URL (for example jdbc:mysql://db4free.net:3306/taxi_db_?serverTimezone=UTC") :
        db4free.net - server name (for local database: localhost)
        3306 - database port number
        taxi_db_ - database name
🔸Run the project.

🚖𝕀𝕞𝕡𝕝𝕖𝕞𝕖𝕟𝕥𝕒𝕥𝕚𝕠𝕟 𝕕𝕖𝕥𝕒𝕚𝕝𝕤:🚖
__________________________
Project based on 3-layer architecture:

🔸 Presentation layer (controllers)
🔸 Application layer (services)
🔸 Data access layer (DAO)

🚖𝔸𝕡𝕡𝕝𝕚𝕔𝕒𝕥𝕚𝕠𝕟 𝕥𝕖𝕔𝕙𝕟𝕠𝕝𝕠𝕘𝕚𝕖𝕤 𝕦𝕤𝕖𝕕:🚖
_______________________________
🔸JDK 11 🔸Maven 🔸MySQL 8.0.28 🔸JDBC 🔸HTML, CSS 🔸Java Servlet API 4.0.1 🔸Tomcat 9.0.50 🔸Log4j 

