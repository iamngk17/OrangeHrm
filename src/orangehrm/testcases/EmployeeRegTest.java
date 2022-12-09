package orangehrm.testcases;

import orangehrm.library.Employee;
import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeRegTest {

	public static void main(String[] args) 
	{
		AppUtils.lanchApp("http://orangehrm.qedgetech.com");
		LoginPage ip=new LoginPage();
		ip.login("Admin", "Qedge123!@#");
		Employee emp=new Employee();
		boolean res=emp.AddEployee("Pandya","Demo");
		if (res) 
		{
			System.out.println("employee reg test pass");
			
		}else {
			System.out.println("employee reg test fail");
		}
		ip.logout();
		AppUtils.closeApp();
		 
		 
		
		



	}

}
