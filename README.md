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

### Development Process- Setter Injection

1. Create setter method(s) in your class for injection
2. Configure the dependency injection with @Autowired Annotation

### Multiple Coach Implementation 
![image](https://github.com/meghavijadav/java_springboot/assets/100013496/3c6fee66-9147-4c6e-bece-044ce4cf3643)

### @Primary- Only One
1. When using @Primary, can have only one for multiple implementations.
2. If you mark multiple classes with @Primary ... we have a problem
   ![image](https://github.com/meghavijadav/java_springboot/assets/100013496/f4117725-f0a0-47f8-9f25-d580a8290d99)

### Which one @Qualifier and @Primary?
1. @Qualifier has a higher priority and is more specific - recommended
2.  @Primary leaves it up to the implementation class
3.  Could have an error of multiple @Primary class
4.  @Qualifier allows you to be very specific on which bean you want

### Lazy Initialization 
1. Instead of creating all beans upfront we can specify a Lazy Initialization
2. A bean will be only initialized when- a. It is needed for dependency injection b. or it is explicitly requested
3. To configure other beans we need to add @Lazy to each class
4. Turns into a very tedious work for a large number of classes
5.  ![image](https://github.com/meghavijadav/java_springboot/assets/100013496/9995ee0f-eb21-4b84-b910-85042d02898e)
6. All beans are lazy and no beans are created until needed Including our Demo Controller

![image](https://github.com/meghavijadav/java_springboot/assets/100013496/27b94733-a5cd-4c14-81fa-7430a2ebc55e)
![image](https://github.com/meghavijadav/java_springboot/assets/100013496/15dbe404-8895-4c44-85f7-665b0b16fd37)
![image](https://github.com/meghavijadav/java_springboot/assets/100013496/ce85af57-aa59-4c16-8276-af83485a7ea4)


   
   

   

