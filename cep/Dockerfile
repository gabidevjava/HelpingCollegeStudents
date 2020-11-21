FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cep-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/cep-0.0.1-SNAPSHOT.jar"]