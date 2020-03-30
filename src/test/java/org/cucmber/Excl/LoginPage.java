package org.cucmber.Excl;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utiltity {

	public LoginPage() {
		PageFactory.initElements(Hooks.d, this);
	}
@FindBy(id="email")
private WebElement user;

@FindBy(id="pass")
private WebElement pass;

@FindBy(id="loginbutton")
private WebElement btn;

public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}

public WebElement getBtn() {
	return btn;
}


}
