package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.className;

public class Profile_SettingsPage extends com.helioteca.pages.BasePage {

    // 1. create constructor for Profile_SettingsPage and initialize object


    @FindBy(xpath= "//input[@id='displayname']")
    public  WebElement FullNameBox;

    @FindBy(xpath= "//label[@for='displayname']")
    public  WebElement FullNameLabel;

    @FindBy(xpath= "//label[@for='email']")
    public  WebElement EmailLabel;

    @FindBy(xpath= "//label[@for='phone']")
    public  WebElement PhoneLabel;
    @FindBy(xpath = "//input[@id='email']")
    public  WebElement EmailBox;

  @FindBy(xpath = "//input[@id='phonescope']")
    public  WebElement PhoneNumBox;

 @FindBy(xpath = "//li[@data-id='settings']")
    public  WebElement settings;
@FindBy(xpath = "//li[@class='active']")
public  WebElement personalInfo;




    @FindBy(xpath = "//div[@class='user-status-menu-item__header-content-displayname']")
  public  WebElement ProfileName;

}
