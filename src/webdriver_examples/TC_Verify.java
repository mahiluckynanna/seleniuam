package webdriver_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class TC_Verify {
//***************Test Data
        //DT    Var             VV
static String  url     = "http://183.82.103.245/nareshit/login.php";
static String username = "nareshit";
static String password = "nareshit";
static String title1   = "OrangeHRM - New Level of HR Management";
static String title2   = "OrangeHRM";

public static void main(String args[]) throws Exception{
    //Test Steps
System.setProperty("webdriver.chrome.driver", "D:\\\\WebDriver\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.navigate().to(url);
//Verify Application Title
//ActualResult      compare ExpectedResult
if(driver.getTitle().equals(title1)) {
System.out.println("Title matched");    
}
else {
System.out.println("Title not matched ");    
System.out.println(driver.getTitle());
}
//***Test Data - hard coded
//driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
//driver.findElement(By.name("txtPassword")).sendKeys("nareshit");

//*****Test Data - pass from varibale
driver.findElement(By.name("txtUserName")).sendKeys(username);
driver.findElement(By.name("txtPassword")).sendKeys(password);
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(3000);
//
if(driver.getTitle().equals(title2)) {
System.out.println("Title matched");    
}
else {
System.out.println("Titel not matched");
System.out.println(driver.getTitle());
}
//mouseover
Actions ac = new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
System.out.println("mouseover completed");
Thread.sleep(4000);
//click on submenu
driver.findElement(By.linkText("Add Employee")).click();
System.out.println("Clicked on Submenu");
Thread.sleep(4000);
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("Logout completed");
driver.close();

}
}
