FROM maven:3.5-jdk-8-slim AS build
WORKDIR /demoApp
COPY . .
RUN mvn clean install
ENTRYPOINT ["java", "-jar", "target/DemoPro1-1.0-SNAPSHOT.jar", "server", "config.yml"]