package week4_day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm)

public class alert_Frame {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button")).click();
		
		Alert frameAlert = driver.switchTo().alert();
		frameAlert.accept();
		
		System.out.println(driver.findElement(By.id("demo")).getText());
		
		
		
	}
}


//
////1st frame
//driver.switchTo().frame(2);
//
////2nd frame
//driver.switchTo().frame("frame2");
//
////click button
//driver.findElement(By.id("Click")).click();
//
////switch to parent immediate frame
//driver.switchTo().parentFrame();
//
////switch main page
//driver.switchTo().defaultContent();
//
////webelement
//WebElement frame1 = driver.findElement(By.id("frame2"));
//driver.switchTo().frame(frame1);

