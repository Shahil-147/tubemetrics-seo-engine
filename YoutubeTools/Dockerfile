# Use official Java image
FROM eclipse-temurin:21-jdk-jammy

# Set working directory
WORKDIR /app

# Copy jar file
COPY target/*.jar app.jar

# Port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]