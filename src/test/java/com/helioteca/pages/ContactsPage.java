package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsPage extends BasePage {

   // public ContactsPage() {
       // PageFactory.initElements(Driver.getDriver(), this);
   // }

    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement addNewContact;

    @FindBy(xpath = "//input[@id='contact-fullname']")
    public WebElement newContact;

    @FindBy(xpath = "//span[@class='option__lineone']")
    public List<WebElement> allContactsInMiddle;

    @FindBy(xpath = "//div[@class='app-navigation-entry__counter'][1]")
    public WebElement numberOfContacts;

   /* public void contactName(String text) {

        String locator = "//span[text()='" + text + "']";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        element.click();
    }
    */

    @FindBy (xpath = "//input[@id='contact-fullname']")
    public WebElement contactName;

    @FindBy(xpath = "(//button[@type='button'])[12]")
    public WebElement photoButton;

    @FindBy(xpath = "(//button[@type='button'])[19]")
    public WebElement fileButton;

/*
    /**
     * returns full of the path for the file to be uploaded
     *
     * @return String fullFilePath
     */

    /*
    public String getFullFilePathToUpload() {
        //full path of our file
        // /Users/zubaydarahman/Desktop/random/Pic/12_Muqam.jpeg

        String projectPath = System.getProperty("user.dir");
        String filePath = "/Users/zubaydarahman/Desktop/random/Pic/12_Muqam.jpeg";

        String fullFilePath = projectPath + "/" + filePath;

        return fullFilePath;
    }

     */


    @FindBy(xpath = "(//span[@class='filename-parts'])[2]")
    public WebElement fullFileElement;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement chooseButton;

  /* @FindBy(xpath = "//img[@src='blob:https://qa.seamlessly.net/38b4dee5-0b32-453a-a33d-f4fa4e70fd7d']")
    public WebElement uploadedPicture;

   */

    @FindBy(xpath = "(//span[@aria-label='Dots Horizontal icon'])[5]")
    public WebElement threeDots;

    @FindBy(xpath = "(//button[@class='action-button focusable'])[8]")
    public WebElement deleteButton;

    @FindBy(xpath = " (//span[@class='option contacts-list__item'])[1]")
    public WebElement deletedContact;
}
