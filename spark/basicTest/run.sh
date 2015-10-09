#!/bin/bash

#http://spark.apache.org/docs/latest/quick-start.html

echo "please do 'sbt package' before run this cmd"
/git/bigdata/spark/bin/spark-submit  --class "SimpleApp"  --master local[4]  target/scala-2.10/simple-project_2.10-1.0.jar
