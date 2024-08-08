FROM openjdk:17-alpine
LABEL maintainer="info@javabydeveloper.com"
WORKDIR /myapp
COPY target/optinfraerp-0.0.1-SNAPSHOT.jar /myapp/my-app.jar
ENTRYPOINT ["java", "-jar", "my-app.jar"]
