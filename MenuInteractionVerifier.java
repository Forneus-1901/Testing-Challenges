package Testing.CHALLENGE_50_DAYS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuInteractionVerifier {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://qaplayground.dev/apps/context-menu/");
		WebElement first_rightclick=	driver.findElement(By.id("msg"));
		WebElement Arrow=driver.findElement(By.xpath("//i[@class='uil uil-angle-right']"));
		WebElement Twitterclick=driver.findElement(By.xpath("//li[@onclick=\"itemClicked('Twitter')\"]"));
		Actions action=new Actions(driver);
		action.contextClick(first_rightclick).perform();
		Thread.sleep(2000);
		action.moveToElement(Arrow).click().perform();
		action.moveToElement(Twitterclick).click().perform();
		String Display_selection=	driver.findElement(By.id("msg")).getText();
		System.out.println(Display_selection);

	}
}
