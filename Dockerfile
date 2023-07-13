from openjdk:11
VOLUME /tmp
ENV TZ=Asia/Shanghai
ARG JAR_FILE=target/3dtile_java-1.0-SNAPSHOT.jar
COPY target/classes/linux-x86-64/libosg.so.202 /lib/x86_64-linux-gnu/libosg.so.202
COPY target/classes/linux-x86-64/libosgDB.so.202 /lib/x86_64-linux-gnu/libosgDB.so.202
COPY target/classes/linux-x86-64/libosgUtil.so.202 /lib/x86_64-linux-gnu/libosgUtil.so.202
COPY target/classes/linux-x86-64/libOpenThreads.so.21 /lib/x86_64-linux-gnu/libOpenThreads.so.21
COPY ${JAR_FILE} 3dtile_java.jar
RUN ln -snf /usr/share/zoneinfo/$TZ  /etc/localtime && echo $TZ > /etc/timezon
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/3dtile_java.jar"]