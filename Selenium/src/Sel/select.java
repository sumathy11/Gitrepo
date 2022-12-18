package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement vacation_package = driver.findElement(By.cssSelector("select[name='vacation_package_destination']"));
		Select s = new Select(vacation_package);
		s.selectByVisibleText("Canada");
		Thread.sleep(40000);

	}

}
