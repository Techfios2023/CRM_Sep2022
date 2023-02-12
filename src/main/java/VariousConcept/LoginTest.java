package VariousConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// set up system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\QA Work\\Selinium\\First_Selenium_Class\\chromedriver.exe ");
		// object to evoke browser
		WebDriver driver= new ChromeDriver();
		// handle  cookies/cheche-- delete
		driver.manage().deleteAllCookies();
		// go to the website
		driver.get("https://techfios.com/billing/?ng=contacts/companies/");
		//maximize
		driver.manage().window().maximize();
		//
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		// click signin
		driver.findElement(By.name("login")).click();
		
		driver.close();
		
		
	}

}
