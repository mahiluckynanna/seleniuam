


package webdriverExamples;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_WH {
public static void main(String args[]) throws Exception{
    //Test Steps

System.setProperty("webdriver.chrome.driver", "‪D:\\\\\\\\WebDriver\\\\\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//1st wind
driver.get("file:///F:/Suresh_Selenium/HtmlFiles/multiplewindows.html");
Thread.sleep(3000);
//2nd wind
driver.findElement(By.id("btn2")).click();
Thread.sleep(3000);
//3rd wind
driver.findElement(By.id("btn3")).click();
Thread.sleep(3000);
ArrayList<String> windinfo = new ArrayList<>(driver.getWindowHandles());
driver.switchTo().window(windinfo.get(0));
Thread.sleep(3000);
//driver.close();
driver.quit();
}
}