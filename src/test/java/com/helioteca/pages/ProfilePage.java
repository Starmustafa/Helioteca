package com.helioteca.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProfilePage extends BasePage{


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
