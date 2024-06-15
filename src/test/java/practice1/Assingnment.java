package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assingnment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://the-internet.herokuapp.com/login");
         driver.manage().window().maximize();
         
         driver.findElement(By.id("username")).sendKeys("varsha");
        Thread.sleep(2000);
        
        driver.findElement(By.id("password")).sendKeys("12345");
        Thread.sleep(2000);
        
        driver.findElement(By.linkText("fa-sign-in")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.partialLinkText("Elemental Selenium"));
        
         
	}

}
