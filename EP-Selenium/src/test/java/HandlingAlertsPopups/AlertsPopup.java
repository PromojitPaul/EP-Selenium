package HandlingAlertsPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");

				
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert aleart1 = driver.switchTo().alert();
		aleart1.accept();
	                        
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(6000);
		Alert aleart2 = driver.switchTo().alert();
		aleart2.accept();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		driver.switchTo().alert().dismiss();
		
		
		
		
	}

}
