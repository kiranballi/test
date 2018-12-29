# Pull base image 
From tomcat:8-jre8 

# Maintainer 
MAINTAINER "kiran.balli@cognizant.com" 
COPY ./dockerproj.war /usr/local/tomcat/webapps
