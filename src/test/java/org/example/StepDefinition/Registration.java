package org.example.StepDefinition;
import io.cucumber.messages.types.StepDefinition;
import org.example.Pages.P0_Register;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Registration {
    P0_Register Reg=new P0_Register();

    @Given("^User enters valid mandatory fields\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\"$")

   public void Registration_Funct (String Firstname,String LastName, String Email, String phone, String coursenumber, String batchnumber)
    {
      Reg.registration_Impl(Firstname,LastName,Email,phone,coursenumber,batchnumber);
    }

    @When("User Click register button")

    public void SubmitButton()
    {

        Reg.Registerbutton();
    }
    @Then("User registered successfully")
    public void CheckRegistration()
    {
        Reg.CheckRegistration_Implemntation();
    }
}
