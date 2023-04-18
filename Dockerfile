FROM eclipse-temurin:11.0.17_8-jdk
COPY target/activityService-0.0.1-SNAPSHOT.jar activity-service.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","activity-service.jar"]
