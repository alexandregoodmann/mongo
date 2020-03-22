FROM openjdk:8-jre-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} mongo.jar
ENTRYPOINT ["java","-jar","/mongo.jar"]
EXPOSE 8080
