package diffSteps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BackgroundColorPage;
import pages.TestBase;

public class BackgroundColorsStepDefinition extends TestBase{	
	
	BackgroundColorPage backgroundpage;
	
	
	@Given("^\"Set SkyBlue Background\" button exists$")
	public void Set_SkyBlue_Background_button_exists() throws Throwable{
		initDriver();
		driver.get("https://techfios.com/test/101/");
	}

	@Given("^\"Set White Background\" button exists$")
	public void Set_SkyWhite_Background_button_exists() throws Throwable{
		initDriver();
		driver.get("https://techfios.com/test/101/");
	}

	@When("^I click on the \"Set SkyBlue Background\" button$")
	public void I_click_on_the_Set_SkyBlue_button() throws Throwable{
		backgroundpage = PageFactory.initElements(driver, BackgroundColorPage.class);
		backgroundpage.clickSetSkyBlueButton();
		Thread.sleep(2000);
	}
	
	@When("^I click on the \"Set White Background\" button$")
	public void I_click_on_the_Set_White_button() throws Throwable{
		backgroundpage = PageFactory.initElements(driver, BackgroundColorPage.class);
		backgroundpage.clickSetWhiteButton();
		Thread.sleep(2000);
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable{
		backgroundpage = PageFactory.initElements(driver, BackgroundColorPage.class);
		backgroundpage.assertSkyBlue();
		tearDown();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable{		
		backgroundpage = PageFactory.initElements(driver, BackgroundColorPage.class);
		backgroundpage.assertWhite();
		tearDown();
	}
}
