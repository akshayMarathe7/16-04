package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomepageLocators
{
	WebDriver driver;
	
	
	public HomepageLocators(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Input = By.id("srchword");
	By button = By.xpath(".//input[@type='submit']");
	
	
	@Test
	public WebElement inputdata()
	
	{
		return driver.findElement(Input);	
	}
	

	public WebElement Search()
	{
		return driver.findElement(button);
	}
	
}
