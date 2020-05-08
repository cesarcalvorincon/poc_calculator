# POC Calculator

### Steps to build and run the service


+ Install tracer local library
 
	mvnw org.apache.maven.plugins:maven-install-plugin:3.0.0-M1:install-file -Dfile=./lib/tracer-1.0.0.jar

+ Build, test and package

	mvnw package

+ Execute service. Default listening port is 8080

	java -jar ./target/calculator-0.0.1-SNAPSHOT.jar