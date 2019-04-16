package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageLocators
{
	WebDriver driver;
	
	public LoginPageLocators(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
By User= By.xpath(".//*[@id='login1']");
By Pass = By.xpath(".//*[@id='password']");
By Go=By.xpath("//input[@type='submit']");
By Home = By.xpath("html/body/div[1]/div[1]/div[2]/a");


public WebElement User()
{
	
return	driver.findElement(User);
	
}

public WebElement Pass()
{
	
	return driver.findElement(Pass);
	
}

public WebElement GoButton()

{
	return driver.findElement(Go);
	
}

public WebElement homebutton()
{
	return driver.findElement(Home);
}

}
