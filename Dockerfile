FROM openjdk:8-jre-alpine

RUN mkdir -p /opt/app
WORKDIR /opt/app

COPY ./target/scala-2.12/stack1-demo001.jar ./stack1-demo001.jar
COPY ./run-jar.sh ./run-jar.sh
RUN chmod +x ./run-jar.sh

CMD "./run-jar.sh"