package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ContactGroupPage extends BasePage {


    @FindBy(id = "everyone")
    public WebElement allContactLink;


    @FindBy(xpath = "//span[@title='+ New group']")
    public WebElement addNewGroupText;

    @FindBy(xpath = "//button[@aria-label='Actions']")
    public WebElement addNewGroupBox;

    @FindBy(xpath = "//input[@class='action-input__input focusable']")
    public WebElement addGroupInputBox;



    @FindBy(xpath = "//div[@class='multiselect property__value multiselect--multiple']")
    public WebElement groupsBox;


    @FindBy(xpath = "//input[@placeholder='Choose property type']")
    public WebElement addNewProperty;


    @FindBy(id = "new-contact-button")
    public WebElement NewContactLink;

    @FindBy(xpath = "//div[@class='app-navigation-entry-icon icon-group']/following-sibling::span")
    public List<WebElement> groupNamesListedOnLeft;

    @FindBy(xpath = "//div[@class='property__label' and contains(text(), 'Groups')]/..//div[3]//div[@class='name-parts']")
    public List<WebElement> groupNamesListedOnRight;

    @FindBy (xpath = "//div[@class='property property--last property-anniversary' and (@prop-name=\"anniversary\")]")
    public WebElement anniversary;







    /**
     * will help you create 3 groups with parameterization method
     * @param
     */
    public void createGroupMethod(String group1, String group2, String group3) {
        ContactGroupPage contactGroupPage = new ContactGroupPage();
        contactGroupPage.addNewGroupBox.click();


        contactGroupPage.addGroupInputBox.sendKeys(group1 + Keys.ENTER);
        contactGroupPage.addGroupInputBox.sendKeys(group2 + Keys.ENTER);
        contactGroupPage.addGroupInputBox.sendKeys(group3 + Keys.ENTER);
    }








    /**
     * this will help you locate elements and (click it) with the value of title of the webElement
     * @param text
     */
    public void chooseByText(String text) {

        String locator = "(//div[@title='" + text + "'])[1]";

        WebElement element = Driver.getDriver().findElement(By.xpath(locator));

        element.click();


    }






    /**
     *
     * @param nameOfNewlyAddedProperty
     * @return will return you a WebElement that matches the name of the property you newly added
     */
    public WebElement locateNewlyAddedPropertyByName (String nameOfNewlyAddedProperty){
   String locator = "//div[@class='property__value property__title--right' and contains(text(),'" + nameOfNewlyAddedProperty + "')]";

        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        return element;
    }

    public void assertByValueOfDropDown(String text) {

        String locator = "(//div[@title='" + text + "'])[1]";

        WebElement element = Driver.getDriver().findElement(By.xpath(locator));

        element.click();


    }





    public WebElement chooseWebElementByIndex(List<WebElement> elementsName, int numOfWebElements, int numOfIndex) {


        List<WebElement> chosenWebElements = null;
        if (elementsName.size() >= numOfWebElements && numOfIndex >= 0 && numOfIndex < numOfWebElements) {
            // Choose the element at the specified index
            chosenWebElements = (List<WebElement>) elementsName.get(numOfIndex);

        } else {
            System.out.println("The specified index is out of bounds or the number of elements is insufficient.");
        }

        return (WebElement) chosenWebElements;
    }




    /**
     *
     * @param listt
     * @return this will help you get List of WebElements and will return the List<String> base on the value of title
     */
    public List<String> getElementsTextByAttribute(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getAttribute("title"));
        }
        return elemTexts;
    }


}
