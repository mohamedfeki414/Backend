FROM openjdk:17
COPY ./target/microcommerce-0.0.1-SNAPSHOT.jar microcommerce-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "microcommerce-0.0.1-SNAPSHOT.jar"]