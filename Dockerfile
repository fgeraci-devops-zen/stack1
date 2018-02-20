FROM openjdk:8-jre-alpine

RUN mkdir -p /opt/app
WORKDIR /opt/app

COPY ./run_jar.sh ./stack1-demo001.jar ./

ENTRYPOINT ["./run_jar.sh"]