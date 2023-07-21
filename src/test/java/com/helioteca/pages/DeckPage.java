package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.helioteca.pages.BasePage;
import org.openqa.selenium.WebElement;

public class DeckPage extends BasePage{


    @FindBy(xpath = "(//span[@class='material-design-icon menu-icon'])[1]")
    public WebElement openNavigationButton;

    @FindBy(xpath = "//span[@title='Add board']/..")
    public WebElement addBoardButton;


    @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement boardNameField;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitArrow;

    @FindBy(xpath = "(//div[@class='app-navigation-entry-icon'])[2]")
    public WebElement schoolBoard;

    @FindBy(xpath = "//input[@id='new-stack-input-main']")
    public WebElement listNameField;

    @FindBy(xpath = "//input[@id='new-stack-input-main']")
    public WebElement getListNameField;

    @FindBy(className = "stack__title has-tooltip")
    public WebElement highSchoolList;

    @FindBy(xpath = "(//li[@data-id='deck'])[1]")
    public WebElement deckModule;
}
