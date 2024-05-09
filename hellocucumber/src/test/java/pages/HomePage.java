package pages;


import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver driver;
	By widgetsAccordianMenu = By.xpath("//*[@id='sidebar']/aside/*[text()='Widgets']/../ul/li//*[text()='Accordion']");
	By widgetsButton = By.xpath("//*[@id='sidebar']/aside/*[text()='Widgets']/../ul/li//*[text()='Button']");
	By widgetsCheckBoxRadio = By.xpath("//*[@id='sidebar']/aside/*[text()='Widgets']/../ul/li//*[text()='Checkboxradio']");
	By widgetsSelectmenu = By.xpath("//*[@id='sidebar']/aside/*[text()='Widgets']/../ul/li//*[text()='Selectmenu']");
	By AccordianSection2Menu = By.xpath("//*[@id='accordion']/h3[text()='Section 2']");
	By AccordianCustomizeicon = By.xpath("//*[@id=\"content\"]/div[1]/ul/li[3]");
	By selectFastdropdown = By.xpath("//*[@id='speed-button']");
	By checkBoxFieldRaido = By.xpath("//fieldset/label[text()='New York']");
	String iframe = new String("//*[@id='content']/iframe");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void SelectDropdownOption() {
		this.driver.findElement(selectFastdropdown).click();
	}
//	Select se = new Select(driver.findElement(By.xpath("//*[@id='speed-button']")));
//	se.selectByIndex(3);

	// Defining all the user actions (Methods)

	// This method is to click sectionMenu
	public void clickAccordianSection2Menu() {
		this.driver.findElement(AccordianSection2Menu).click();
	}
	// This method is to click AccordianCustomizeicon
		public void clickCustomizeicon() {
			this.driver.findElement(AccordianCustomizeicon).click();
		}

	// This method is to click on widgetAccordian Button
	public void clickAccordianMenu() {
		this.driver.findElement(widgetsAccordianMenu).click();
	}

	// This method is to click on clickButton Button
	public void clickButtonInMenu() {
		this.driver.findElement(widgetsButton).click();
	}

	// This method is to click on widgetsCheckBoxRadio Button
	public void clickCheckBoxRadioInMenu() {
		this.driver.findElement(widgetsCheckBoxRadio).click();
	}

	public void clickCheckBoxFieldRadioInMenu() {
		this.driver.findElement(checkBoxFieldRaido).click();
	}
	
	public void clickSelectMenu() {
		this.driver.findElement(widgetsSelectmenu).click();
	}
	
	public void switchToIframe() {
		this.driver.switchTo().frame(0);
	}

	public void switchBackToMain() {
		this.driver.switchTo().defaultContent();
	}

	public void close() {
		this.driver.close();
	}
	
	/*public void Screenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot screenshot = (TakesScreenshot)driver;			//takes screenshot
		File source = screenshot.getScreenshotAs(OutputType.FILE);		//saving the screenshot
		FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"./SeleniumScreenshots/Screen.png"));
		
	}*/


}
