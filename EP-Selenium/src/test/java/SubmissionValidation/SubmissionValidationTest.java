package SubmissionValidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmissionValidationTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("#username")).sendKeys("student");
		driver.findElement(By.cssSelector("#password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		
		
	}

}
