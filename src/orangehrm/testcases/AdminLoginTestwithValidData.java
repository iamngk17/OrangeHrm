package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithValidData {

	public static void main(String[] args) 
	{
		AppUtils.lanchApp("http://orangehrm.qedgetech.com");
		LoginPage ip=new LoginPage();
		ip.login("Admin","Qedge123!@#");
		boolean res=ip.isAdminModuleDisplayed();
		if (res) 
		{
			System.out.println("adminlogin test is pass");
			
		}else {
			System.out.println("adminlogin test is fail");
		}
		ip.logout();
		AppUtils.closeApp();
		
 


	}
	

}
