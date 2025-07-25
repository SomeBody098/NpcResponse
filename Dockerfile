# SPRING APP

FROM maven:3.8-openjdk-17 AS build
COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package

FROM openjdk:17
COPY --from=build /app/target/NpcResponse.jar /app.jar
CMD ["java", "-jar", "/app.jar"]