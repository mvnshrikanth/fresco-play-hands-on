#!/bin/sh
score=0
pass=0
fail=0
mvn clean compile
mvn exec:java | tee .output.txt  
mvn test | tee .test.txt
TEST_1=$(grep -o -e "maven-compiler-plugin" -e "exec-maven-plugin" -e "javaApp.PrimeSum" -e "junit" pom.xml | wc -l)
TEST_2=$(grep -o -e "BUILD SUCCESS" -e "77" .output.txt | wc -l)
TEST_3=$(grep -o -w -e "BUILD SUCCESS" -e "Tests run: 3" -e "Failures: 0" -e "Errors: 0" .test.txt | wc -l)
TEST_4=$(grep -o -e "num" -e "sum" -e "maxNum" -e "primesum" -e "primesum(20)" ./src/main/java/javaApp/PrimeSum.java | wc -l)
TEST_5=$(find ./target/surefire-reports/*.xml | wc -l)
if [ "$TEST_1" -ge 4 ]
then ((pass++))
else
    ((fail++))
fi;
if [ "$TEST_2" -ge 2 ]
then ((pass++))
else
    ((fail++))
fi;
if [ "$TEST_3" -ge 4 ]
then ((pass++))
else
    ((fail++))
fi;
if [ "$TEST_4" -ge 6 ]
then ((pass++))
else
    ((fail++))
fi;
if [ "$TEST_5" -eq 1 ]
then ((pass++))
else
    ((fail++))
fi;
echo "Total testcase: 5"
echo "Total testcase passed: $pass"
echo "Total testcase fail: $fail"
echo "total score: $(( ($pass * 100) / 5))"