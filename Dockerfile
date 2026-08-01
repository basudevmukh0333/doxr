FROM openjdk:17-ea-8-jdk-slim

MAINTAINER doxr

COPY target/Employee-0.0.1-SNAPSHOT.jar Employee-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","Employee-0.0.1-SNAPSHOT.jar"]
