package com.opencart.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'pull-right']//a[contains(.,'Checkout')]")
    private WebElement checkoutButton;

    @FindBy(xpath = "//input[@id = 'input-payment-firstname']")
    private WebElement checkoutFirstName;

    @FindBy(xpath = "//input[@id = 'input-payment-lastname']")
    private WebElement checkoutLastName;

    @FindBy(xpath = "//input[@id = 'input-payment-company']")
    private WebElement checkoutCompany;

    @FindBy(xpath = "//input[@id = 'input-payment-address-1']")
    private WebElement checkoutAddress1;

    @FindBy(xpath = "//input[@id = 'input-payment-address-2']")
    private WebElement checkoutAddress2;

    @FindBy(xpath = "//input[@id = 'input-payment-city']")
    private WebElement checkoutCity;

    @FindBy(xpath = "//input[@id = 'input-payment-postcode']")
    private WebElement checkoutPostCode;

    @FindBy(xpath = "//select[@id= 'input-payment-country']")
    private WebElement checkoutCountryForm;

    @FindBy(xpath = "//select[@id = 'input-payment-country']/option[contains(.,'Ukr')]")
    private WebElement selectUkraine;

    @FindBy(xpath = "//select[@id = 'input-payment-zone']")
    private WebElement checkoutRegion;

    @FindBy(xpath = "//option[@value = '3493']")
    private WebElement selectRegionLviv;

    @FindBy(xpath = "//input[@id = 'button-payment-address']")
    private WebElement stepTwoContinueButton;

    @FindBy(xpath = "//a[contains(., 'Delivery Det')]")
    private WebElement checkoutStep3Open;

    @FindBy(xpath = "//a[contains(., 'Met')]")
    private WebElement checkoutStep4Open;

    @FindBy(xpath = "//textarea")
    private WebElement textArea;

    @FindBy(xpath = "//input[@name = 'shipping_method']")
    private WebElement radioFlatShipping;

    @FindBy(xpath = "//input[@id = 'button-shipping-method']")
    private WebElement stepFourContinueButton;

    @FindBy(xpath = "//input[@id = 'button-shipping-address']")
    private WebElement stepThreeContinueButton;

    @FindBy(xpath = "//input[@name = 'payment_method']")
    private WebElement radioPaymentMethod;

    @FindBy(xpath = "//input[@name = 'agree']")
    private WebElement checkBoxTermsAndConditions;

    @FindBy(xpath = "//input[@id = 'button-payment-method']")
    private WebElement stepFiveContinueButton;

    @FindBy(xpath = "//input[@id = 'button-confirm']")
    private WebElement stepSixOrderConfirmButton;

    @FindBy(xpath = "//a[contains(.,'Billi')]/ancestor::div[@class = 'panel panel-default']//input[@value = 'new']")
    private WebElement stepTwoNewAddress;

    @FindBy(xpath = "//a[contains(.,'Deliv')]/ancestor::div[@class = 'panel panel-default']//input[@value = 'existing']")
    private WebElement stepThreeExistingAddress;

    @FindBy(xpath = "//a[contains(.,'Deliv')]/ancestor::div[@class = 'panel panel-default']//input[@value = 'new']")
    private WebElement stepThreeNewAddress;

    @FindBy(xpath = "//a[contains(.,'Billi')]/ancestor::div[@class = 'panel panel-default']//input[@value = 'existing']")
    private WebElement stepTwoExistingAddress;

    @FindBy(xpath = "//div[@id = 'collapse-payment-method']/..//a")
    private WebElement checkoutStep5Open;

    @FindBy(xpath = "//a[contains(.,'Step 3')]/ancestor::div[@class = 'panel panel-default']//select[@name = 'address_id']")
    private WebElement stepThreeForm;

    @FindBy(xpath = "//a[contains(.,'Billi')]")
    private WebElement stepTwoOpen;

    @FindBy(xpath = "//div[@id = 'payment-existing']/select/option")
    private List<WebElement> stepTwoOptions;

    public WebElement getCheckoutFirstName() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutFirstName));
        return checkoutFirstName;
    }

    public WebElement getCheckoutLastName() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutLastName));
        return checkoutLastName;
    }

    public WebElement getCheckoutCompany() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutCompany));
        return checkoutCompany;
    }

    public WebElement getCheckoutAddress1() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutAddress1));
        return checkoutAddress1;
    }

    public WebElement getCheckoutAddress2() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutAddress2));
        return checkoutAddress2;
    }

    public WebElement getCheckoutCity() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutCity));
        return checkoutCity;
    }

    public WebElement getCheckoutPostCode() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPostCode));
        return checkoutPostCode;
    }

    public WebElement getCheckoutCountryForm() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutCountryForm));
        return checkoutCountryForm;
    }

    public WebElement getSelectUkraine() {
        wait.until(ExpectedConditions.elementToBeClickable(selectUkraine));
        return selectUkraine;
    }

    public WebElement getCheckoutRegion() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutRegion));
        return checkoutRegion;
    }

    public WebElement getSelectRegionLviv() {
        wait.until(ExpectedConditions.elementToBeClickable(selectRegionLviv));
        return selectRegionLviv;
    }



    public WebElement getStepTwoContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(stepTwoContinueButton));
        return stepTwoContinueButton;
    }

    public WebElement getCheckoutStep3Open() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutStep3Open));
        return checkoutStep3Open;
    }

    public WebElement getCheckoutStep4Open() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutStep4Open));
        return checkoutStep4Open;
    }

    public WebElement getTextArea() {
        wait.until(ExpectedConditions.elementToBeClickable(textArea));
        return textArea;
    }

    public WebElement getRadioFlatShipping() {
        wait.until(ExpectedConditions.elementToBeClickable(radioFlatShipping));
        return radioFlatShipping;
    }

    public WebElement getStepThreeContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(stepThreeContinueButton));
        return stepThreeContinueButton;
    }

    public WebElement getStepFourContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(stepFourContinueButton));
        return stepFourContinueButton;
    }

    public WebElement getRadioPaymentMethod() {
        wait.until(ExpectedConditions.elementToBeClickable(radioPaymentMethod));
        return radioPaymentMethod;
    }

    public WebElement getCheckBoxTermsAndConditions() {
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxTermsAndConditions));
        return checkBoxTermsAndConditions;
    }

    public WebElement getStepFiveContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(stepFiveContinueButton));
        return stepFiveContinueButton;
    }

    public WebElement getStepSixOrderConfirmButton() {
        wait.until(ExpectedConditions.elementToBeClickable(stepSixOrderConfirmButton));
        return stepSixOrderConfirmButton;
    }

    public WebElement getStepTwoNewAddress() {
        wait.until(ExpectedConditions.elementToBeClickable(stepTwoNewAddress));
        return stepTwoNewAddress;
    }

    public WebElement getStepTwoExistingAddress() {
        wait.until(ExpectedConditions.elementToBeClickable(stepTwoExistingAddress));
        return stepTwoExistingAddress;
    }

    public WebElement getCheckoutStep5Open() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutStep5Open));
        return checkoutStep5Open;
    }

    public WebElement getStepThreeForm() {
        wait.until(ExpectedConditions.elementToBeClickable(stepThreeForm));
        return stepThreeForm;
    }

    public WebElement getCheckoutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
        return checkoutButton;
    }

    public WebElement getStepTwoOpen() {
        wait.until(ExpectedConditions.elementToBeClickable(stepTwoOpen));
        return stepTwoOpen;
    }

    public List<WebElement> getStepTwoOptions() {
        return stepTwoOptions;
    }

    public WebElement getStepThreeExistingAddress() {
        wait.until(ExpectedConditions.elementToBeClickable(stepThreeExistingAddress));
        return stepThreeExistingAddress;
    }

    public WebElement getStepThreeNewAddress() {
        wait.until(ExpectedConditions.elementToBeClickable(stepThreeNewAddress));
        return stepThreeNewAddress;
    }
}
