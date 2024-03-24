package Testing.CHALLENGE_50_DAYS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ClickDelayedElementAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);

		driver.get("https://testpages.eviltester.com/styled/challenges/growing-clickable.html");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()=\"Click Me\"]")).click();

		String Text = driver.findElement(By.id("growbuttonstatus")).getText();	
		
		if(Text.equals("Event Triggered")) {
			System.out.println("Event is Triggered");

		}
		else {
			System.out.println("Event is  Not Triggered");
		}
		driver.quit();
	}

}
