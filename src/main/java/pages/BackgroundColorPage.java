package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundColorPage {

	WebDriver driver;

	public BackgroundColorPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//button[1]")
	WebElement SetSkyBlueButton;
	@FindBy(how = How.XPATH, using = "//button[2]")
	WebElement SetWhiteButton;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")
	WebElement SkyBlueAssertion;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")
	WebElement WhiteAssertion;

	// Methods to interact with elements

	public void clickSetSkyBlueButton() {
		SetSkyBlueButton.click();
	}

	public void clickSetWhiteButton() {
		SetWhiteButton.click();
	}

	public void assertSkyBlue() {
		String skyBlueBackgroundColor = SkyBlueAssertion.getCssValue("background-color");
		String HexBlue = Color.fromString(skyBlueBackgroundColor).asHex();
		System.out.println("Hex code for color is " + HexBlue);
	}
	public void assertWhite() {
		String WhiteBackgroundColor = WhiteAssertion.getCssValue("background-color");
		String HexWhite = Color.fromString(WhiteBackgroundColor).asHex();
		System.out.println("Hex code for color is " + HexWhite);
	}
}
