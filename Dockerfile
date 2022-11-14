FROM maven:latest AS appserver
WORKDIR /usr/src/tsd
COPY pom.xml .
RUN mvn -B -f pom.xml -s /usr/share/maven/ref/settings-docker.xml dependency:resolve
COPY . .
RUN mvn -B -s /usr/share/maven/ref/settings-docker.xml package -DskipTests

FROM java:8-jdk-alpine
WORKDIR /app
COPY --from=appserver /usr/src/tsd/target/tsd-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/tsd-0.0.1-SNAPSHOT.jar"]
