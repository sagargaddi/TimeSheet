package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Feature_Files", glue="Step_Definitions",
monochrome=true, tags="@SyncLogs")

public class TestNG_Runner extends AbstractTestNGCucumberTests
{
	

}
