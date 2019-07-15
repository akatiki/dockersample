FROM openjdk:8
MAINTAINER Avinash Katiki
ADD target/dockersample.jar dockersample.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "dockersample.jar"]