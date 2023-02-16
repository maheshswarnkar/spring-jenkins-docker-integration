FROM openjdk:17
EXPOSE 9091
ADD target/spring-jenkins-docker-integration.jar spring-jenkins-docker-integration.jar
ENTRYPOINT ["java", "-jar", "/spring-jenkins-docker-integration.jar"]
MAINTAINER maheshswarnkar <mahesh.swarnkar1984@gmail.com>

