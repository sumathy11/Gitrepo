package Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://www.goindigo.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		
	}

		
	}

}
