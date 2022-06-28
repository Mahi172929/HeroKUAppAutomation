package HeroKUApp.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeroKUAppWebTables {

	private WebDriver driver;
	public HeroKUAppWebTables(WebDriver driver) {
		
		this.driver = driver;
	}
	By Headers=By.xpath("//table[@id='table1']//thead//th");
	By DataTables=By.xpath("//*[text()='Data Tables']");
	
	By TableRows=By.xpath("//table[@id='table1']//tbody/tr");
//	By TableCols=By.xpath("//table[@id=\"table1\"]/tbody/tr["+i+"]/td["+j+"]");
	By Table=By.xpath("//table[@id='table1']//tbody");
		public List<WebElement> getHeaders() {
		return driver.findElements(Headers);
	}
	public WebElement getDatatable() {
		return driver.findElement(DataTables);
	}
	public List<WebElement> getTableRows() {
		return driver.findElements(TableRows);
	}
	public WebElement getTable() {
		return driver.findElement(Table);
	}
	public WebElement getRowData(int i, int j) {
		By Rowdata=By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]");
		return driver.findElement(Rowdata);

	}
	public List<WebElement> getTableRowsatIndex(int i) {
		By Rowdata=By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td");
		return driver.findElements(Rowdata);
	}

}
