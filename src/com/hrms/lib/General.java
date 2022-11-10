package com.hrms.lib;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.utility.Log;


public class General extends Global{
//StdRule: To provide all re-usable fun:/methods of whole application
public void openApplication() {
System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
 driver = new ChromeDriver();
driver.navigate().to(url);
System.out.println("Application opened");
Log.info("Application opened");

}
public void closeApplication() {
driver.quit();
System.out.println("Application closed");
Log.info("Application closed");
}
public void login() {
driver.findElement(By.name(txt_loginname)).sendKeys(un);
driver.findElement(By.name(txt_password)).sendKeys(pw);
driver.findElement(By.name(btn_login)).click();
System.out.println("Login completed");
Log.info("Login completed");
}
public void logout() {
driver.findElement(By.linkText(link_logout)).click();
System.out.println("Logout completed");
Log.info("Logout completed");
}
}