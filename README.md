 # πTaxi-serviceπ

   ![TaxiInsuranceCarInsuranceGIF](https://user-images.githubusercontent.com/106925734/195972316-9ca9d672-fb3f-412c-bf76-34199a7b7950.gif)
                        
πβπ£π ππππ₯ π»ππ€ππ£ππ‘π₯ππ π:π
_______________________________________________
This is a taxi service web application. The main purpose of this application is to keep records of taxi service drivers and cars.
You can find this app [here](https://project-taxi-service.herokuapp.com/login).
To use all features, you need to register as a new driver and log in using the username and password you created.
After that you can:
1. View all drivers;
2. View all cars;
3. View all manufacturers;
4. Create a new machine;
5. Create a new manufacturer;
6. Add a driver to the car.

---------------------------------------
ππππ‘ππππππ₯ππ₯ππ π πππ₯ππππ€:π
________________________________________
Project-based on 3-layer architecture:

πΈ Presentation layer (controllers)

πΈ Application layer (services)

πΈ Data access layer (DAO)
___________________________________________
ππΈπ‘π‘πππππ₯ππ π π₯πππππ ππ ππππ€ π¦π€ππ:π
___________________________________________
πΈJDK 11 πΈMaven πΈMySQL 8.0.28 πΈJDBC πΈHTML, CSS πΈJava Servlet API 4.0.1 πΈTomcat 9.0.50 πΈLog4j 

_______________________________________
ππππ₯π¦π‘:π
_______________________________________

πΈClone this project.

πΈSet up Apache Tomcat (required version 9.0.50) and MySQL.

πΈAdd a new Tomcat Server configuration and select a war-torn artifact to deploy. Set the application context parameter to "/".

πΈOpen MySQL. Create SQL query and copy everything from init_db.sql

πΈIn the package utility, open the ConnectionUtil class and set your credentials there instead of dummies to connect to the database:

private static final String USERNAME = "<DATABASE_USERNAME>";

private static final String PASSWORD = "<DATABASE_PASSWORD>";

private static final String URL = "<URL_TO_DATABASE>";

where:
   <DATABASE_NAME> - database name
   
   <DATABASE_USERNAME> - username
   
   <DATABASE_PASSWORD> - password for the user
   
   <URL_TO_DATABASE> is the database URL (for example jdbc:mysql://db4free.net:3306/taxi_db_?serverTimezone=UTC") :
   
        db4free.net - server name (for the local database: localhost)
        
        3306 - database port number
        
        taxi_db_ - database name
        
πΈRun the project.

