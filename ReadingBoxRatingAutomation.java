package Testing.CHALLENGE_50_DAYS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingBoxRatingAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);

		 driver.get("https://play1.automationcamp.ir/advanced.html");

	        // Execute JavaScript to retrieve pseudo-element text
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        String script = "return window.getComputedStyle(document.querySelector('.star-rating'), '::after').getPropertyValue('content').replace(/\"/g, '')";
	        String pseudoElementText = (String) js.executeScript(script);

	        // Find the text box and enter the rating
	        WebElement ratingTextBox = driver.findElement(By.id("txt_rating"));
	        ratingTextBox.sendKeys(pseudoElementText);

	        // Find and click the "Check Rating" button
	        WebElement checkRatingButton = driver.findElement(By.id("check_rating"));
	        checkRatingButton.click();

	        // Explicit wait for the "Well done!" message
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        WebElement wellDoneMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validate_rating")));

	        // Verify if the message is displayed
	        if (wellDoneMessage.isDisplayed()) {
	            System.out.println("Well done message: " + wellDoneMessage.getText());
	        } else {
	            System.out.println("Well done message not found!");
	        }
	}

}
