package webdriver_examples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_WT {
public static void main(String args[]) throws Exception{
    // Test Steps
System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("file:///D:/WebTable.html");
//Count
int row =driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
int col =driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
int row_col =driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();

System.out.println("rowcount " + row);
System.out.println("col count "+ col);
System.out.println("row_col count "+ row_col);
//Data : Cell
String celldata=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
System.out.println(celldata);
//Data : Table
// DT Var VV
for(int i=1; i<=row; i++) {
String data = driver.findElement(By.
        xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
Thread.sleep(3000);
System.out.println(data);
}
driver.quit();
}
}