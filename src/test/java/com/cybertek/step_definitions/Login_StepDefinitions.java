package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.LoginUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_StepDefinitions {



    @Given("The user is on Vytrack login page")
    public void the_user_is_on_vytrack_login_page() {

        //Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("the user enters correct username and password for Truck Driver and clicks on Log in button")
    public void theUserEntersCorrectUsernameAndPasswordForTruckDriverAndClicksOnLogInButton() {
        LoginUtils.login("user24");

        Driver.closeDriver();
    }

    @Then("user should be able to log in to his Truck Driver account")
    public void user_should_be_able_to_log_in_to_his_truck_driver_account() {
        System.out.println("user should be able to log in to his Truck Driver account");

    }

    @When("the user enters correct username and password for Sales Manager and clicks on Log in button")
    public void theUserEntersCorrectUsernameAndPasswordForSalesManagerAndClicksOnLogInButton() {
        LoginUtils.login("salesmanager125");

        Driver.closeDriver();
    }

    @Then("user should be able to log in to his Sales Manager account")
    public void userShouldBeAbleToLogInToHisSalesManagerAccount() {
        System.out.println("user should be able to log in to his Sales Manager account");
    }

    @When("the user enters correct username  and password Store Manager and clicks on Log in button")
    public void theUserEntersCorrectUsernameAndPasswordStoreManagerAndClicksOnLogInButton() {
        LoginUtils.login("storemanager67");

    }

    @Then("user should be able to log in to his Store Manager account")
    public void userShouldBeAbleToLogInToHisStoreManagerAccount() {
        System.out.println("user should be able to log in to his Store Manager account");
    }
}