package com.clarivate.cp.hooks;

import com.clarivate.cp.BaseStepDefinitions;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BaseStepDefinitions {


    @Before
    public void createTestId() {
        System.out.println("Path :"+batchFilePath);
    }

    @After
    public void tearDown() {

    }

}
