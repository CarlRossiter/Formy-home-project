import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CarlR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		submitForm(driver);
		
		waitForAlertBanner(driver);
		
		assertEquals("The form was successfully submitted!".getAlertBannerText(driver));
		
		driver.quit();
	}

	public static void submitForm(WebDriver driver) 
	{
		driver.findElement(By.id("first-name")).sendKeys("Carl");

		driver.findElement(By.id("last-name")).sendKeys("Rossiter");
		
		driver.findElement(By.id("job-title")).sendKeys("QA Analyst");
		
		driver.findElement(By.id("radio-button-2")).click();
		
		driver.findElement(By.id("checkbox-1")).click();
		
		driver.findElement(By.cssSelector("option[value='3']")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("01/01/2025");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
		
	}
	
	public static void waitForAlertBanner(WebDriver driver) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
		
	}
	
	public static String getAlertBannerText(WebDriver driver) 
	{
		return driver.findElement(By.className("alert")).getText();
	}
}
