package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		Thread.sleep(100);
driver.findElement(By.cssSelector("input[name='name']")).sendKeys("sumathy");
driver.findElement(By.cssSelector("input[name='email']")).sendKeys("mukesh@gmail.com");
driver.findElement(By.cssSelector("input[type='password']")).sendKeys("mukesh@gmail.com");
driver.findElement(By.id("exampleCheck1")).click();
WebElement  form = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
Select s=new Select(form);
s.selectByVisibleText("Male");
driver.findElement(By.xpath("//label[@for='inlineRadio1']")).click();
driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("02/11/1992");
driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
System.out.println(driver.findElement(By.cssSelector("input[class='btn btn-success']")).getText());
	}
}
