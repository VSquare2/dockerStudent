FROM openjdk:11

EXPOSE 8080

COPY target/dockercompose-0.0.1-SNAPSHOT.jar dockercompose-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java","-jar","dockercompose-0.0.1-SNAPSHOT.jar" ]