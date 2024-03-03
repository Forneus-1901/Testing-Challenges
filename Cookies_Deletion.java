package Testing.CHALLENGE_50_DAYS;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies_Deletion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(2000);
		
		 driver.get("https://www.google.com/");
		 
		 // TO DELETE COOKIES
		 driver.manage().deleteAllCookies();
		 
		 //TO SET THE SIZE OF THE WINDOW
		 Dimension d= new Dimension(500,500);
		 driver.manage().window().setSize(d);
		 Thread.sleep(2000);
		 
		 //TO SET THE POSITION OF THE WINDOW
		 Point p=new Point(250,250);
		 driver.manage().window().setPosition(p);
		 Thread.sleep(2000);
		 
		 // TO MAXIMIZE THE WINDOW
		 driver.manage().window().maximize();
		 
		 
		 
	}

}
