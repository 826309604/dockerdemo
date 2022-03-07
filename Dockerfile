FROM openjdk:8-jdk-slim
LABEL maintainer=songhuanhuan
COPY target/*.jar /app.jar
ENTRYPOINT ["java","-jar","dockerdemo-0.0.1-SNAPSHOT.jar"]