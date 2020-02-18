import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Metertest {

	WebDriver driver;
	ChromeOptions options;

	@Test
	public void f1() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Default.DESKTOP-LCLRU6G\\Downloads\\chromedriver_win32\\chromedriver.exe");
			options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			// driver.get("http://10.88.42.226:85/login");
			driver.get("https://google.com");
			driver.findElement(By.name("q")).sendKeys("Java");
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			// jse.executeScript("scroll(0,1000)", arg1)
			Thread.sleep(2000);
			driver.findElement(By.className("LC20lb")).click();
		} catch (InterruptedException e) {

		}
		System.out.println("f1");
	}

	@Test
	public void f2() {
		System.out.println("f2");
	}

	@Before
	public void beforeAnyTests() {
		System.out.println("beforeAnyTest");
	}

	@After
	public void AfterAllTheTests() {
		System.out.println("AfterAllTheTest");
	}

//	  @BeforeMethod
//	  public void beforeEveryMethod() {
//		  System.out.println("beforeEveryTestMethod");
//	  }
//	  
//	  @AfterMethod
//	  public void afterEveryMethod() {
//		  System.out.println("afterEveryTestMethod");
//	  }

//	@BeforeClass
//	public void beforeClass() {
//		System.out.println("beforeClass");
//	}
//
//	@AfterClass
//	public void afterClass() {
//		System.out.println("afterClass");
//	}

}
