package webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
public class TC_Dropdown {
public static void main(String args[]) throws Exception{
    //Test Steps
System.setProperty("webdriver.chrome.driver", "‪D:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(4000);
driver.switchTo().frame("rightMenu");
Select st = new Select(driver.findElement(By.name("loc_code")));
//st.selectByVisibleText("Emp. ID");
//st.selectByIndex(1);
st.selectByValue("0");
Thread.sleep(4000);
driver.findElement(By.name("loc_name")).sendKeys("10003");
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@value='Search']")).click();
Thread.sleep(4000);
driver.findElement(By.name("chkLocID[]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@value='Delete']")).click();
Thread.sleep(4000);
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(4000);
driver.close();
}
}
