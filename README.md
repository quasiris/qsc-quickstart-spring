
# qsc-quickstart-spring

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
