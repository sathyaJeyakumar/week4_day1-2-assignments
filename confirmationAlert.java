package week4_day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmationAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//h5[contains(text(),'Alert (Prompt Dialog)')]/following-sibling::button")).click();
		Alert ConfirmAlert = driver.switchTo().alert();
		ConfirmAlert.sendKeys("Testing Confirm alert");
	//	ConfirmAlert.accept();
		
		

	}

}
