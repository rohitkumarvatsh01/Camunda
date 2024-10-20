package com.employee.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class BackgroundCheckDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        String employeeName = (String) execution.getVariable("employeeName");
        System.out.println("Performing background check for " + employeeName);
    }
}