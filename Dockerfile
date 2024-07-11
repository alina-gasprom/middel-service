FROM openjdk:17-oracle
COPY build/libs/gpbf-telegram-middle-0.0.1-SNAPSHOT.jar /applicationMS.jar
ENTRYPOINT ["java", "-jar", "applicationMS.jar"]