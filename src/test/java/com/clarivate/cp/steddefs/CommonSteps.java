package com.clarivate.cp.steddefs;

import com.clarivate.cp.BaseStepDefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

//1- Introduce the Cucumber spring framework here [cucumber files]
//2- Introduce the BaseDef file
//3- Give the batch file from maven pom file
//4-

public class CommonSteps extends BaseStepDefinitions{

    String filePathAndName="";
    Process pr;
    String filePath= System.getProperty("user.dir")+"\\src\\test\\resources\\batchfiles\\Count_Stage_CFDB_TestScenario.bat";
    List<String> outputList;



    @Given("^batch file \"([^\"]*)\" has been setup for testing data$")
    public void batch_file_has_been_setup_for_testing_data(String fileName) throws Throwable {
        System.out.println("Batch file has been setup for testing data");
/*
        System.out.println("Class Loader path :"+ this.getClass().getClassLoader().getResource(filePath).toString());
        fileName=this.getClass().getClassLoader().getResource(filePath).toString();
        filePathAndName=filePath+fileName+".bat";
*/
    }

    @When("^the batch files runs in the environment$")
    public void the_batch_files_runs_in_the_environment() throws Throwable {
        System.out.println("the batch files runs in the environment");
 /*       try {

            Runtime r = Runtime.getRuntime();
            pr = r.exec(filePath);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String s;
            outputList=new ArrayList<String>();
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
                outputList.add(s);
            }

        }catch (Exception ioe){
            ioe.getStackTrace();
        }
*/    }

    @Then("^it should be successful$")
    public void it_should_be_successful() throws Throwable {
        System.out.println("it should be successfull");
        List<String> testScenarios = new ArrayList<String>();
/*
        for(String temp : outputList){
            if(temp.contains("Running")){
                String tempSplit[] =temp.split("\\s+");
                testScenarios.add(tempSplit[2]);
            }
        }
        for (int i=0; i<testScenarios.size();i++){
            if(outputList.get(testScenarios.size()+i).contains("Failed")){
                Assert.assertTrue(testScenarios.get(i)+" Failed..!",false);
            }
        }
*/
    }
    private int varA;
    private  int varB;
    private  int varC;
    private int resultValue;

    @Given("^I set variable A as \"(\\d+)\"$")
    public void iSetVariableAAs(int varA) throws Throwable {
        this.varA=varA;
    }

    @And("^I set variable B as \"(\\d+)\"$")
    public void iSetVariableBAs(int varB) throws Throwable {
        this.varB=varB;
    }

    @And("^I set variable C as \"(\\d+)\"$")
    public void iSetVariableCAs(int varC) throws Throwable {
        this.varC=varC;
    }

    @When("^I perform A plus B$")
    public void iPerformAPlusB() throws Throwable {
        this.resultValue=this.varA+this.varB;
    }

    @Then("^result value should be \"(\\d+)\"$")
    public void summaShouldBe(int expectedSum) throws Throwable {
        assertThat(expectedSum,equalTo(this.resultValue));
    }

    @When("^I perform A plus B plus C$")
    public void iPerformAPlusBPlusC() throws Throwable {
        this.resultValue=this.varA+this.varB+this.varC;
    }
}
