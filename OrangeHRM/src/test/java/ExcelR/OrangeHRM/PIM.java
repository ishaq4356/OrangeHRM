package ExcelR.OrangeHRM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PIM {

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

		WebElement pmi = driver.findElement(By.xpath(p.getProperty("pmi")));
		pmi.click();

		WebElement empName = driver.findElement(By.xpath(p.getProperty("EmpName")));
		empName.sendKeys("ishaq");

		WebElement empID = driver.findElement(By.xpath(p.getProperty("EmpID")));
		empID.sendKeys("1234");

		WebElement slt = driver.findElement(By.xpath(p.getProperty("empStatus")));
		slt.click();
//		Select status = new Select(slt);
//		status.selectByValue("Full-Time Contract");

		WebElement pmiAdd = driver.findElement(By.xpath(p.getProperty("pmiAdd")));
		pmiAdd.click();

		WebElement fname = driver.findElement(By.xpath(p.getProperty("pmiFname")));
		fname.sendKeys("mohammed");
		WebElement mname = driver.findElement(By.xpath(p.getProperty("pmiMname")));
		mname.sendKeys("ishaq");
		WebElement lname = driver.findElement(By.xpath(p.getProperty("pmiLname")));
		lname.sendKeys("mohammed");

		WebElement empID1 = driver.findElement(By.xpath(p.getProperty("EmpID")));
		empID1.sendKeys("1234");

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebElement check = driver.findElement(By.xpath(p.getProperty("pmiCheck")));
//		check.click();
		driver.findElement(By.xpath(p.getProperty("save"))).click();
		WebElement reports = driver.findElement(By.xpath(p.getProperty("reports")));
		reports.click();
		WebElement rHint = driver.findElement(By.xpath(p.getProperty("reportHint")));
		rHint.sendKeys("ishaq");
		driver.findElement(By.xpath(p.getProperty("search"))).click();
	}

}
