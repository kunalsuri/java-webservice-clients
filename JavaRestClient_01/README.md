# JavaRestClient_01
1. Java client built using Spring Boot Framwork (and using RestTemplate) 


## Pre-requisite
1. VS Code (or other IDE), if you are using VS code it is good to install all the recomended Java packages
2. Note: Spring framework uses Java 17, which can be downloaded from https://adoptium.net/ (OpenJDK)
3. If the Java_Home (linked it Java 17) is not provided, the below cmd will not run

## Running the Java Client
1. Download the folder, unzip it and import the folder to VS Code
2. Run command in Terminal/CLI --> ./mvnw clean package  
3. The command in step 2 is to build the maven project with all the dependencies
4. Run command in Terminal/CLI --> ./mvnw spring-boot:run
5. The command in step4 will execute the program || You can direcly press the "Run Java" in the main program in VS code IDE
6. You will see the output of the REST API in the console