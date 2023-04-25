FROM openjdk:20
MAINTAINER emisten
RUN mkdir -p /app/service/classes
COPY service/target/classes /app/service/classes
RUN mkdir -p /app/consumer/classes
COPY consumer/target/classes /app/consumer/classes
RUN mkdir -p /app/provider
COPY provider/target/provider-1.0-SNAPSHOT.jar /app/provider/provider.jar
ENTRYPOINT ["java","-p","/app/service/classes;/app/consumer/classes;/app/provider/provider.jar", "-m", "org.example.consumer/org.example.consumer.Consumer"]