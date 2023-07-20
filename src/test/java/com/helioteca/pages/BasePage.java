package com.helioteca.pages;




import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

public  BasePage(){ PageFactory.initElements((Driver.getDriver()), this);}

    /**
     *navigate user to the given Module page by clicking on the relevant moudle icon
     * @param text
     */

    public void clickMenuByText( String text){

    String locator = "(//li[@data-id='"+text.toLowerCase()+"'])[1]";

    WebElement element = Driver.getDriver().findElement(By.xpath(locator));

    element.click();



    }

    @FindBy (xpath = "//div[@id=\"expand\"]")
    public WebElement profile;


}
