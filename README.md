# POC for CICD
#### Java melody added for Monitoring 
( Spring MVC project , pom and web.xml updated to intergrate Java melody)

Java melody monitoring screen can be access by below URL :
### http://host:port/springMVC/monitoring

Sample rest API can be access by (will retrun sample json string):
### http://host:port/springMVC/rest/shop/get/suprakash

You can use Apache Benchmark tool to simulate the above rest service. Use this below commands from windows command promt, make sure you have Apache Benchmark tool installed and set in enviornment path.

### ab -n 5000 -c 10 http://host:port/springMVC/rest/shop/get/suprakash

The above command will simulate 5000 requests to that rest call, with a maximum of 10 requests running concurrently. This will give some data to see in Java Melody screen to monitor
