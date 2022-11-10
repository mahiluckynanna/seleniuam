package webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Checkbox {
public static void main(String args[]) throws Exception{
    //Test Steps
System.setProperty("webdriver.chrome.driver","D:\\WebDriver\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php&quot");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(3000);
driver.switchTo().frame("rightMenu");
//click on checkbox
// DT Var VV
for(int i=1; i<=10; i=i+2) {
driver.findElement(By.
    xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td[1]/input")).click();
Thread.sleep(3000);
System.out.println("Clicked on checkbox of " + i);
}
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.quit();
}
}
