package webdriver_examples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUpload
{
    public static void main(String args[]) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "D:\\\\WebDriver\\\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://183.82.103.245/nareshit/login.php");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nareshit");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit");
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(5000);
        driver.switchTo().frame("rightMenu");
        driver.findElement(By.xpath("//input[@value='Add']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("last name");
        driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("first name");
         //To upload a file
WebElement fileInput = driver.findElement(By.
              xpath("//input[@type='file'][@name='photofile']"));                      
fileInput.sendKeys("F:\\desert.jpg");
//fileInput.sendKeys("G:\\06.TestingTools\\1.0.ProjectName\\Templates\\Defect Template.xlsx");
        Thread.sleep(7000);
        System.out.println("File uploaded successfully");        
        driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
        Thread.sleep(7000);
          System.out.println("New Employee Added");
          driver.switchTo().defaultContent();
          driver.findElement(By.linkText("Logout")).click();
          driver.close();
       
    }
}