## XFleet Fleet Management and CRM Project

### Cucumber Framework for XFleet Application
## _Framework Format_

<img src="https://github.com/YasinDeger48/XFleet_Cucumber/blob/master/cucumber.png" width="80" height="80">


## Clone the repository and make the desired code changes:

```sh
git clone https://github.com/YasinDeger48/XFleet_G21_Project.git
```


create Java packages:
> runners,
> pages(POM),
> utilities,
> step_definitions

### Runners directory,
- This classes just needs annotations to understand that cucumber features would be run through it and you can specify feature files to be picked up plus the steps package location.

### Pages (POM) directory,
- Page Object Model, also known as POM, is a design pattern in Selenium that creates an object repository for storing all web elements. It is useful in reducing code duplication and improves test case maintenance. In Page Object Model, consider each web page of an application as a class file.

### Utilities Directory,
- To store utility like Excel Utility, Config Utility, Report Utility, Database Utility, Screenshot Utility, Driver, CucumberRunnerTest etc. We can also keep util in src/main/java if dev and test code is in same framework.

### Step Definitions Directory,
- To store cucumber step definitions

Create Utility packages:
> Driver(Singleton Design Pattern),
> BrowserUtils,
> ConfigurationReader

### Driver Class benefits,
- We are writing too many lines just to be able to instantiate our WebDriver
- We are having hard time to pass the SAME 'driver' instance around in our project.When we are using any utilty method, currently we have to pass "WebDriver driver" as argument in each utility method.
- Singleton Design Pattern guarantuees to return same object everytime we want to use the object.


### BrowserUtils Class benefits,
- We need that for basic and easy to understandable code
- Also include static wait


### ConfigurationProperties benefits,
- to avoid hard coding,
- externilize the test data and avoid effecting the project,
- centerlized location,
- cross browser testing

create resources directory same level with java directory the purpose is to hold our scenarios for the project
## Quick Start:

1.  Download the lastest stable release or clone the git repo
```sh
git clone https://github.com/YasinDeger48/XFleet_G21_Project.git
```
2.  Open IDE and update all maven libraries
    <img src="https://github.com/YasinDeger48/Automation_Exercise_Shopping_and_CRM/blob/master/maven%20reset.png" width="80" height="60">

4.  if you use gradle or Ant you can choose your library base on the requirements

(You can find all libraries [here](https://mvnrepository.com/))



## Requirements (Dependencies):

Selenium 3:
> Version 3.141.59

```sh
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>
```


WebDriver:
> Version 5.0.3 (Bonigarcia)

```sh
<dependency>
     <groupId>io.github.bonigarcia</groupId>
     <artifactId>webdrivermanager</artifactId>
     <version>5.0.3</version>
</dependency>
```
Java Faker:
> Version 1.0.2

```sh
<dependency>
     <groupId>com.github.javafaker</groupId>
     <artifactId>javafaker</artifactId>
     <version>1.0.2</version>
</dependency>
```


Cucumber-Java:
> Version 7.4.0

```sh
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.4.0</version>
</dependency>
```

Cucumber-JUnit:
> Version 7.4.0

```sh
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>7.4.0</version>
    <scope>test</scope>
</dependency>
```

Maven Surefire Plugin:
> Version 3.0.0 M7

```sh
    <build>
        <plugins>

            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M7</version>
                <configuration>
                    <includes>
                        <include>*CukesRunner.class</include>
                    </includes>
                    <parallel>methods</parallel>
                    <threadCount>3</threadCount>
                </configuration>
            </plugin>

        </plugins>
    </build>
```
