package com.genaidemo.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@ComponentScan
@EnableAutoConfiguration
public class TestMainJava {
    public static void main(String[] args) {

        String tagName = "@loginTest3";


        String numberOfThreads = "1";
        for (int i = 0; i < args.length; i++) {
            if (i == 0) {
                tagName = args[i];
            }
            if (i == 1) {
                numberOfThreads = args[i];
            }
        }
        log.info("TestMain Starting Test Tag:" + tagName);
        log.info("Threads count:" + numberOfThreads);
        String[] cucumberOptionsArguments = {"--threads", numberOfThreads, "classpath:features", "--glue", "com.genaidemo.demo", "--tags", tagName, "--plugin", "junit:report/junitreport.xml", "--plugin", "html:report/htmlreport.html", "--plugin", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"};
        io.cucumber.core.cli.Main.main(cucumberOptionsArguments);
    }

}
