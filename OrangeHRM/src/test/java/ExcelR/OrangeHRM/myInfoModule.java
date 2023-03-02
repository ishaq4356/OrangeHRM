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

public class myInfoModule {

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
		WebElement myInfo = driver.findElement(By.xpath(p.getProperty("info")));
		myInfo.click();

		WebElement fname = driver.findElement(By.xpath(p.getProperty("firstName")));
		fname.sendKeys("mohammed");
		WebElement mname = driver.findElement(By.xpath(p.getProperty("pmiMname")));
		mname.sendKeys("ishaq");
		WebElement lname = driver.findElement(By.xpath(p.getProperty("pmiLname")));
		lname.sendKeys("mohammed");
		WebElement nickname = driver.findElement(By.xpath(p.getProperty("nickname")));
		nickname.sendKeys("ish");
//
//		WebElement dlt = driver.findElement(By.xpath(p.getProperty("dlt")));
//		dlt.click();
//		WebElement yes = driver.findElement(By.xpath(p.getProperty("yesDlt")));
//		yes.click();

		WebElement contact = driver.findElement(By.xpath(p.getProperty("contactDetails")));
		contact.click();

		WebElement address = driver.findElement(By.xpath(p.getProperty("address")));
		address.sendKeys("bangalore");
		WebElement adress2 = driver.findElement(By.xpath(p.getProperty("adress2")));
		adress2.sendKeys("bangalore");
		WebElement city = driver.findElement(By.xpath(p.getProperty("city")));
		city.sendKeys("bangalore");

		WebElement state = driver.findElement(By.xpath(p.getProperty("state")));
		state.sendKeys("kar");
		WebElement pincode = driver.findElement(By.xpath(p.getProperty("pincode")));
		pincode.sendKeys("560078");
		WebElement homenum = driver.findElement(By.xpath(p.getProperty("homenum")));
		homenum.sendKeys("77553161534");
		WebElement phnum = driver.findElement(By.xpath(p.getProperty("phnum")));
		phnum.sendKeys("3214446456");
		WebElement mail = driver.findElement(By.xpath(p.getProperty("mail")));
		mail.sendKeys("1234@gmail.com");
		WebElement saveInfo = driver.findElement(By.xpath(p.getProperty("saveInfo")));
		saveInfo.click();

		WebElement EmgCall = driver.findElement(By.xpath(p.getProperty("EmgCall")));
		EmgCall.click();
		WebElement dependents = driver.findElement(By.xpath(p.getProperty("dependents")));
		dependents.click();

		WebElement check1 = driver.findElement(By.xpath(p.getProperty("check1")));
		check1.click();

//		WebElement dltSelected = driver.findElement(By.xpath(p.getProperty("dltSelected")));
//		dltSelected.click();
//		
//		WebElement dlt = driver.findElement(By.xpath(p.getProperty("yesDlt")));
//		dlt.click();
		WebElement immig = driver.findElement(By.xpath(p.getProperty("immig")));
		immig.click();
		WebElement passCheck = driver.findElement(By.xpath(p.getProperty("passCheck")));
		passCheck.click();
		WebElement dlt2 = driver.findElement(By.xpath(p.getProperty("dltSelected1")));
		dlt2.click();
		WebElement yesdlt = driver.findElement(By.xpath(p.getProperty("yesDlt")));
		yesdlt.click();
		WebElement job = driver.findElement(By.xpath(p.getProperty("job")));
		job.click();
		WebElement salary = driver.findElement(By.xpath(p.getProperty("salary")));
		salary.click();
		WebElement tax = driver.findElement(By.xpath(p.getProperty("tax")));
		tax.click();
		WebElement reportTo = driver.findElement(By.xpath(p.getProperty("reportTo")));
		reportTo.click();
		WebElement qulafication = driver.findElement(By.xpath(p.getProperty("qulafication")));
		qulafication.click();
		WebElement membership = driver.findElement(By.xpath(p.getProperty("membership")));
		membership.click();
	}

}
