package registration;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterAutomation {

    public static void main(String[] args) throws InterruptedException {
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the registration page
        driver.get("https://demo.automationtesting.in/Register.html");
        
        // Set implicit wait to 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Fill in the first name field
        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Promojit");
        
        // Fill in the last name field
        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Paul");
        
        // Fill in the address field
        driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Kolkata");
        
        // Fill in the email field
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("promojit@gmail.com");
        
        // Fill in the phone number field
        driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("7003354455");
        
        // Select the gender (Male)
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        
        // Select hobbies (Cricket and Movies)
        driver.findElement(By.id("checkbox1")).click(); // Cricket
        driver.findElement(By.id("checkbox2")).click(); // Movies
        
        // Open the language dropdown and select English
        driver.findElement(By.xpath("//div[@id='msdd']")).click(); // Open dropdown
        driver.findElement(By.xpath("//a[normalize-space()='English']")).click(); // Select English
        driver.findElement(By.cssSelector("body")).click(); // Click outside to close dropdown
        Thread.sleep(3000); // Wait for 3 seconds
        
        // Select a skill from the skills dropdown
        Select skills = new Select(driver.findElement(By.id("Skills")));
        skills.selectByVisibleText("Java");
        
        // Select a country from the country dropdown
        driver.findElement(By.xpath("//span[@role='combobox']")).click();
        driver.findElement(By.xpath("//li[text()='India']")).click();
        
        // Select date of birth (Year, Month, Day)
        new Select(driver.findElement(By.id("yearbox"))).selectByVisibleText("1999"); // Year
        new Select(driver.findElement(By.xpath("//select[@placeholder='Month']"))).selectByVisibleText("September"); // Month
        new Select(driver.findElement(By.id("daybox"))).selectByVisibleText("15"); // Day
        
        // Upload a photo
        driver.findElement(By.cssSelector("#imagesrc")).sendKeys("F:\\66704c7fd9c8be16f3ae9baf_1730958629595.png");
        
        // Fill in the password field
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Password?321");
        
        // Confirm the password
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Password?321");
        
        // Click the submit button
        driver.findElement(By.cssSelector("#submitbtn")).click();
        
        // Close the browser
        driver.close();
    }
}
