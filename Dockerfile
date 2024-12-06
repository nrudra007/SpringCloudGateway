FROM openjdk:17

WORKDIR /app

COPY ./target/first-demo-app.jar /app

EXPOSE 8091
CMD ["java", "-jar", "first-demo-app.jar"]