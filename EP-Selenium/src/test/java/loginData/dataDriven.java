package loginData;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataDriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// connect to external file
		// FileInputStream filex = new FileInputStream("Users\\PROMOJIT\\Documents\\workspace-spring-tool-suite-4-4.26.0.RELEASE\\EP-Selenium\\testdata\\LoginDataDriven.xlsx");
		File file = new File("C:\\Users\\PROMOJIT\\Documents\\workspace-spring-tool-suite-4-4.26.0.RELEASE\\EP-Selenium\\testdata\\LoginDataDriven.xlsx");
//		FileInputStream fis = new FileInputStream(file);

		// Create workbook instance
		Workbook book1 = WorkbookFactory.create(file);
		
        String username = book1.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String password = book1.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();

		driver.findElement(By.cssSelector("#email")).sendKeys(username);
		driver.findElement(By.cssSelector("#pass")).sendKeys(password);
			
		
		
	
	
	}

}
