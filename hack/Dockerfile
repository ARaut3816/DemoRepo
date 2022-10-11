FROM openjdk:8
ENV APP_HOME=/usr/app
WORKDIR ${APP_HOME}
ADD /target/hack-0.0.1-SNAPSHOT.jar hack-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","hack-0.0.1-SNAPSHOT.jar"]