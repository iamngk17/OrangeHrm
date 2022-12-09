package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeLoginTest {

	public static void main(String[] args) 
	{
		AppUtils.lanchApp("http://orangehrm.qedgetech.com");
		LoginPage ip=new LoginPage();
		ip.login("Pandya", "Qedge123!@#");
		boolean res=ip.isEmpModuleDisplayed();
		if (res) 
		{
			System.out.println("employee module displayed test pass");
			}else {
				System.out.println("employee module not displayed test fail");
			}
		    ip.logout();
			AppUtils.closeApp();
		     
	}

}
