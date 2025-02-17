package CRMsoftwer;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.flowlu.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		driver.findElement(By.cssSelector("a[class='header__btn btn reach-goal-reg']")).click();	
//		Thread.sleep(8000);
//		driver.close();
		
//		Thread.sleep(8000);
		driver.get("https://my.flowlu.com/register/?utm_content=https://www.flowlu.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Sign Up
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("genilo7083@shouxs.com");
		
		driver.findElement(By.cssSelector(".ladda-label.register-label")).click();
		
//		all checkboxs click using the name
		
		List<WebElement> checkboxs = driver.findElements(By.className("quiz_case-wrap"));
		
		
		for(int i=0;i<12 && i<checkboxs.size();i++) {
			if (!checkboxs.get(i).isSelected()) {
				checkboxs.get(i).click();
			}
				
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("form[class='quiz-step show'] button[type='button']")).click();

//		choosing an industry
		
	
		driver.findElement(By.cssSelector("label[for='where_from67b2db5617178']")).click();
		driver.findElement(By.cssSelector("form:nth-child(2) div:nth-child(1) div:nth-child(3) button:nth-child(2)")).click();
		
//		company credentials fill up
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Mr Promojit Paul");
		driver.findElement(By.cssSelector("input[name='company']")).sendKeys("SmartSoft.AI");
		driver.findElement(By.cssSelector("label[for='count_employee67b2db5617207']")).click();
		driver.findElement(By.cssSelector("form:nth-child(2) div:nth-child(1) div:nth-child(3) button:nth-child(2)")).click();
		driver.findElement(By.xpath("(//label[contains(@class,'quiz_case-wrap')])[13]")).click();
		driver.findElement(By.cssSelector("form:nth-child(2) div:nth-child(1) div:nth-child(3) button:nth-child(2)")).click();
		driver.findElement(By.xpath("(//button[normalize-space()=\"Let's go!\"])[1]")).click();
		
		
//		driver.close();

	}

}
