FROM openjdk:17
COPY ./target/Microcommerce-0.0.1-SNAPSHOT.jar Microcommerce-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "Microcommerce-0.0.1-SNAPSHOT.jar"]