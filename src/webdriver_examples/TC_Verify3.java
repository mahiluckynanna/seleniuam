package webdriver_examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class TC_Verify3 
{

	public static void main(String[] args)throws Exception 
	{
		//Test Steps
		System.setProperty("webdriver.chrome.driver","D:\\\\WebDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		//Verify Application Title
		//ActualResult      Compare ExpertedResult
		if(driver.getTitle().equals("OrangeHRM-New Level of HR Management"))
		{
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserNmae")).sendKeys("nareshit");
		driver.findElement(By.name("txtUserPassWord")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(4000);
		//
		if(driver.getTitle().equals("OrangeHRM")){
		System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
			
		}
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		System.out.println("Logout completed");
		driver.close();
		
	}

}
