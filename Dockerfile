FROM openjdk:11.0.5-slim
COPY . /tmp
WORKDIR /tmp
RUN ./gradlew build
ENTRYPOINT java -jar build/libs/SpringMicroservicesDemo-0.0.1-SNAPSHOT.jar