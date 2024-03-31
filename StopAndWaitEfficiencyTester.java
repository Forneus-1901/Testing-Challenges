package Testing.CHALLENGE_50_DAYS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StopAndWaitEfficiencyTester {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		String size = null;
		driver.get("http://uitestingplayground.com/progressbar");
		driver.findElement(By.id("startButton")).click();

		while(true){
			size=	driver.findElement(By.id("progressBar")).getText();

			if(size.equals("75%")) {
				driver.findElement(By.id("stopButton")).click();
				System.out.println("SuccessFully Achived 75%");
				break;
			}
		}




	}

}
