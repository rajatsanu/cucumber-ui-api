package framework;

import utility.BrowserInteraction;

import java.io.IOException;

public class BaseTest {

    public BrowserInteraction browerIntraction = null;

    public BaseTest() throws IOException {
         browerIntraction = new BrowserInteraction();
    }




}
