package AAA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
	//Declaration
	@FindBy(xpath="//span[@class='user-id']")private WebElement userID;


	//initialization
	public Pom3(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization//method with return type
	public String verifyuserID() {

		String actID = userID.getText();
		return actID;
	}
}

