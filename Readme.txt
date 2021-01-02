Spring-Boot-Test001
* We first add   <parent>
    <artifactId>spring-boot-dependencies</artifactId>
    <groupId>org.springframework.boot</groupId>
    <version>2.4.0</version>
  </parent> Dependency 
* Next under dependencies we add new 
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency> 
dependency
* From application we call SpringApplication.run(Application.class, args); run method.
