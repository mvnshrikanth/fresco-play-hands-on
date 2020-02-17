mvn clean compile
mvn exec:java -Dexec.args=10 | tee .output.txt  