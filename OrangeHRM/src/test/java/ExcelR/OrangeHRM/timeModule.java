package ExcelR.OrangeHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class timeModule {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		FileInputStream fl = new FileInputStream(
				"C:\\Users\\ishaq\\eclipse-workspace\\OrangeHRM\\src\\main\\java\\ExcelR\\OrangeHRM\\data.properties");
		Properties p = new Properties();
		p.load(fl);

		WebElement username = driver.findElement(By.xpath(p.getProperty("username")));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath(p.getProperty("pass")));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath(p.getProperty("login")));
		login.click();
		WebElement time = driver.findElement(By.xpath(p.getProperty("time")));
		time.click();
		
		WebElement timeHint = driver.findElement(By.xpath(p.getProperty("timeHint")));
		timeHint.sendKeys("ishaq");
		WebElement view = driver.findElement(By.xpath(p.getProperty("save")));
		view.click();
		WebElement actionView = driver.findElement(By.xpath(p.getProperty("actions")));
		actionView.click();
		
		WebElement attendence = driver.findElement(By.xpath(p.getProperty("attendence")));
		attendence.click();
		
		WebElement timeReport = driver.findElement(By.xpath(p.getProperty("timeReports")));
		timeReport.click();
		
		WebElement prjInfo = driver.findElement(By.xpath(p.getProperty("prjInfo")));
		prjInfo.click();
		
		
	}

}
