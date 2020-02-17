mvn clean compile
mvn exec:java | tee .output.txt  
mvn test | tee .test.txt  