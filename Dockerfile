FROM openjdk:8
ADD target/employeeservice.jar employeeservice.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","employeeservice.jar"]