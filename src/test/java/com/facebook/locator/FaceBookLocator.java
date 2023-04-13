package com.facebook.locator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.common.CommonAction;

public class FaceBookLocator extends CommonAction{
	public FaceBookLocator() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="pass")
	private WebElement pass;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement login;
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement newacc;
	
	@FindBy(name ="firstname")
	private WebElement fName;
	
	@FindBy(name ="lastname")
	private WebElement lName;
	
	@FindBy(xpath="//*[@name='reg_email__']")
	private WebElement reg;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(xpath="//input[contains(@name,'confirmation')]")
	private WebElement reReg;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="(//*[@type='radio'])[2]")
	private WebElement gender;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signin;
	
	@FindBy(tagName="a")
	private List<WebElement> texts;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	public WebElement rePass;

	public WebElement getRePass() {
		return rePass;
	}

	public List<WebElement> getTexts() {
		return texts;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getNewacc() {
		return newacc;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getReg() {
		return reg;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getReReg() {
		return reReg;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSignin() {
		return signin;
	}


}
