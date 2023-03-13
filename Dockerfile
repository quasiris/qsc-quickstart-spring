FROM openjdk:17

WORKDIR /app

COPY target/qsc-quickstart-spring.jar .

CMD ["java", "-jar", "qsc-quickstart-spring"]

# docker build -t qsc-quickstart-spring .
# docker run -p 8080:8080 qsc-quickstart-spring