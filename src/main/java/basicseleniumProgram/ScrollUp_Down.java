package basicseleniumProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUp_Down {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		Thread.sleep(4000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("scroll(0,400)");
		
		Thread.sleep(5000);
		
		je.executeScript("scroll(0,-500)");
		Thread.sleep(5000);
		driver.close();
	}

}
