package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import com.google.common.base.Function;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class testNG {
  	
  	WebDriver driver;
  	
  @Test
  public void f() {
	  ChromeOptions options = new ChromeOptions();
//  	options.addArguments("--remote-allow-origins=*");
  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pm82\\Downloads\\Chrome\\chromedriver.exe");
  	  driver = new ChromeDriver(options);
  	  WebDriverWait wait = new WebDriverWait(driver, 30);
  	  String url = "https://jqueryui.com";
  	  driver.get(url);
  	  driver.manage().window().maximize();
  	  WebElement accordian = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside/*[text()='Widgets']/../ul/li//*[text()='Accordion']"));
  	  accordian.click();

  	  String accordian_section_element = new String("//*[@id='accordion']/h3[text()='Section 2']");
  	  WebElement accordian_DF_S2 = driver.findElement(By.xpath(accordian_section_element));
  	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(accordian_section_element)));
  	  accordian_DF_S2.clear();
    	  
    	  
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  try{
    		Thread.sleep(5000);
    		}
    		catch(InterruptedException ie){
    		}
  	  //Capturing the title and validating if expected is equal to actual
  	  String expectedTitle = "Google";
  	  String actualTitle = driver.getTitle();
  	  Assert.assertEquals(actualTitle, expectedTitle);
    }
  @BeforeMethod
  public void beforeMethod() {
  	  System.out.println("Starting the browser session");
  }
 
  @AfterMethod
  public void afterMethod() {
  	  System.out.println("Closing the browser session");
  	  driver.quit();
  }
}