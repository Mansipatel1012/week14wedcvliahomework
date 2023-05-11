package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import uk.co.library.browserfactory.ManageBrowser;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

@Listeners(CustomListeners.class)
public class ResultPage extends Utility {

    public ResultPage() {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;


    public void verifyTheResults(String expected) {
        String actualText = getTextFromElement(resultText);
        String expectedText = expected;
        Assert.assertEquals(actualText, expectedText, "Verify Results Title");
        // Reporter.log("Verify result title" + resultText.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Verify results");

    }
}
