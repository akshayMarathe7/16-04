package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import locators.HomepageLocators;
import locators.LoginPageLocators;

public class LoginPageTestCases 
{
	
	public static void main( String args[]) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Soft\\Selenium\\ChromeDriver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		LoginPageLocators dr = new LoginPageLocators(driver);
		
		dr.User().sendKeys("akshay");
		dr.Pass().sendKeys("12345");
	//	dr.GoButton().click();
		Thread.sleep(2000);
		dr.homebutton().click();
		Thread.sleep(2000);
		
		
		HomepageLocators dr2 = new HomepageLocators(driver);
		
		Thread.sleep(2000);
		
		dr2.inputdata().sendKeys("apple");
		dr2.Search().click();
		
		System.out.println("End");
	}
	



}
