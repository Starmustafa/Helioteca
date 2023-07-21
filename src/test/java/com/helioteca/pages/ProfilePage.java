package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BasePage{

    public ProfilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//li[@data-id='settings']")
public WebElement settingButton;

//li[@data-id='settings']
//(//a[contains(@href,'settings')])[2]"

@FindBy(xpath= "//input[@id='displayname']")
public WebElement fullNameInput;

@FindBy(xpath = "//div[contains(@class,'header-content-displayname')]")
public WebElement userName;

@FindBy(xpath = "//input[@id='email']")
public WebElement emailInput;

@FindBy(xpath = "//select[@id='language']")
public WebElement languageDropdown;


@FindBy(xpath = "//span[@class='icon-checkmark']")
public WebElement checkMark;

}
