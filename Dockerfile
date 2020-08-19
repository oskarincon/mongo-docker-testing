FROM maven:4.0.0-jdk-8-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:8-jdk-alpine
COPY target/*.jar  app.jar 
ENTRYPOINT ["java","-jar","app.jar"]