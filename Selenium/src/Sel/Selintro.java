package Sel;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Selintro {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("https://www.costcotravel.com/Cruises");
driver.manage().window().maximize();
Thread.sleep(100);//URL in the browser
//System.out.println(driver.findElement(By.cssSelector("label[for='cruiseOnlySearch']")).isSelected());
driver.findElement(By.cssSelector("//label[contains(text(),'Alaska Cruise Tours')]")).click();
//Thread.sleep(1000);
//System.out.println(driver.findElement(By.cssSelector("label[for='cruiseOnlySearch']")).isSelected());
//System.out.println(driver.findElements(By.cssSelector("label[style='display: inline-block;']")).size());




}



}




