package Sel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//body/div[2]")).getText());
		driver.findElement(By.linkText("Click Here")).click();
		Set<String>windows = driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String Parentid = it.next();
		String childid = it.next();
//		String subchild = it.next();
		driver.switchTo().window(childid);
	
//		driver.switchTo().window(subchild);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		driver.quit();
	}

}
