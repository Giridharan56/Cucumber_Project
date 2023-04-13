package com.facebook.common;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonAction {
	public static WebDriver driver;
	public static Actions a;
	public static Select s;
	public static Alert al ;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	
	
	public void browserLaunch(String string) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(string);
	}
	public void browserClose() {
		driver.quit();
	}
	public void max() {
		driver.manage().window().maximize();
	}
	public void waits() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void sendText(WebElement e,String s) {
		e.sendKeys(s);
	}
	public void click(WebElement e) {
		e.click();
	}
	public void clear(WebElement e) {
		e.clear();
	}
	public void windowHandle() {
		 String parent = driver.getWindowHandle();
    	 Set<String> child = driver.getWindowHandles();
    	 for (String x:child) {
			 if(!parent.equals(x)) {
				 driver.switchTo().window(x);
			 }
			 }
	}

	public void moveToElement (WebElement e) {
		 a = new Actions (driver);
		a.moveToElement(e);
		
	}
	public void doubleClick(WebElement e) {
		a.doubleClick(e);
		
	}
	public void contextClick(WebElement e) {
		a.contextClick(e);
	}
	
	public void selectByIndex(WebElement e, int i) {
	   s = new Select(e);
	   s.selectByIndex(i);
	   }
	public void selectByValue(String value) {
		s.selectByValue(value);
	}
	public void selectByVisibleText(String text) {
		s.selectByVisibleText(text);
	}
	public void deSelectAll() {
		s.deselectAll();
	}
	public void deSelectByIndex(int i) {
		s.deselectByIndex(i);
		
	}
	public void deSelectByValue(String value) {
		s.deselectByValue(value);

	}
	public void deSelectByVisibleText(String text) {
		s.deselectByVisibleText(text);
	}
	public void getOption() {
		s.getOptions();
	}
	public void getAllSelectedOption() {
		s.getAllSelectedOptions();
	}
	public void getFirstSelectedOption() {
		s.getFirstSelectedOption();
	}
	public void parentFrame() {
		driver.switchTo().parentFrame();
	}
	public void defaultContent() {
		driver.switchTo().defaultContent();
	}
	public void accept() {
	 al = driver.switchTo().alert();
	 al.accept();
	}
	public void dismiss() {
		al.dismiss();
	}
	public void getText(WebElement e) {
		String text = e.getText();
		System.out.println(text);
	}
	public void javaDown(WebElement e) {
		 js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(false)",e);            
	}
	public void javaUp(WebElement e) {
        js.executeScript("arguments[0].scrollIntoView(true)",e);            
	}
	public void switchto() {
		driver.switchTo();
	}


}
