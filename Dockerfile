FROM openjdk:17-ea-10-jdk-alpine
COPY target/security-1.jar security-1.jar
ENTRYPOINT ["java","-jar","security-1.jar"]