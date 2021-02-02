package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("this is coming from BEFORE");
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

    @Before("@db")
    public void setUpdb(){
        System.out.println("connecting ti DataBase........");
    }

    @After("@db")
    public void tearDowndb(){
        System.out.println("connecting ti DataBase........");
    }
}
