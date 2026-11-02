package testp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Task4 {

	private static final String List = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
//		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("app_logo")));
		
		WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
		
		Select select = new Select(sortDropdown);
		
		select.selectByValue("Price (low to high)");
		
		List<WebElement> productSeq = By.className("inventory_item_price");
		
		System.out.print(productSeq);
	}

}
