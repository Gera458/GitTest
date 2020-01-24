import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch1 {

	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Test_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
	}
	
	
	
}
