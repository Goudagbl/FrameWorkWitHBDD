package CucumberStepDefFiles;


import BasePackage.BaseTest;
import FireFlinkPages.LicenseManagement.ProjectListPage;
import FireFlinkPages.LicenseManagement.Sign_InPage;
import ProjectMenu.CreateProjectPage;
import ProjectMenu.EditProjectPage;
import ProjectMenu.IndividualProjectPage;
import ProjectMenu.TestDevlopmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ProjectMenuStepDefFile extends BaseTest {
    String webProjectName ;
    String  webserviceName;

    String salesforceName;
    String projectType = "Web";
    String wProjectDescription = "This web type of project ";

    String webServiceprojectType = "Web Services";
    String webServiceprojectDescription = "This Web Services type of project ";

    String salesforceprojectType = "Salesforce";
    String salesforceprojectDescription = "This  salesforce type of project ";
    public  Sign_InPage signIn;
    public  ProjectListPage plist;

    CreateProjectPage createPro;
    TestDevlopmentPage testDev;
    @Given("navigate to FireFlink Product")
    public void navigate_to_FireFlink_Product_throws_Throwable() throws Throwable {
       /* signIn   = setUp();

        */
    }
    @And("Login with valid Credentials & land on ProjectMenu page")
    public void Login_with_validCred_and_land_on_ProjectMenu_page(){
       /* plist = signIn.signInToFlinko(pro.getProperty("emailId"), pro.getProperty("Password"));

        */
    }
    @Given("Click on create project button and provide necessary details and create a project and Click on create button")
    public void Click_on_project_menu_button_and_provide_necessary_details_to_create_a_project_and_create_project(){
       /* createPro  = plist.navigateTo_createProjectPage();
        Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'header-layout-style-project')]//label")).getText(),"Create Project");
        webProjectName = randomStringGenerator();
        testDev = createPro.create_Project(webProjectName,projectType, wProjectDescription);

        */
    }
    @When("Validate the created project and delete the project")
    public void Validate_the_created_project_and_delete_the_project(){
       /* testDev.validate_userNavigated_TestDevSection("Scripts");
        IndividualProjectPage iproject =  plist.navigate_Individual_ProjectSection();
        iproject.validate_Created_Project(webProjectName,projectType);
        iproject.navigate_ToProjectsListPage();
        EditProjectPage editProject = plist.navigateToEditProjectPage(webProjectName);
        editProject.closeProject(webProjectName + " Project updated successfully");

        */
    }

    @Then("Created project should get deleted with proper successful banner message")
    public void Created_project_should_get_deleted_with_proper_successful_banner_message(){
        /* plist.deleteProject(webProjectName, webProjectName + " Project deleted successfully");

    */
    }


    @Given("Click on create project button and provide necessary details and create a web service  project and Click on create button")
    public void click_on_create_project_button_and_provide_necessary_details_and_create_a_web_service_project_and_click_on_create_button() {
       /* CreateProjectPage createPro  = plist.navigateTo_createProjectPage();
        Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'header-layout-style-project')]//label")).getText(),"Create Project");
        webserviceName = randomStringGenerator();
        testDev = createPro.create_Project(webserviceName,webServiceprojectType,webServiceprojectDescription);

        */
    }
    @When("Validate the created web service project and delete the project")
    public void validate_the_created_web_service_project_and_delete_the_project() {
      /*  testDev.validate_userNavigated_TestDevSection("Scripts");
        IndividualProjectPage iproject =  plist.navigate_Individual_ProjectSection();
        iproject.validate_Created_Project(webserviceName,webServiceprojectType);
        iproject.navigate_ToProjectsListPage();
        EditProjectPage editProject = plist.navigateToEditProjectPage(webserviceName);
        editProject.closeProject(webserviceName + " Project updated successfully");

       */

    }
    @Then("Created web service project should get deleted with proper successful banner message")
    public void created_web_service_project_should_get_deleted_with_proper_successful_banner_message() {
     /*   plist.deleteProject(webserviceName, webserviceName + " Project deleted successfully");

      */

    }



    @Given("Click on create project button and provide necessary details and create a sales force project and Click on create button")
    public void Click_on_create_project_button_and_provide_necessary_details_and_create_a_sales_force_project_and_Click_on_create_button(){
        /* CreateProjectPage createPro  = plist.navigateTo_createProjectPage();
        Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'header-layout-style-project')]//label")).getText(),"Create Project");
        salesforceName = randomStringGenerator();
       testDev = createPro.create_Project(salesforceName,salesforceprojectType,salesforceprojectDescription);

         */

    }

    @When("Validate the created  sales force project and delete the project")
    public void validate_the_created__sales_force_project_and_delete_the_project(){
      /*  testDev.validate_userNavigated_TestDevSection("Scripts");
        IndividualProjectPage iProject =  plist.navigate_Individual_ProjectSection();
        iProject.validate_Created_Project(salesforceName,salesforceprojectType);
        iProject.navigate_ToProjectsListPage();
        EditProjectPage editProject = plist.navigateToEditProjectPage(salesforceName);
        editProject.closeProject( salesforceName+ " Project updated successfully");

       */
    }

    @Then("Created  sales force project should get deleted with proper successful banner message")
    public void created__sales_force_project_should_get_deleted_with_proper_successful_banner_message(){
       /* plist.deleteProject(salesforceName, salesforceName + " Project deleted successfully");

        */
    }








}
