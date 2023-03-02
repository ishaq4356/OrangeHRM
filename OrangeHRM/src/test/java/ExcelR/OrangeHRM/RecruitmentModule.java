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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RecruitmentModule {

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
		WebElement req = driver.findElement(By.xpath(p.getProperty("Recruitment")));
		req.click();

		WebElement jobTitle = driver.findElement(By.xpath(p.getProperty("candidates")));
		jobTitle.click();

		WebElement vaccancy = driver.findElement(By.xpath(p.getProperty("vaccancy")));
		vaccancy.click();
		WebElement HiringManager = driver.findElement(By.xpath(p.getProperty("HiringManager")));
		HiringManager.click();

		WebElement recStatus = driver.findElement(By.xpath(p.getProperty("recStatus")));
		recStatus.click();

		WebElement recHint = driver.findElement(By.xpath(p.getProperty("recHint")));
		recHint.sendKeys("ishaq");

		WebElement keywords = driver.findElement(By.xpath(p.getProperty("keywords")));
		keywords.sendKeys("ishaq");

		WebElement fromDate = driver.findElement(By.xpath(p.getProperty("fromDate")));
		fromDate.sendKeys("2021-03-05");

		WebElement toDate = driver.findElement(By.xpath(p.getProperty("toDate")));
		toDate.sendKeys("2021-04-10");
		WebElement methodOfApplication = driver.findElement(By.xpath(p.getProperty("methodOfApplication")));
		methodOfApplication.click();

		WebElement recSearch = driver.findElement(By.xpath(p.getProperty("search")));
		recSearch.click();
		WebElement Vacancies = driver.findElement(By.xpath(p.getProperty("Vacancies")));
		Vacancies.click();
		WebElement jobTitle1 = driver.findElement(By.xpath(p.getProperty("candidates")));
		jobTitle1.click();

		WebElement vaccancy1 = driver.findElement(By.xpath(p.getProperty("vaccancy")));
		vaccancy1.click();
		WebElement HiringManager1 = driver.findElement(By.xpath(p.getProperty("HiringManager")));
		HiringManager1.click();

		WebElement recStatus1 = driver.findElement(By.xpath(p.getProperty("recStatus")));
		recStatus1.click();

		WebElement addrec = driver.findElement(By.xpath(p.getProperty("pmiAdd")));
		addrec.click();

		WebElement addvac = driver.findElement(By.xpath(p.getProperty("VacanciesName")));
		addvac.sendKeys("ishaq");
		WebElement jobTitle2 = driver.findElement(By.xpath(p.getProperty("candidates")));
		jobTitle2.click();
		WebElement descrip = driver.findElement(By.xpath(p.getProperty("descrip")));
		descrip.sendKeys("ishaq");
		WebElement HiringManager2 = driver.findElement(By.xpath(p.getProperty("HiringManager")));
		HiringManager2.sendKeys("ishaq");
		WebElement recurSave = driver.findElement(By.xpath(p.getProperty("recurSave")));
		recurSave.click();

	}

}
