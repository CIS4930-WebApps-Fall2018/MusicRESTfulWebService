Documentation: 
   Building RESTful Web Services with JAX-RS
 	https://docs.oracle.com/cd/E19798-01/821-1841/6nmq2cp1v/index.html

In provided code, review:
   pom.xml 
   music\src\main
   music\src\main\java\com\musicApp      
   music\src\main\webapp\WEB-INF\web.xml

Create and/or populate database and tables if needed
   >mysql –u root –p
   mysql>use db_example
   mysql> source <YOUR-project-root>\music\src\scripts\createDBTables.sql; 
   mysql> source <YOUR-project-root>\music\src\scripts\populateDBTables.sql;

Build your REST web app as
   .war as archive (.war)
	>mvn clean compile war:war
 OR	
   exploded (full directory structure)
	>mvn  clean compile war:exploded 
Web app
   music\target\music-2.0.3.RELEASE
   Review code structure created to run as a web app
   Move to <YOUR-Tomcat-Installation>\webapps 

Restart Tomcat

==>You can always use IDE, create scripts, define paths, etc. to automate above steps

*Testing
Browser with Developer Tools
   Open Chrome (or browser of choice)
   Open the browser’s Developer Tools
   Go to: 
 	http://localhost:8080/music-2.0.3.RELEASE/music/albums
Note: The web app name (e.g. music-2.0.3.RELEASE) is the name of the folder in your Tomcat\webapps directory

Postman (in Chrome)
   https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en

*Helpful tutorials (although not exact)
   https://www.codejava.net/frameworks/spring/spring-mvc-with-jdbctemplate-example 
   https://www.javacodegeeks.com/2010/11/jaxws-with-spring-and-maven-tutorial.html 
   https://www.mkyong.com/webservices/jax-rs/jersey-hello-world-example/ 



