# Spring Boot with Feign/Ribbon/Hystrix example

Simple Spring Boot application:
* feign client
    * ribbon - load balancer, retries configurations...
    * hystrix - fallback

### Get started

Run the Spring Boot application:
```bash
./gradlew bootRun
```
Fetch user:
```bash
curl http://localhost:8080/
```

### Configurations

```yaml
user-client:
  ribbon:
    eureka:
      # Disables eureka for simple demo
      enabled: false
    # List of urls for user-client
    listOfServers: localhost:8080
    # Max number of retries on the same server (excluding the first try)
    MaxAutoRetries: 5
    # Max number of next servers to retry (excluding the first server)
    MaxAutoRetriesNextServer: 5
    # Interval to refresh the server list from the source
    ServerListRefreshInterval: 2000
    # Whether all operations can be retried for this client
    OkToRetryOnAllOperations: true
    # Connect timeout used by Apache HttpClient
    ConnectTimeout: 3000
    # Read timeout used by Apache HttpClient
    ReadTimeout: 3000

feign:
  hystrix:
    # Enable hystrix for feign
    enabled: true

logging:
  level:
    com:
      # Enables debug logs for demo
      netflix: DEBUG
```

### Reference Documentation
* [Feign client documentation](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html)
* [Ribbon documentation](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-ribbon.html)
* [Hystrix documentation](https://cloud.spring.io/spring-cloud-netflix/multi/multi__circuit_breaker_hystrix_clients.html)
