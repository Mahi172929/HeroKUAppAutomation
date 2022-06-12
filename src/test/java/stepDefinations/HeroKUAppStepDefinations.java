package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import HeroKUApp.PageObjects.HeroKUApp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.HeroKUBase;


public class HeroKUAppStepDefinations extends HeroKUBase {
	ScenarioContext Sc;
	public WebDriver driver;
	public HeroKUAppStepDefinations(ScenarioContext Sc) {
		this.Sc=Sc;
	}
	@Given("User is on home page of HeroKUAPP")
	public void user_is_on_home_page_of_HeroKUAPP() {
	    // Write code here that turns the phrase above into concrete actions
		if(driver==null) 
		driver=initialiazeDriver();
		String url=getData("url",projectPath);
		driver.get(url);
		Sc.setDriver(driver);
		
	}

	@Then("{string} Page is Displayed")
	public void available_Examples_Page_is_Displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		HeroKUApp hk=new HeroKUApp(driver);
		hk.getTextAvailable(string).isDisplayed();
	}

	@Given("User navigate to {string} Page")
	public void user_navigate_to_Multiple_Windows_Page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		HeroKUApp hk=new HeroKUApp(driver);
		hk.Menu(string).click();
		
	}

	@When("Click on {string}")
	public void click_on_Click_Here(String string) {
	    // Write code here that turns the phrase above into concrete actions
		HeroKUApp hk=new HeroKUApp(driver);
		hk.Menu(string).click();
	}

	@Then("New Child window opened")
	public void new_Child_window_opened() {
	    // Write code here that turns the phrase above into concrete actions
		Set<String> WindowTitles=driver.getWindowHandles();
		Iterator<String> it=WindowTitles.iterator();
		String ParentId=it.next();
		String ChildId=it.next();
		driver.switchTo().window(ChildId);
	}

	@And("Verify the Text {string} at Child Window")
	public void verify_the_Text_at_Child_Window(String string) {
	    // Write code here that turns the phrase above into concrete actions
		HeroKUApp hk=new HeroKUApp(driver);
		hk.getTextAvailable(string).isDisplayed();
	}

	@And("Switch to Main window and Verify {string} Text")
	public void switch_to_Main_window_and_Verify_Text(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Set<String> WindowTitles=driver.getWindowHandles();
		Iterator<String> it=WindowTitles.iterator();
		String ParentId=it.next();
		//String ChildId=it.next();
		driver.switchTo().window(ParentId);
		HeroKUApp hk=new HeroKUApp(driver);
		hk.getTextAvailable(string).isDisplayed();
	}
}
