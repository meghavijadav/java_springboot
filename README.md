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

## Run Spring Boot apps from the command line- MS Windows

### 1. echo %JAVA_HOME% or java --version
To check if java is installed

### 2. mvnw package
Package the app 

### 3. java -jar target\mycoolapp-0.0.1-SNAPSHOT.jar
Our app is up and running

## Spring Container 
![image](https://github.com/meghavijadav/java_springboot/assets/100013496/f4f81977-fd50-4bf5-ad5b-97b194c2b21f)

### Primary Functions 
1. Create and Manage objects (Inversion of Control)
2. Inject Object Dependencies (Dependency Injection)

### Configuring Spring Container 
1. Java Annotations
2. Java Source Code

### Injection Types 
1. Constructor Injection- Use this when you have required dependencies (recommended)
2. Setter Injection- Use this when you have option dependencies

### Example Application
![image](https://github.com/meghavijadav/java_springboot/assets/100013496/814c135b-0653-4d47-bcf8-72a08f64ec2c)

### Development Process- Constructor Injection
1. Define the dependency interface and class
2. Create Demo REST Controller
3. Create a constructor in your class for injections
4. Add @GetMapping for /dailyworkout

### @Component Annotation

It marks the class as a Spring Bean which is just a regular Java class that is managed by Spring. It also makes the bean available for dependency injection


   

   

