import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Test_Project\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 
	
	driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
}
}
//TEst data