package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksForScenarios {

    @Before(order = 1)
    public void setup(){
        System.out.println("launching browser with fire flink application");
    }

    @Before(order = 2)
    public void setup_with_database_connection(){
        System.out.println("Connected up with MangoDb  sucessfully");
    }

    @After (order = 1)
    public void tearDown_with_database_connection(){
        System.out.println("Disconnected up with MangoDb  sucessfully");
    }

    @After (order = 2)
    public void tearDown(){
        System.out.println("Closing  browser with fire flink application");
    }


    @BeforeStep
    public void executeBeforeStep(){
        System.out.println("Take Screenshot before execution");
    }

    @AfterStep
    public void executeAfterStep(){
        System.out.println("Take Screenshot After execution");
    }



}
