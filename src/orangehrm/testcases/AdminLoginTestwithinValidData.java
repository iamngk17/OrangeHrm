package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithinValidData {

	public static void main(String[] args) 
	{
		AppUtils.lanchApp("http://orangehrm.qedgetech.com");
		LoginPage ip=new LoginPage();
		ip.login("abc","xyz");
		boolean err=ip.isErrMsgDisplayed();
		if (err) 
		{
			System.out.println("errmsg displayed test is pass");
			
		}else {
			System.out.println("errmsg not displayed test is fail");
		}
		AppUtils.closeApp();



	}

}
