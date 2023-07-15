package com.helioteca.pages;




import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {

public  BasePage(){ PageFactory.initElements((Driver.getDriver()), this);}


    public void clickMenuByText( String text){

    String locator = "(//li[@data-id='"+text+"'])[1]";

    WebElement element = Driver.getDriver().findElement(By.xpath(locator));

    }


}
