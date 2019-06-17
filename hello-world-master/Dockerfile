# Pull base image 
FROM java:8
WORKDIR /var/app
COPY src/main/java/*.* /var/app
RUN javac Hello.java
CMD ["java","Hello"]
#COPY ./dockerproj.war /usr/local/tomcat/webapps

#ADD /server/1.0-SNAPSHOT/server-1.0-SNAPSHOT.jar app.jar 
#ENTRYPOINT ["java","-jar","/app.jar"] 

