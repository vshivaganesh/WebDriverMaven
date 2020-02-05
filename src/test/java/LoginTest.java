import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void doLogin() {

		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("vshivaganesh@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.name("password")).sendKeys("ghesvsdr123");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}

	@AfterSuite
	public void tearDown() {

		driver.quit();
	}

}
