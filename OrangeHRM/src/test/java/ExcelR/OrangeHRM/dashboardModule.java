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

public class dashboardModule {

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
		WebElement profil = driver.findElement(By.xpath(p.getProperty("profil")));
		profil.click();
		WebElement About = driver.findElement(By.xpath(p.getProperty("About")));
		About.click();
		driver.findElement(By.xpath("//button[normalize-space()='×']")).click();

		WebElement support = driver.findElement(By.xpath(p.getProperty("support")));
		support.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

		WebElement profil1 = driver.findElement(By.xpath(p.getProperty("profil")));
		profil1.click();
//		
//		WebElement changePass = driver.findElement(By.xpath(p.getProperty("changePass")));
//		changePass.click();
//		
//		WebElement pass = driver.findElement(By.xpath(p.getProperty("pass")));
//		pass.sendKeys("admin123");
//		
//		WebElement password2 = driver.findElement(By.xpath(p.getProperty("password2")));
//		password2.sendKeys("abcd123");
//		
//		WebElement confirmPassword = driver.findElement(By.xpath(p.getProperty("confirmPassword")));
//		confirmPassword.sendKeys("abcd123");
//		
//		WebElement save = driver.findElement(By.xpath(p.getProperty("save")));
//		save.click();

//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
//		
//		WebElement profil2 = driver.findElement(By.xpath(p.getProperty("profil")));
//		profil2.click();

		WebElement logOut = driver.findElement(By.xpath(p.getProperty("logOut")));
		logOut.click();

	}

}
