package framework;

import utility.BrowserInteraction;

import java.io.IOException;

public class BaseTest {

    public BrowserInteraction browerIntraction = null;
    public DriverUtil driverUtil = null;

    public BaseTest() throws IOException {
         driverUtil = new DriverUtil();
         browerIntraction = new BrowserInteraction();
    }




}
