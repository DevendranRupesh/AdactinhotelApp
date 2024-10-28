package org.Hooks;

import org.Base.Baseclass;
import org.Testdetail.Testdata;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks  {

	public static WebDriver driver;
		
	     @Before
	     public  void Setup() {
	    	Baseclass.launchbrowser();
	    	Baseclass.geturl(Testdata.url);
	    	Baseclass.maximizewindow();
	    	Baseclass.implicitwait(Testdata.seconds);
	    	}
	    @After
	     public  void teardown() {
			Baseclass.quitbrowser();
			}
	     }

