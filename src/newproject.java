import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newproject extends parameters {

	@BeforeTest
	public void mytest() throws InterruptedException {
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void add1_3_5() throws InterruptedException {
		login();
		Thread.sleep(2000);

		add_1_3_5();
		Thread.sleep(3000);

		clickOnTheCartANDfinish();
		Thread.sleep(3000);

		logout();
		Thread.sleep(1000);

	}

	@Test(priority = 2)
	public void ADD3item() throws InterruptedException {
		login();
		Thread.sleep(2000);

		add_some_of_item("Fleece", "Onesie", "Light");
		Thread.sleep(3000);

		clickOnTheCartANDfinish();
		Thread.sleep(3000);

		logout();
		Thread.sleep(1000);

	}

	@Test(priority = 3)
	public void tADD2item() throws InterruptedException {
		login();
		Thread.sleep(2000);

		add_some_of_item("Onesie", "Light");
		Thread.sleep(3000);

		clickOnTheCartANDfinish();
		Thread.sleep(3000);

		logout();
		Thread.sleep(1000);

	}

	@AfterTest
	public void postTest() {

	}

}
