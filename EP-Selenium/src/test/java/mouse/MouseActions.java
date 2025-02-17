package mouse;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/en-gb?route=common/home");
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		// Automate Mouse Actions
		Actions action = new Actions(driver);
		action.moveToElement(desktop).moveToElement(mac).click().perform();
		driver.close();
	}

}
