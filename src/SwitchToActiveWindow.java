import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class SwitchToActiveWindow {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\CarlR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://formy-project.herokuapp.com/switch-window");
	
	WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
	newTabButton.click();
	
	String originalHandle = driver.getWindowHandle();
	
	for(String handle1: driver.getWindowHandles()) {
		driver.switchTo().window(handle1);
	}
	
	driver.switchTo().window(originalHandle);
	
	driver.quit();
	
	}
}
