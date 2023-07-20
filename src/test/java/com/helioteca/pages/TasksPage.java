package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage extends BasePage {

public TasksPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

 @FindBy(xpath ="//span[@title='Add List…']")
    public WebElement addList;
@FindBy(xpath = "//input[@id='newListInput']")
    public WebElement newListInput;

@FindBy(xpath = "//li[@class='app-navigation-entry collection reactive collection--edit']//input[@title='Save']")
    public WebElement saveButton;


    @FindBy(xpath = "//a[@class='app-navigation-entry-link']//span[@title='Grocery']")
    public WebElement addedList;

}
