
# qsc-quickstart-spring

## FastTravel
<a name="FastTravel"></a>


- [Deutsche Version](#deutsch)
- [English Version](#english)



## Deutsch
<a name="deutsch"></a>

**Inhalt**
*1. - [Vorbereitungen](#Vorbereitungen)*
*2. - [Erste Schritte](#ErsteSchritte)*
*3. - [Docker](#Docker)*

## Vorbereitungen
**<a name="Vorbereitungen"></a>**

Bevor Sie die App verwenden Können müssen folgende Tools installiert sein:

- git
- Docker (nur wenn Sie die App über Docker laufen lassen wollen)
- Java
- Maven


## ErsteSchritte
**<a name="ErsteSchritte"></a>**

Als Erstes müssen Sie das Github Repository klonen. Dies können Sie über folgenden Link machen:

https://github.com/quasiris/qsc-quickstart-spring.git


## Docker
**<a name="Docker"></a>**

Alternativ, wenn Sie die App über Docker laufen lassen wollen, können Sie das Docker Image mit folgendem Befehl bauen:

docker build -t="qsc-quickstart-spring" .

Maven build wird während der Erstellung des Docker-Images ausgeführt.
Hinweis: Wenn Sie diesen Befehl zum ersten Mal ausführen, wird es einige Zeit dauern, bis das Basis-Image von DockerHub heruntergeladen ist.

Um den Docker Container nun auszuführen, geben Sie bitte im Terminal folgenden Befehl ein:
docker run -p 8080:8080 qsc-quickstart-spring

Um den Container zu stoppen verwenden Sie folgenden Befehl:

docker stop `docker container ls | grep "qsc-quickstart-spring:*" | awk '{ print $1 }'`

## Der erste Start

Wenn Sie die Applikation zum ersten Mal gestartet und im Browser aufgerufen haben, sollten Sie folgende Suchmaske sehen:


Dort wird Ihnen angezeigt wie viele Dokumente derzeit zum Durchsuchen vorhanden sind. 
Eine leere Suche ist nicht möglich. 

Nachdem Sie gesucht haben. sehen Sie folgendes Interface. Dort haben Sie dann die Möglichkeit die Suchergebnisse zu filtern oder
nach gewissen Kriterien zu sortieren.

- [zurück nach oben](#FastTravel)



## English
<a name="english"></a>

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

- [back to top](#FastTravel)