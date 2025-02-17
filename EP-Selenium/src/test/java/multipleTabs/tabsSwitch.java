package multipleTabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabsSwitch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
//		Object[] windowHandles = driver.getWindowHandles().toArray();
//		driver.switchTo().window((String)windowHandles[1]);
//		String title = driver.getTitle();
//      assertEquals("Simple Page",title);
		Thread.sleep(8000);
		driver.close();
		

	}

}
