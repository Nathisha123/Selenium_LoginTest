package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.saucedemo.com");
		wd.manage().window().maximize();
		
	WebElement userName = wd.findElement(By.id("user-name"));
	userName.sendKeys("standard_user");
	WebElement passKey = wd.findElement(By.id("password"));
	passKey.sendKeys("secret_sauce");
	WebElement Button = wd.findElement(By.id("login-button"));
	Button.click();
	
	try {
		Thread.sleep(3000);
	}
	catch( InterruptedException e) {
		e.printStackTrace();
	}

	wd.quit();
	}

}
