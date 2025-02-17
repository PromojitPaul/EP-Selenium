package searchAddtoCart;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAddtoCartTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open the e-commerce website.
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Search for a specific product (e.g., "MacBook").
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("MacBook");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
				
		//Click on the first item and add it to the cart.
		driver.findElement(By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]")).click();
		
		//Verify that the item is added to the cart successfully.
		String Success = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		
		System.out.println(Success);
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
