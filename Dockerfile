FROM openjdk:8
EXPOSE 8090
ADD /target/Aero-0.0.1-SNAPSHOT.jar Aero-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Aero-0.0.1-SNAPSHOT.jar"]