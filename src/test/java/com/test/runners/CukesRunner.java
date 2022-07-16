package com.test.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        tags = "@wip",
        plugin = {
                //"pretty",
                "html:target/reports/cucumber-report.html",
                "json:target/reports/cucumber-report.json",
                "rerun:target/reports/cucumber-report.txt",
                "me.jvt.cucumber.report.PrettyReports:target/reports/cucumber"},
        features = "src/test/resources/features", //content -> features
        glue = "com/test/stepdefinitions", //source -> step definitions
        dryRun = false,

        publish = false

)

public class CukesRunner {
}
