# CH12-EmployeeSystem


# To build and run Springboot from command prompt
./gradlew build && java -jar build/libs/employeesystem-0.0.1-SNAPSHOT (Name of file from \build\libs)

# Make into a docker container
./gradlew bootBuildImage --imageName=jfdoyle3/employee-system (Image name= docker image name)

# Run container - container runs, but no response from web browser
docker run jfdoyle3/employee-system

# Publish container - container runs, works like it should web browser responds
docker run --publish 8080:8080 jfdoyle3/employee-system

# Docker Push to make public
docker push jfdoyle3/employee-system


https://spring.io/guides/gs/spring-boot-docker/#:~:text=docker%20build%20-t%20springio%2Fgs-spring-boot-docker.%20This%20command%20builds%20an,and%20a%20spring%20group%20to%20run%20the%20application.