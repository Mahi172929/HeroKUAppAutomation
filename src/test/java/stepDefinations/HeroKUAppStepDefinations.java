package stepDefinations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.BiConsumer;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import HeroKUApp.PageObjects.HeroKUApp;
import HeroKUApp.PageObjects.HeroKUAppFrames;
import HeroKUApp.PageObjects.HeroKUAppWebTables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
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
	@When("Switch to Middle Frame on Top Frame")
	public void switch_to_Middle_Frame_on_Top_Frame() {
	    // Write code here that turns the phrase above into concrete actions
		HeroKUAppFrames hf=new HeroKUAppFrames(driver);
	
		driver.switchTo().frame(hf.getTopFrameName());
		driver.switchTo().frame(hf.getMiddleTopFrameName());
		
	}

	@Then("Verify the Text {string} at the middle frame")
	public void verify_the_Text_at_the_middle_frame(String string) {
	    // Write code here that turns the phrase above into concrete actions
		HeroKUAppFrames hf=new HeroKUAppFrames(driver);
		hf.Text().getText().equalsIgnoreCase(string);
	}
	@And("Switch to parent Frame and display name")
	public void switch_to_parent_Frame_and_display_name() {
	    // Write code here that turns the phrase above into concrete actions
		HeroKUAppFrames hf=new HeroKUAppFrames(driver);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(hf.LeftFrameName());
		hf.LeftTopText().getText().equalsIgnoreCase("LEFT");
	}

	@When("user is able to see the {string}")
	public void user_is_able_to_see_the_data_table(String string) {
    // Write code here that turns the phrase above into concrete actions
		HeroKUAppWebTables hw=new HeroKUAppWebTables(driver);
		hw.getDatatable().getText().equalsIgnoreCase(string);
		
	}

	@Then("Verify the data table functionalities")
	public void verify_the_data_table_functionalities() {
    // Write code here that turns the phrase above into concrete actions
		HeroKUAppWebTables hw=new HeroKUAppWebTables(driver);
		int n=hw.getHeaders().size();
		ArrayList<String> headers=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			headers.add(hw.getHeaders().get(i).getText());
		}
		String[] Actual= {"Last Name","First Name","Email","Due","Web Site","Action"};
		for(int i=0;i<n;i++) {
			headers.get(i).equalsIgnoreCase(Actual[i]);
		}
		
	}
	@And("Verify the a row with {string} , {string}, {string},{string}, {string} exists on the table")
	public void verify_the_a_row_with_exists_on_the_table(String string, String string2, String string3, String string4, String string5) {
	    // Write code here that turns the phrase above into concrete actions
		HeroKUAppWebTables hw=new HeroKUAppWebTables(driver);
		int rowcount=hw.getTableRows().size();
		int colcount=hw.getHeaders().size();
		
		
		ArrayList<String> rows_table=new ArrayList<String>();
		
    	//To calculate no of rows In table.
		System.out.println(rowcount +" "+colcount);
		int k=0;
		for(int i=1;i<=rowcount;i++) {
			for(int j=1;j<=colcount;j++) {
				String s=hw.getRowData(i, j).getText();
				if(s.equals(string)) {
					k=i;
					break;
				}
			}
		}
		if(k!=0) {
		for(int i=0;i<colcount;i++) {
			rows_table.add(hw.getTableRowsatIndex(k).get(i).getText().trim());		
			
			}
		}
		else {
			for(int i=0;i<colcount;i++) {
				rows_table.add("Dummytext");		
				
				}
		}
		
		String [] actual= {string,string2,string3,string4,string5};
		
		rows_table.forEach((s)->System.out.println(s));
		for(int i=0;i<actual.length;i++) {
			//rows_table.get(i).equalsIgnoreCase(actual[i]);	
			org.junit.Assert.assertEquals(actual[i],rows_table.get(i));
			
			}
		
		
	}
}
