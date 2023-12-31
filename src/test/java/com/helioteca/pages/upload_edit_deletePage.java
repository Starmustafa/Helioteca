package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class upload_edit_deletePage extends BasePage{

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addButton;

    @FindBy(xpath = "//span[@class='svg icon icon-upload']")
    public WebElement uploadFile;

    @FindBy(xpath = "(//span[@class='nametext'])[1]")
    public WebElement uploadedFile;

    //span[@class='svg icon icon-upload']

    //input[@type='file']




    @FindBy(xpath = "//tr[@data-file='File_to_upload.txt']")
    public WebElement File;


    @FindBy(xpath = "//span[@class='icon icon-folder svg']")
    public WebElement newFolder;



    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement folderNameInput;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[3]")
    public WebElement threeDots;

    @FindBy(xpath = "//a[@class='menuitem action action-delete permanent']")
    public WebElement deleteFile;

    @FindBy(xpath = "(//table[@id ='filestable'])[1]")
    public WebElement fileSummary;

    @FindBy(xpath = "(//span[@class='innernametext'])[2]")
    public WebElement fileToDelete;

    @FindBy(xpath = "//td[@class='filename ui-draggable ui-draggable-handle']//span[@class='innernametext'][text()='File to Delete']")
    public WebElement ahtem;






















}
