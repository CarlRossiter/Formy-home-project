import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CarlR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		driver.findElement(By.id("radio-button-1")).click();
		
		driver.findElement(By.cssSelector("input[value='option2']")).click();

		driver.findElement(By.xpath("/html/body/div/div[3]/input")).click();
		
		driver.quit();
	}

}
