package Test_Class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AAA.Pom1;
import AAA.Pom2;
import AAA.Pom3;
import Base_Class.base;


public class test extends base {
	private static final String utility = null;
	Pom1 login1;
	Pom2 login2;
	Pom3 home;
	
@BeforeClass
public void openBrowser() throws Throwable {
	initilizeBrowser();
    
    //all objects of POM class
    login1=new Pom1(driver);
     login2=new Pom2(driver);
     home=new Pom3(driver);
}
@BeforeMethod
public void loginToApp() throws Throwable {
	//enter un
	 
	 login1.enterUN(Utility_Class.utility.getTD(3, 1));//DPG458
	 System.out.println((Utility_Class.utility.getTD(3, 1)));
	 
	 //enter pwd
	
	login1.enterPWD(Utility_Class.utility.getTD(3, 2));
	//clck on login btn
	login1.clickLOGINBTN();
	
	//enter pin
	
	login2.enterPIN(Utility_Class.utility.getTD(3, 3));
	//click on continue btn
	login2.clickcntBtn();
}
@Test
public void verifyuserID() throws Throwable {
	Reporter.log("running verify user id",true);
	String actID = home.verifyuserID();
	 String expID=Utility_Class.utility.getTD(3, 1);
	Assert.assertEquals(expID,actID,"both are different tc is failed");
}
@AfterMethod
public void logoutApp() {
	Reporter.log("logout the application",true);
}
@AfterClass
public void closeBrowser() {
	Reporter.log("close the app",true);
}
	
}

