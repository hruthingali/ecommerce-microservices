# Use OpenJDK 21 image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy built JAR from Gradle build
COPY build/libs/product-service.jar app.jar

# Expose the application port (change based on service)
EXPOSE 8082

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
