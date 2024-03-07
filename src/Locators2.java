import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name="rahul";
		//Chrome Launch
		//System.setProperty("webdriver.chrome.driver", "G:/Sel-test-support-files/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Firefox Launch
		//System.setProperty("webdriver.gecko.driver","G:/Sel-test-support-files/geckodriver.exe");		
		//WebDriver driver = new FirefoxDriver();
		
		//Microsoft Edge
		System.setProperty("webdriver.edge.driver","G:/Sel-test-support-files/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello " + name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
		//0th index - Please use temporary password '
		//1st index - rahulshettyacademy' to Login.
		String[] passwordArray2 = passwordArray[1].split("'");
		//0th index - rahulshettyacademy
		//1st index - ' to Login.
		String password = passwordArray2[0]; //passwordArray[1].split("'")[0]
		return password;
	}

}
