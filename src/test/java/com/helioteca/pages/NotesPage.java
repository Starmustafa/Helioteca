package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import com.helioteca.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage extends BasePage {

  public NotesPage(){

      PageFactory.initElements(Driver.getDriver(), this);
  }

  @FindBy(id = "notes_new_note")
  public WebElement noteButton;


  @FindBy(css = "div.CodeMirror-sizer>div>div>div")
  @CacheLookup
  public WebElement emptySpace;



  @FindBy(xpath = "(//span[@class='app-navigation-entry__title'])[4]")
  public WebElement noteTitle;





  @FindBy(xpath = "(//button[starts-with(@aria-controls,'menu')])[3]")
  public WebElement leftSideDotButton;


  public WebElement leftSideDotOptionList(String optionName){
      String locator= "//span[.='"+optionName+"']";
      WebElement element= Driver.getDriver().findElement(By.xpath(locator));
      return element;
  }
  @FindBy(xpath = "//a[.='Favorites']")
  public WebElement favoriteOption;

  public WebElement favoriteText(String newNote){
      String locator= "(//span[.='"+newNote+"'])[2]";
      WebElement favoriteText= Driver.getDriver().findElement(By.xpath(locator));
      return favoriteText;
  }

  @FindBy(xpath = "(//button[starts-with(@aria-controls,'menu')])[5]")
  public WebElement rightSideDotButton;

  @FindBy(xpath = "//span[.='Details']")
  public WebElement detailsButton;


  @FindBy(xpath = "//p[@class='app-sidebar-header__subtitle']")
  public WebElement numberOfLettersAndWords;












}


