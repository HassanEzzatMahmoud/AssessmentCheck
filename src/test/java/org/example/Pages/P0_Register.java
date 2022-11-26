package org.example.Pages;
import org.apache.commons.lang3.StringUtils;
import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class P0_Register {


        JavascriptExecutor js;
        WebDriver driver=Hooks.driver;

        public void registration_Impl(String Firstname, String Lastname, String email, String phone, String coursenumber, String batch){

            js=(JavascriptExecutor) driver;
            Firstname= StringUtils.capitalize(Firstname); // This step is to make first char capital of first name
            System.out.println(Firstname + "\n");
            Lastname= StringUtils.capitalize(Lastname); // This step is to make first char capital of last name
            System.out.println(Lastname + "\n");
            driver.findElement(By.xpath("//input[@id='nf-field-17']")).sendKeys(Firstname); //FirstName
            driver.findElement(By.xpath("//input[@id='nf-field-18']")).sendKeys(Lastname); //LastName
            driver.findElement(By.xpath("//input[@id='nf-field-19']")).sendKeys(email); //Email
            driver.findElement(By.xpath("//input[@id='nf-field-20']")).sendKeys(phone); //Phone Number
            js.executeScript("window.scroll(0,700)"); //Scroll down to find elements
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //Wait till elements are avaliable
            WebElement Coursename=driver.findElement(By.xpath("//select[@id='nf-field-22']")); //Course Static dropdown list
            Select CourseValue=new Select(Coursename);
            CourseValue.selectByValue(coursenumber); //To select course by name
            WebElement Month=driver.findElement(By.xpath("//select[@id='nf-field-24']")); //Batch ID
            Select MonthID=new Select(Month);
            MonthID.selectByValue(batch); //Select batch by month name

            driver.findElement(By.xpath("//label[@id='nf-label-class-field-23-0']")).click();// for radio button



        }
        public void Registerbutton()
        {
            //This is a function implementation for Clicking register button

            js.executeScript("window.scroll(0,1000)"); //Scroll down to find elements
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.findElement(By.xpath("//input[@id='nf-field-15']")).click();

        }

        public void CheckRegistration_Implemntation()
    {
        js.executeScript("window.scroll(0,0)"); //Scroll down to find elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String Expected="Thank you for registering for our event.";
        String Actual=driver.findElement(By.xpath("//p[contains(text(),'Thank you for registering for our event.')]")).getText();
        System.out.println("Actual Message : "+ Actual);
        Assert.assertTrue(Actual.equals(Expected),"Message is different");
    }



}


