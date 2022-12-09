package orangehrm.testcases;
import orangehrm.library.LoginPage;
import orangehrm.library.User;
import utils.AppUtils;

public class UserRegTestCase {

	public static void main(String[] args) throws InterruptedException
	{
		AppUtils.lanchApp("http://orangehrm.qedgetech.com");
		LoginPage ip=new LoginPage();
		ip.login("Admin", "Qedge123!@#");
		User us=new User();
		boolean res=us.addUser("ESS","Pandya Demo","Pandya Demo","Qedge123!@#");
		if (res) 
		{
			System.out.println("user reg testcase is pass");
			
		}else {
			System.out.println("user reg test is fail");
		}
		ip.logout();
		AppUtils.closeApp();
	}
	

}
