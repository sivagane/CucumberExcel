package org.cucmber.Excl;



import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Hooks {

public static WebDriver d;
@Before
public void launch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Cucumber\\div\\chromedriver.exe");
	d=new ChromeDriver();
}
@After
public void close() {
	d.quit();
}

}
