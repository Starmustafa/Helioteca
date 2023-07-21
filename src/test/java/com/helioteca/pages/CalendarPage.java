package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class CalendarPage extends BasePage{

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


  @FindBy(xpath = "(//li[@data-id='dashboard'])[1]")
   public WebElement calendar;


  @FindBy(xpath = "(//div[@style='display: inline-block;'])[2]")
  public WebElement squareBlack;

  @FindBy(xpath = "//li[@class='action active']")
  public WebElement DayButton;

  @FindBy(xpath = "(//tr[@role='presentation'])[4]")
  public WebElement dailyCalendarView;

  @FindBy(xpath = "//span[.='Week']")
    public WebElement week;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div/div/table/tbody/tr[3]/td")
    public WebElement weeklyCalendarView;

    @FindBy(xpath = "//li[@class='action active']")
    public WebElement month;

    @FindBy(xpath = "//div[@class='fc fc-media-screen fc-direction-ltr fc-theme-standard']")
    public WebElement monthlyCalendarView;

    @FindBy(xpath = "(//span[@class='material-design-icon plus-icon'])[1]")
    public WebElement newEvent;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitle;

    @FindBy(xpath = "(//input[@class='mx-input'])[2]")
    public WebElement dateFrom;

    @FindBy(xpath = "(//input[@class='mx-input'])[3]")
    public WebElement dateTo;

    @FindBy(xpath="//button[@class='mx-btn mx-datepicker-btn-confirm']")
     public WebElement oKButton;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement saveButton;

  @FindBy(xpath = "//div[.='4:00 PM']")
  public WebElement eventOnCalendar;



}
