# Step 1: Build JAR
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

COPY . .

# Go inside inner folder
WORKDIR /app/YoutubeTools

RUN mvn clean package -DskipTests

# Step 2: Run app
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

COPY --from=build /app/YoutubeTools/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]