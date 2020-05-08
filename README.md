# POC Calculator

### Steps to build and run the service


+ Install the tracer. It is a local library so you have to install it in your local maven repository
 
 	
	mvnw org.apache.maven.plugins:maven-install-plugin:3.0.0-M1:install-file -Dfile=./lib/tracer-1.0.0.jar

+ Build, test and package

	mvnw package

+ Execute service. Default listening port is 8080

	java -jar ./target/calculator-0.0.1-SNAPSHOT.jar
	
### Possible improvement

To avoid local libraries (tracer) in the final project, we can use a private repository. For example Archiva or Nexus