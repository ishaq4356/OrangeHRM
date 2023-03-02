package ExcelR.OrangeHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class directoryModule {

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
		WebElement Directory = driver.findElement(By.xpath(p.getProperty("Directory")));
		Directory.click();
		WebElement pic = driver.findElement(By.xpath(p.getProperty("pic1")));
		pic.click();

	}

}
