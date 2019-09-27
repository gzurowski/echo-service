FROM openjdk:8-jre-alpine

MAINTAINER zurowski.org

COPY target/echo-service*.jar echo-service.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","echo-service.jar"]
