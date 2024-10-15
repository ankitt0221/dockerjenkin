FROM openjdk:21-jdk
COPY target/docker.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
