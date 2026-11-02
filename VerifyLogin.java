package testp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VerifyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		
		//WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
	
		WebElement productTitle = driver.findElement(By.className("title"));
		if(productTitle.getText().equals("Products")) {
			System.out.println("Landing Page Successfully appear");
			}
			else {
				System.out.println("FAIL");
			}
		}
		
		
	}
