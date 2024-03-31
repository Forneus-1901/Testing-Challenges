package Testing.CHALLENGE_50_DAYS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecureCodeEntryAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		driver.get("https://qaplayground.dev/apps/verify-account/");

		List<WebElement> inputFields = driver.findElements(By.cssSelector(".code-container input"));
		Actions actions = new Actions(driver);
		for (int i = 0; i < inputFields.size(); i++) { 
		    WebElement input = inputFields.get(i);
		    actions.moveToElement(input)
		           .keyDown(Keys.NUMPAD9)
		           .keyUp(Keys.NUMPAD9)
		           .perform();
		}

	
	}
}
