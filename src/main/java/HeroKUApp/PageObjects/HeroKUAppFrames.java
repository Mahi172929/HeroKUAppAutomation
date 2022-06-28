package HeroKUApp.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeroKUAppFrames {
	private WebDriver driver;
	public HeroKUAppFrames(WebDriver driver) {
		
		this.driver = driver;
	}
	private String TopFrameName="frame-top";
	private String MiddleTopFrameName="frame-middle";
	private String LeftFrameName="frame-left";
	public String getMiddleTopFrameName() {
		return MiddleTopFrameName;
	}
	public String getTopFrameName() {
		return TopFrameName;
	}
	public String LeftFrameName() {
		return LeftFrameName;
	}
	
	
	By LeftTopText=By.xpath("//body");
	By Text=By.xpath("//div");
	
	public WebElement Text() {
		return driver.findElement(Text);
	}
	public WebElement LeftTopText() {
		return driver.findElement(LeftTopText);
	}
	
	
}
