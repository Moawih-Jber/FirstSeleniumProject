import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parameters {
	static WebDriver driver = new ChromeDriver();
	static String myWebsite = ("https://www.saucedemo.com/");
	static String username = "standard_user";
	static String password = "secret_sauce";

	static void login() {
		driver.get(myWebsite);

		WebElement usernameinput = driver.findElement(By.id("user-name"));
		WebElement passwordinput = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		usernameinput.sendKeys(username);
		passwordinput.sendKeys(password);
		loginbutton.click();

	}

//	add 1-3-5 items
	static void add_1_3_5() {
		List<WebElement> addtocart = driver.findElements(By.className("btn"));
		for (int i = 0; i < addtocart.size(); i++) {
			if (i % 2 == 0) {
				addtocart.get(i).click();
			}
			continue;
		}

	}

	static void add_some_of_item(String... items) {
		List<WebElement> addtocarts = driver.findElements(By.className("btn"));
		List<WebElement> nameItem = driver.findElements(By.className("inventory_item_name"));
		for (int i = 0; i < nameItem.size(); i++) {
			String namesItems = nameItem.get(i).getText();

			if (containitemName(namesItems, items)) {
				addtocarts.get(i).click();

			}

		}

	}

	private static boolean containitemName(String addItem, String... itemNames) {
		for (String itemName : itemNames) {
			if (addItem.contains(itemName)) {
				return true;
			}
		}
		return false;
	}

	static void logout() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("reset_sidebar_link")).click();
//		driver.navigate().back();
//		الرجوع للخلف
//		driver.navigate().forward();
//		التقدم للامام
		driver.navigate().refresh();
//		عمل refresh للصفحة
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();

	}

	static void clickOnTheCartANDfinish() throws InterruptedException {
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("checkout")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("first-name")).sendKeys("moawih");
		Thread.sleep(1000);

		driver.findElement(By.id("last-name")).sendKeys("jber");
		Thread.sleep(1000);

		driver.findElement(By.id("postal-code")).sendKeys("123456");
		Thread.sleep(1000);

		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("finish")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(1000);

	}
}
