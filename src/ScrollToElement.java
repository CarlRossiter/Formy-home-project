import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class ScrollToElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CarlR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/scroll");
		
		WebElement name = driver.findElement(By.id("name"));
		Actions actions = new Actions(driver);
		actions.moveToElement(name);
		name.sendKeys("Carl Rossiter");
		
		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("11/07/2024");
		
		driver.quit();
	}

}
