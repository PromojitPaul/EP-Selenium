package registration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RegisterAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Promojit");
        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Paul");
        driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Kolkata");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("promojit@gmail.com");
        driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("7003354455");

        driver.findElement(By.xpath("//input[@value='Male']")).click();
		
        driver.findElement(By.id("checkbox1")).click(); // Cricket
        driver.findElement(By.id("checkbox2")).click(); // Movies
        
        driver.findElement(By.xpath("//div[@id='msdd']")).click(); // Open dropdown
        driver.findElement(By.xpath("//a[normalize-space()='English']")).click(); // Select English
        driver.findElement(By.cssSelector("body")).click(); // Click outside to close dropdown
        Thread.sleep(3000);

        Select skills = new Select(driver.findElement(By.id("Skills")));
        skills.selectByVisibleText("Java");
        
        driver.findElement(By.xpath("//span[@role='combobox']")).click();
        driver.findElement(By.xpath("//li[text()='India']")).click();
        
        new Select(driver.findElement(By.id("yearbox"))).selectByVisibleText("1999");
        new Select(driver.findElement(By.xpath("//select[@placeholder='Month']"))).selectByVisibleText("September");
        new Select(driver.findElement(By.id("daybox"))).selectByVisibleText("15");
        
        //Upload Photo
        driver.findElement(By.cssSelector("#imagesrc")).sendKeys("F:\\66704c7fd9c8be16f3ae9baf_1730958629595.png");
        
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Password?321");
        
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Password?321");
        
        driver.findElement(By.cssSelector("#submitbtn")).click();
        
        driver.close();

	}

}
      
