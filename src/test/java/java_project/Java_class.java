package java_project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Java_class {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		openbrowser();
		searchForProduct();
		clickOnTheProduct();

	}

	// Method Ends

	public static void openbrowser() {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.express.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"closeModal\"]")).click(); // For Pop Up

	}

	// Method Ends

	public static void searchForProduct() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/div[1]/div[1]/button"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div[1]/form/input"))
				.sendKeys("Men shoes");
		driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div[1]/form/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

	}

	// Method Ends

	public static void clickOnTheProduct() throws InterruptedException {
		// driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div/div[2]/div[2]/div/div[1]/div[1]/a/img")).click();
		driver.findElement(By.cssSelector(
				"div._2fbIe3xmE78JEQRb26pdpQ:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)"))
				.click();
		Thread.sleep(5000); // Not good idea to used it but for you to see the action
		driver.findElement(By.xpath(
				"/html/body/div[1]/main/section/div/div/div/div/div/section/section[1]/section/div[4]/div/div[2]/a[2]/span[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/div[6]/div/div[4]/button"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/button")).click();
	}

}
