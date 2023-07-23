package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletedFilePage {

        public DeletedFilePage(){

            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "//a[@aria-label='Files'][1]")
        public WebElement FilesTab;

        @FindBy(xpath = "//a[@class='action action-menu permanent']")
        public WebElement FilesThreeDots;

        @FindBy(xpath = "//a[@class='menu-option option-delete']")
        public WebElement DeleteFolderIcon;

        @FindBy(xpath = "//a[.='Deleted files']")
        public WebElement DeletedFilesTab;

        @FindBy(xpath = "(//span[@class='sort-indicator icon-triangle-s'])[2]")
        public WebElement OrderIcon;

        @FindBy(xpath = "//a[.='Deleted']")
        public WebElement OrderIcon2;

        @FindBy(xpath = "(//a[@class='action action-menu permanent'])[3]")
        public WebElement DeletedFileThreeDot;

        @FindBy(xpath = "//*[@id=\"fileList\"]/tr/td[2]/div/ul/li[1]/a")
        public WebElement DeletePermanentlyButton;

        @FindBy(xpath = "(//span[.='Restore'])[2]")
        public WebElement RestoreButton;

        @FindBy(xpath = "(//a[.='All files'])")
        public WebElement AllFilesTab;

        @FindBy(xpath = "//tbody[@id=\"fileList\"]/tr/td[@class=\"filename ui-draggable ui-draggable-handle\"]")
        public WebElement RestoredFile;

    }


