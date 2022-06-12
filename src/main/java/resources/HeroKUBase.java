package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HeroKUBase {

	private WebDriver driver;
	public String projectPath;
	public HeroKUBase() {
		projectPath=System.getProperty("user.dir");
	}

	public WebDriver initialiazeDriver() {
		
		
		String Browsername=getData("browser",projectPath);
		
		if(Browsername.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\tmahe\\OneDrive\\Documents\\Drivers\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if (Browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/src/main/java/resources/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		return driver;
		
	}
	public String getData(String S, String projectPath) {
		Properties prop=new Properties();
		FileInputStream fis = null;
		
		try {
			
			fis=new FileInputStream(projectPath+"/src/main/java/resources/data.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String S1=prop.getProperty(S);
		return S1;
	}
}
