package stepDefinations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

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
	public void afterHook() throws IOException {
		if(S.isFailed()) {
			System.out.println("got Screenshot because "+S.getName()+" is failed");
			Date d=new Date();
			String dscrFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
			TakesScreenshot scrShot =((TakesScreenshot)Sc.driver);
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File DstFile = new File("C:\\Users\\tmahe\\eclipse-workspace\\Automation\\target\\Screnshots//"+dscrFile);
			FileHandler.copy(SrcFile, DstFile);
		}
		else
			System.out.println(S.getName()+" is Passed");
		Sc.driver.quit();
	}
}
