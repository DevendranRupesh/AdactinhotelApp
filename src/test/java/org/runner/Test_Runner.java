package org.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\java\\Feature\\login.feature"},
		dryRun =!true,
		glue  = {"org.Step_Definition","org.Hooks"},
		snippets= SnippetType.CAMELCASE,
		monochrome= true,
		plugin= {"pretty","json:target/cucumber.json",
				"html:target/cucumber.html",
				"junit:target/cucumber.xml",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				
				
		
		}
		
	
		)
public class Test_Runner {

}

