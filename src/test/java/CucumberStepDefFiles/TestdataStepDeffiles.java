package CucumberStepDefFiles;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class TestdataStepDeffiles {
    @Given("user is navigated to registartion form")
    public void user_is_navigated_to_registartion_form(){
        System.out.println("Yes user on Registration page");
    }

    @When("user enter the following details")
    public void user_enter_the_following_details(DataTable table){
         // List<List<String>> ad = table.asList(String.class); will be using to fetch data from table

    }


    @Then("click on submit button")
    public void click_on_submit_button(){

        System.out.println("user on has registered");
    }
}
