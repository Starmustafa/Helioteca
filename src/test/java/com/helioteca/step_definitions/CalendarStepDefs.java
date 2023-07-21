package com.helioteca.step_definitions;

import com.helioteca.pages.CalendarPage;
import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class CalendarStepDefs {

    CalendarPage calendarPage = new CalendarPage();

    @Given("user clicks on square Black button")
    public void user_clicks_on_square_black_button() {
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(calendarPage.squareBlack).click().perform();

    }
    @Given("user clicks on Day")
    public void user_clicks_on_day() {
     calendarPage.DayButton.click();

    }
    @Then("user should see daily Calendar View")
    public void user_should_see_daily_calendar_view() {
        Assert.assertTrue(calendarPage.dailyCalendarView.isDisplayed());

    }




    @Given("user clicks on Week")
    public void user_clicks_on_week() {
        calendarPage.week.click();
    }
    @Then("user should see weekly Calendar View")
    public void user_should_see_weekly_calendar_view() {
        Assert.assertTrue(calendarPage.weeklyCalendarView.isDisplayed());
    }





    @Given("user clicks on month")
    public void user_clicks_on_month() {
        calendarPage.month.click();
    }
    @Then("user should see monthly Calendar View")
    public void user_should_see_monthly_calendar_view() {
        Assert.assertTrue(calendarPage.monthlyCalendarView.isDisplayed());
    }









    //task4
    @Given("user clicks on New event button")
    public void user_clicks_on_new_event_button() {
        calendarPage.newEvent.click();
    }
    @Given("user clicks on Event title enter event name")
    public void user_clicks_on_event_title_enter_event_name() {
        calendarPage.eventTitle.sendKeys("Birthday Party");
    }
    @Given("user click on Date from enter the {string}")
    public void user_click_on_date_from_enter_the(String string) {
        calendarPage.dateFrom.clear();
        calendarPage.dateFrom.sendKeys("from 07/21/2023 at 12:00 PM");


    }
    @Given("user click on Date to enter the {string}")
    public void user_click_on_date_to_enter_the(String string) {
        BrowserUtils.sleep(2);
        calendarPage.dateTo.clear();
        BrowserUtils.sleep(2);
        calendarPage.dateTo.clear();
        calendarPage.dateTo.sendKeys("to 07/21/2023 at 1:00 PM");
        calendarPage.oKButton.click();
    }

    @Given("user click on Save")
    public void user_click_on_save() {
        BrowserUtils.sleep(2);
        calendarPage.saveButton.click();
    }
    @Then("user should see new event on monthly calendar view")
    public void user_should_see_new_event_on_monthly_calendar_view() {
    Assert.assertTrue(calendarPage.eventOnCalendar.isDisplayed());
    }






}
