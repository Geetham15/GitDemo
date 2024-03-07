import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking Browser
		//Chrome - ChromeDriver -> Methods()
		//Firefox - FirefoxDriver ->Methods
		//safari SafariDriver ->Methods close get
		//WebDriver  close get
		//WebDriver methods + class methods
		//chromedriver.exe -> Chrome browser
		//step to invoke chrome driver 
		
		System.setProperty("webdriver.chrome.driver", "G:/Sel-test-support-files/chromedriver.exe");
		//webdriver.chrome.driver->value of path
		//WebDriver driver = new ChromeDriver();
		
		//Firefox Launch
		//geckodriver
		System.setProperty("webdriver.gecko.driver","G:/Sel-test-support-files/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Microsoft Edge
		System.setProperty("webdriver.edge.driver","G:/Sel-test-support-files/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); //close only the respective browser
		//driver.quit(); //close the browser and associated browser
		
	}

}
