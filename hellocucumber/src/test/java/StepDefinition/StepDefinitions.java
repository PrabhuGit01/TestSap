package StepDefinition;

import org.openqa.selenium.WebDriver;
import com.google.common.base.Function;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pages.HomePage;

public class StepDefinitions {
	WebDriver driver;
	HomePage homePage;
	WebDriverWait wait;

	@Given("an example scenario")
	public void anExampleScenario() {
	}

	@When("all step definitions are implemented")
	public void allStepDefinitionsAreImplemented() {
	}

	@Then("the scenario passes")
	public void theScenarioPasses() {
	}
	
	@Then("I close browser")
	public void closeBrowser() throws IOException {
		//homePage.Screenshot(driver);
		homePage.close();
		
	}

	@Given("Open browser")
	public void openBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pm82\\Downloads\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver(options);
		homePage = new HomePage(driver);
		wait = new WebDriverWait(driver, 30);
//		String ScreenshotFile ="C:\\Users\\pm82\\eclipse-workspace\\hellocucumber\\target\\Screenshot";
		String url = "https://jqueryui.com";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException ie) {
		}

	}

	@Given("I click accordian in widgets Menu")
	public void clickAccordian() {
		homePage.clickAccordianMenu();
	}

	@Given("I click on section2 Menu")
	public void AccordianSection2Menu() {
		homePage.clickAccordianSection2Menu();
	}
	@Given("I click on Customizeicon")
	public void AccordianCustomizeicon() {
		homePage.clickCustomizeicon();
	}
	
	@Given("I select \"Fast\" option under Medium dropdown")
	public void selectFastdropdown() {
		homePage.SelectDropdownOption();
	}

	@Given("I click button in widgets Menu")
	public void clickButtonInWidgetsMenu() {
		homePage.clickButtonInMenu();
	}

	@Given("I click radio button in widgets Menu")
	public void clickRadioButtonInWidgetsMenu() {
		homePage.clickCheckBoxRadioInMenu();
	}

	@Given("I click radio button in iframe")
	public void clickRadioButtonInIframe() {
		homePage.clickCheckBoxFieldRadioInMenu();
	}
	
	@Given("I click on the Selectmenu tab")
	public void clickSelectmenu() {
		homePage.clickSelectMenu();
	}

	@Given("I switch to iframe")
	public void switchToIframe() {
		homePage.switchToIframe();
	}

	@Given("I switch back to main")
	public void switchBackToMain() {
		homePage.switchBackToMain();
	}

	}


