FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/ReceiveXCBLOrder-0.0.1-SNAPSHOT.jar ReceiveXCBLOrder.jar
EXPOSE 8082
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ReceiveXCBLOrder.jar"]