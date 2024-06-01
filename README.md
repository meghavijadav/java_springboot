# Notes 
## Running SpringBoot from the command lines

Two Options for running the app 
1. Using java -jar
   > java -jar myapp.jar
2. Use Spring Boot Maven plugin - mvnw spring-boot:run
   -> mvnw allows you to run a Maven Project
   -> mvnw.cmd for MS Windows
             > mnvw clean compile test
   
Development Process
1. Exit IDE
2. Package the app using mvnw package
3. Run app using java -jar
4. Run app using Spring Boot Maven plugin, mvnw spring-boot:run

##Run Spring Boot apps from the command line- MS Windows

### 1. echo %JAVA_HOME% or java --version
To check if java is installed

### 2. mvnw package
Package the app 

### 3. java -jar target\mycoolapp-0.0.1-SNAPSHOT.jar
Our app is up and running

   

