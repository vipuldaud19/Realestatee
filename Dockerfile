# Use official OpenJDK 17 image
FROM openjdk:17-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy the entire project
COPY . .

# Build the project with Maven inside Docker, skipping tests
RUN ./mvnw clean package -DskipTests

# Run the JAR produced by Maven
ENTRYPOINT ["java", "-jar", "target/realestate-0.0.1-SNAPSHOT.jar"]
