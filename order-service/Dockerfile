# Use OpenJDK 21 image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy built JAR from Gradle build
COPY build/libs/order-service-1.0.0.jar app.jar

# Expose the application port (change based on service)
EXPOSE 8084

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
