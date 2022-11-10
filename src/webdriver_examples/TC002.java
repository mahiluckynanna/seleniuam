package webdriver_examples;
//To access webdriver classes/methods
import org.openqa.selenium.WebDriver;
//To access firefox broswer
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//To access object Ind:
import org.openqa.selenium.By;

public class TC002
{
public static void main(String args[])throws Exception{
	// Test steps
	System.setProperty("webdriver.chrome.driver","D:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
    driver.findElement(By.linkText("Logout")).click();
    Thread.sleep(3000);
    driver.close();
}
}
