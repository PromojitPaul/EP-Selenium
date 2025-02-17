package fileUploadDownload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadDownloadTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Upload a sample PDF file on a file upload form.
		WebElement file = driver.findElement(By.cssSelector("#fileInput"));
		file.sendKeys("F:\\EP-Selenium B42.pdf");
		driver.findElement(By.cssSelector("#fileSubmit")).click();

	}

}
