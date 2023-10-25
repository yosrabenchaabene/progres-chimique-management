FROM openjdk:11
WORKDIR /app
ADD target/test-0.0.1.jar test-0.0.1.jar
EXPOSE 8089
CMD ["java", "-jar", "test-0.0.1.jar"]
