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

    @FindBy(xpath = "//span[@title='School']")
    public WebElement schoolBoard;

    @FindBy(xpath = "//input[@id='new-stack-input-main']")
    public WebElement listNameField;


    @FindBy(xpath = "//h3[@class='stack__title has-tooltip']")
    public WebElement highSchoolList;

    @FindBy(xpath = "(//button[@class='action-item action-item--single icon-add undefined undefined has-tooltip'])[2]")
    public WebElement addCardButton;

    @FindBy(xpath = "(//input[@placeholder='Card name'])")
    public WebElement cardNameField;

    @FindBy(xpath = "(//input[@class='icon-confirm'])")
    public WebElement cardNameSubmitArrow;

    @FindBy(xpath = "(//div[@class='card card__editable'])")
    public WebElement newCard;

    @FindBy(xpath = "(//button[@class='icon vue-button action-item__menutoggle action-item__menutoggle--default-icon'])[5]")
    public WebElement threeDotOnCard;

    @FindBy(xpath = "(//button[@class='action-button focusable'])[6]")
    public WebElement assignToMeButton;

    @FindBy(xpath = "(//div[@aria-label='Avatar of Employee155, online'])[2]")
    public WebElement assignToMeConfirmation;

    @FindBy(xpath = "//input[@class='icon-confirm has-tooltip']")
    public WebElement addListButtonArrow;



}
