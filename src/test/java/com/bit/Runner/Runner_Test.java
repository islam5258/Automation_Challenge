package com.bit.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/nazrulislam/Desktop/Eclipse/Eclipse-workspace/Automation_Challenge/search.feature", 
    glue = {"com.bit.stepDef" }, 
      plugin = { "pretty:html:report" })

public class Runner_Test {

}
