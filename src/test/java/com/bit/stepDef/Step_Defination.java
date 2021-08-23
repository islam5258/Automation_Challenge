package com.bit.stepDef;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Defination {
	WebDriver driver;

	@Given("User open browser and navigate to the url")
	public void user_open_browser_and_navigate_to_the_url() {
		if (driver == null) {
			driver = new FirefoxDriver();
			driver.get("https://www.express.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"closeModal\"]")).click(); // For pop up
		}
	}

	// Method Ends

	@And("User is on homePage and search for men shoes")
	public void user_is_on_home_page_and_search_for_men_shoes() {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/div[1]/div[1]/button"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div[1]/form/input"))
				.sendKeys("Men shoes");
		driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div[1]/form/input"))
				.sendKeys(Keys.ENTER);
	}
	
	// Method Ends

	@And("User click on the shoes")
	public void user_click_on_the_shoes() throws InterruptedException {
		// driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div/div[2]/div[2]/div/div[1]/div[1]/a/img")).click();
		driver.findElement(By.cssSelector(
				"div._2fbIe3xmE78JEQRb26pdpQ:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)"))
				.click();
		Thread.sleep(5000); // Not good idea to used it but for you to see the action
	}
	
	// Method Ends

	@When("User select color")
	public void user_select_color() throws InterruptedException {
		driver.findElement(By.xpath(
				"/html/body/div[1]/main/section/div/div/div/div/div/section/section[1]/section/div[4]/div/div[2]/a[2]/span[1]/span[2]"))
				.click();
		Thread.sleep(5000);
	}
	
	// Method Ends

	@And("User select size")
	public void user_select_size() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/div[6]/div/div[4]/button"))
				.click();
		Thread.sleep(5000);
	}
	
	// Method Ends

	@Then("User add the iteam into the cart")
	public void user_add_the_iteam_into_the_cart() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/button")).click();
	}
}