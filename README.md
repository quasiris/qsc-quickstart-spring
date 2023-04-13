
# qsc-quickstart-spring

The QSC Quickstart Spring project on GitHub is a Java project based on the Spring framework that is an example of using Spring to develop web applications. It uses the Spring Boot Framework, which simplifies the configuration and deployment of Spring-based applications.

The application is not yet finished, but there are already some implementations of Spring MVC controllers and REST endpoints that receive the HTTP requests and generate the corresponding HTTP responses. There are also implementations of JPA repositories and service classes that manage the data access and business logic of the application.

The project is divided into different packages to organise the components of the application. The "config" package contains the configurations of the Spring beans. In the "controller" package there are various Spring MVC controller classes that receive the requests from the clients and generate the responses. The "model" package contains the data models of the application, while the "repository" package contains the implementations of the JPA repositories. The service classes are organised in the "service" package.

Overall, it looks like the project is to build a web application developed with Spring and providing RESTful endpoints. The application uses the Spring Boot framework to simplify the configuration and deployment of the application. It is not yet clear what kind of application the project will end up being, but there already seems to be a good foundation for a Spring-based web application.


**Content**
*1. - [Preparations](#Preparations)*
*2. - [First Steps](#FirstSteps)*
*3. - [Using Docker](#UsingDocker)*


## Preparations

Before you can use the app, the following tools must be installed:

Must Have
- Docker (only if you want to run the app via Docker)
- git

Optional
- Java
- Maven

## FirstSteps

First, you need to clone the github repository. You can do this via the following link:

https://github.com/quasiris/qsc-quickstart-spring.git

## UsingDocker

Alternatively, if you want to run the app via Docker, you can build the Docker image with the following command:

docker build -t="qsc-quickstart-spring" .

Maven build will be run while the Docker image is being built.
Note: When you run this command for the first time, it will take some time to download the base image from DockerHub.

To run the Docker container now, please enter the following command in the terminal:
docker run -p 8080:8080 qsc-quickstart-spring

To stop the container use the following command:

docker stop `docker container ls | grep "qsc-quickstart-spring:*" | awk '{ print $1 }'`
