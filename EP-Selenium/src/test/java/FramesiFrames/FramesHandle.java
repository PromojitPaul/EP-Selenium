package FramesiFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		// Navigate to the Frames page
		driver.switchTo().frame(1);
	    WebElement heading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		String headingText = heading.getText();
	    System.out.println(headingText);
		
	
		driver.quit(); 

	}

}
