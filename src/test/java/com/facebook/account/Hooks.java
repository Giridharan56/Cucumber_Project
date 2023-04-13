package com.facebook.account;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.facebook.common.CommonAction;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonAction {
	CommonAction co = new CommonAction();
	public static String url;
	public static String email;
	public static String pass;

	
	
	
	@Before
	public void bLauncH(Scenario scenario) throws Throwable { 
		File f = new File(".\\src\\test\\resources\\Property\\Facebook.property");
		FileInputStream f1 = new FileInputStream(f);
		Properties p = new Properties();
		p.load(f1);
		 url = p.getProperty("url");
		System.out.println(url);
		 email = p.getProperty("email");
		System.out.println(email);
		 pass = p.getProperty("pass");
		System.out.println(pass);
		
		co.browserLaunch(url);
		co.max();
		final byte[] bescren = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(bescren, "image/png");
	}
	@After
	public void bClose(Scenario scenario) {
		final byte[] afscren = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(afscren, "image/png");
		co.browserClose();
	}


}
