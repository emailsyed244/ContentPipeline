package com.clarivate.cp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ContextConfiguration("classpath:cucumberTest-context.xml")
public class BaseStepDefinitions {

    @Value("${batchFilePath}")
    protected String batchFilePath;


}
