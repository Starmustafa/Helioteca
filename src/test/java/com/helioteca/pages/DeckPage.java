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

    @FindBy(className = "icon-confirm.has-tooltip")
    public WebElement submitArrow;

    @FindBy(xpath = "//span[@title='School']")
    public WebElement schoolBoard;

    @FindBy(xpath = "//input[@id='new-stack-input-main']")
    public WebElement listNameField;


    @FindBy(xpath = "//div[@class='stack__header']")
    public WebElement highSchoolList;

    @FindBy(xpath = "(//li[@data-id='deck'])[1]")
    public WebElement deckModule;
}
