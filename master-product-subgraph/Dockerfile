FROM openjdk:17
EXPOSE 8081

ARG JAR_FILE=build/libs/master.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
