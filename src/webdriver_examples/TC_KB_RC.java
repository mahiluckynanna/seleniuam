package webdriver_examples;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class TC_KB_RC {
public static void main(String args[]) throws Exception{
    //Test Steps
System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\WebDriver\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println(driver.getTitle());
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
//Click : Keyboard : 1.TAB 2. ENTER
Robot r = new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
System.out.println("TAB");
Thread.sleep(4000);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
System.out.println("ENTER");
Thread.sleep(3000);
System.out.println("Login completed");
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.close();
}
}
