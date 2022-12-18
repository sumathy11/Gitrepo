package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openga.selenium.interactions.Actions;

public class Fullproject {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.manage().window().maximize();
		String mara = driver.getTitle();
		System.out.println(mara);
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("RAHULSHETTYACADEMY");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Teacher");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		driver.quit();

	}
}
