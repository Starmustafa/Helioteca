package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks_New_Tasks_Page extends BasePage {

    public Tasks_New_Tasks_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//input[@class='transparent reactive']")
    public WebElement addTaskInput;
    @FindBy(xpath = "//span[text()='Broccoli']")
    public WebElement addedTask;

    @FindBy(xpath = "//span[@class='material-design-icon checkbox-blank-outline-icon']//*[name()='svg']")
    public WebElement taskCheckBox;



    @FindBy(xpath = "//span[@title='Completed']\n")
    public WebElement completedTaskSection;

    @FindBy(xpath = "//button[@class='action-item action-item--single reactive no-nav undefined undefined has-tooltip']")
    public WebElement starIcon;

    @FindBy(xpath = "//span[normalize-space(text())='Important']")
    public WebElement importantSection;
}
