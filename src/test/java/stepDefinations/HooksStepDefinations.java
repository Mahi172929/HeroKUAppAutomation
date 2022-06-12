package stepDefinations;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksStepDefinations {

	ScenarioContext Sc;
	public WebDriver driver;
	public Scenario S;
	public HooksStepDefinations(ScenarioContext Sc) {
		this.Sc=Sc;
	}
	@Before
	public void beforeHook(Scenario S) {
		this.S=S;
	}
	
	@After
	public void afterHook() {
		if(S.isFailed())
			System.out.println("got Screenshot because "+S.getName()+" is failed");
		else
			System.out.println(S.getName()+" is Passed");
		Sc.driver.quit();
	}
}
