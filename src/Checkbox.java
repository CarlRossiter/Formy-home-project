import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CarlR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		driver.findElement(By.id("checkbox-1")).click();
		
		driver.findElement(By.id("checkbox-2")).click();

		driver.findElement(By.id("checkbox-3")).click();
		
		driver.quit();
	}

}
