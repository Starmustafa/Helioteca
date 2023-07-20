package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TasksCurrent_Page {

    public TasksCurrent_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Current']")
    public WebElement currentSection;

    @FindBy(xpath = "//div[@class='task-body__info']")
    public List<WebElement> uncompletedTasks;

    @FindBy(xpath = "//li[@id='collection_current']//div[normalize-space(text())='9']")
    public WebElement numberOfTasks;






    }



