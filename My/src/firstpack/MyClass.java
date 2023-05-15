package firstpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Web\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
}
}
