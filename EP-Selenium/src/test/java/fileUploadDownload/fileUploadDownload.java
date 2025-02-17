package fileUploadDownload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadDownload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("F:\\EP-Selenium B42.pdf");
        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
        driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[normalize-space()='resume.pdf']")).click();
	}

}
