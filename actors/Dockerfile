FROM java:8-alpine
VOLUME /tmp
ARG JAR_FILE
ADD ./target/${JAR_FILE} /actors.jar
RUN sh -c 'touch /actors.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/actors.jar"]