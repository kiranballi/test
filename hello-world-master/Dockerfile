# Pull base image 
FROM java:8
WORKDIR /var/app
#COPY /var/lib/jenkins/workspace/Docker_Project/hello-world-master/server/src/main/java/Hello.java /var/app
COPY /server/src/main/java/*.* /var/app
RUN javac AwsbatchApplication.java
CMD ["java","AwsbatchApplication"]
#COPY ./dockerproj.war /usr/local/tomcat/webapps

#ADD /server/1.0-SNAPSHOT/server-1.0-SNAPSHOT.jar app.jar 
#ENTRYPOINT ["java","-jar","/app.jar"] 

