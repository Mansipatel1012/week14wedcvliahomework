package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

@Listeners(CustomListeners.class)
public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobButton;

    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;

    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;
    public void acceptCookies(){
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }



    public void enterJobTitle(String jobTitle) {
        Reporter.log("Enter job title " + jobTitleField.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter job title" + jobTitle);
        sendTextToElement(jobTitleField, jobTitle);
    }

    public void enterLocation(String location) {
        Reporter.log("Enter location " + jobTitleField.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter location" + location);
        sendTextToElement(locationField, location);

    }

    public void selectDistance(String distance) {
        Reporter.log("Enter distance " + distanceDropDown.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter distance" + distance);
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }
    public void MoreSearchOptionLink(){
        Reporter.log("Click on more option link " + moreSearchOptionLink.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter distance");
        clickOnElement(moreSearchOptionLink);

    }
    public void enterMinSalary(String minSalary){
        Reporter.log("Enter min salary" + salaryMin.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter salary min");
        sendTextToElement(salaryMin,minSalary);

    }
    public void enterMaxSalary(String maxSalary){
        Reporter.log("Enter salary max " + salaryMax.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter salary max");
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        Reporter.log("Select salary type" + salaryTypeDropDown.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Select salary type from drop down");
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    }
    public void selectJobType(String jobType){
        Reporter.log("Select job type " + jobTypeDropDown.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Select job type");
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);

    }
    public void clickOnFindJobsButton(){
        Reporter.log("Finds jobs button " + findJobButton.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "finds jobs button");
        clickOnElement(findJobButton);

    }
}
