package com.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "Features",
		glue= {"stepDef"}
		)

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Success!!");
	}

}
