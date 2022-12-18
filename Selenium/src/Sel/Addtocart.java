package Sel;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(1000);

		String[] itemsNeeded = { "Green Onions 1 Bunch", "Green Bell pepper" };

		driver.get("https://www.amazon.com/alm/storefront?almBrandId=QW1hem9uIEZyZXNo");
		Thread.sleep(2000);
		
	
         List<WebElement> Products=driver.findElements(By.cssSelector("div[class='_alm-carousel-desktop_imageStyle_asinBackgroundOverlay__3Pz90']"));
         
         for(int i=0; i<Products.size();i++)
        	 
         {
        	    String name=Products.get(i).getText();
        		List itemsNeededList = Arrays.asList(itemsNeeded);
        	 
			if(itemsNeededList.contains(name))
			{
        	   driver.findElements(By.cssSelector("input[class='a-button-input']")).get(i).click();
        	
         }
	
         }
	}
}
