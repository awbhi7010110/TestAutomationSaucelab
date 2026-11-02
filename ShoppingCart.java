package testp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		
		WebElement cartCount = driver.findElement(By.className("shopping_cart_badge"));
		
		if(cartCount.getText().equals("2")) {
			System.out.println("No. of Items = 2");
		}
			else {
				System.out.println("Invalid Cart Count");
			}
		Thread.sleep(100);
		driver.findElement(By.class([aria-label='Cart, 2 items'])).click();	}}
//		List<WebElement> cartCount1 = driver.findElements(By.className("cart_item"));
//		
//		if(cartCount1.size() ==2) {
//			System.out.println("True");}
//		else {
//			System.out.println("False");}
//		}
//}
