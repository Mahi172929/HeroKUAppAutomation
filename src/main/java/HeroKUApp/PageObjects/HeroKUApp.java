package HeroKUApp.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeroKUApp {
	private WebDriver driver;
	
	public HeroKUApp(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getTextAvailable(String s) {
		 By TextAvailable=By.xpath("//*[text()='"+s+"']");
		 return driver.findElement(TextAvailable);

	}
	
	public WebElement Menu(String string) {
		By Menu=By.xpath("//*[text()='"+string+"']");
		return driver.findElement(Menu);
	}
	
}
