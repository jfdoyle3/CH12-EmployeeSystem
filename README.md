# CH12 Employee System

------




#### To build and run Springboot from command prompt

./gradlew build && java -jar build/libs/employeesystem-0.0.1-SNAPSHOT (Name of file from \build\libs)

#### Make into a docker container

./gradlew bootBuildImage --imageName={dockerUserName}/employee-system (Image name= docker image name)

#### Run container - container runs, but no response from web browser

docker run {dockerUserName}/employee-system

#### Publish container - container runs, works like it should web browser responds

docker run --publish 8080:8080 {dockerUserName}/employee-system

#### Docker Push to make public

docker push {dockerUserName}/employee-system



#### Web Page: Spring Boot project to docker image

https://spring.io/guides/gs/spring-boot-docker/#:~:text=docker%20build%20-t%20springio%2Fgs-spring-boot-docker.%20This%20command%20builds%20an,and%20a%20spring%20group%20to%20run%20the%20application.




## Deployment

- Check .gitignore file to make sure \deployments isn't there. Remove if it exist.

- Push to github.

- Copy employeesystem-0.0.1-SNAPSHOT.jar file from \build\libs to a directory called \deployments (may have to create)

- Push to github.  Check github to ensure the changes are there.

  
