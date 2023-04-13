package com.facebook.account;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.facebook.common.CommonAction;
import com.facebook.locator.FaceBookLocator;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBook extends CommonAction{
	CommonAction co= new CommonAction();
	FaceBookLocator fb = new FaceBookLocator();
	
	
	@Given("launch the url page")
	public void launch_the_url_page() {
		System.out.println("browserLaunched");
	   
	}

	@Given("user sends email and pass")
	public void user_sends_email_and_pass() {
		fb.getEmail().sendKeys("fdgfgdjgj");
		WebElement pass = fb.getPass();
		co.sendText(pass, "pass");
		co.javaDown(pass);
		co.waits();
	   
	}

	@And("user get all text")
	public void user_get_all_text() {
		List<WebElement> texts = fb.getTexts();
		for (int i = 0; i < texts.size(); i++) {
			WebElement text = texts.get(i);
			System.out.println(text.getText());
			
		}
		
	    
	}

	@When("user click log in")
	public void user_click_log_in() {
	    fb.getLogin().getText();
	}

	@Given("user click the new acc")
	public void user_click_the_new_acc() {
		WebElement newacc = fb.getNewacc();
//		newacc.click();
		co.click(newacc);
		
	}

	@And("user clicks firstname {string}")
	public void user_clicks_firstname(String string1) {
		driver.switchTo();
		co.waits();
		WebElement fName = fb.getfName();
		co.sendText(fName, string1);
	   
	}

	@When("user clicks lastname {string}")
	public void user_clicks_lastname(String string2) {
		WebElement lName = fb.getlName();
		co.sendText(lName, string2);
	   
	}

	@Then("user clicks email {string}")
	public void user_clicks_email(String string3) {
		WebElement reg = fb.getReg();
		co.sendText(reg, string3);
		WebElement reReg = fb.getReReg();
		reReg.isDisplayed();
		co.sendText(reReg, string3);
	}

	@When("user clicks password {string}")
	public void user_clicks_password(String string4) {
		WebElement rePass = fb.rePass;
		co.sendText(rePass, string4);
	   
	}

	@Then("user clicks DOB {string} {string} {string}")
	public void user_clicks_DOB(String string5, String string6, String string7) {
	    WebElement day = fb.getDay();
	    co.sendText(day, string5);
	    WebElement month = fb.getMonth();
	    co.sendText(month, string6);
	    WebElement year = fb.getYear();
		co.sendText(year, string7);
	}

	@When("user clicks gender")
	public void user_clicks_gender() {
		WebElement gender = fb.getGender();
		co.click(gender);
	   
	}


}
