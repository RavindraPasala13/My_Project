package test.testcases;

import test.resources.generic.WebLibrary;

/* ######################################################################################################
 * Class Name: UserLib
 * Description: Contains the methods which are used for the common functionalities of the application
 
 * ######################################################################################################
 */
public class UserLibrary extends WebLibrary 
{
	/*
	 * ######################################################################################################
	 *  Method Name: Login
	 *  Description: To Login to a  Application,Based on UserName,Password
	 *  Input Parameters:URL,UserName,Password
	 *  Output: True/False 
	 * ######################################################################################################
	 */
	public static boolean Login(String URL, String UserName, String Password) 
	{
		boolean loginstatus = true;
		boolean status;

		status = OpenUrl(URL);
		if (status)
			LogEvent("info", "Application is Up and Running");
		else
			LogEventWithScreeshot("fail", "Unable to Launch Application");
		status = SetText("//*[@placeholder='Your email address']", UserName);
		if (status)
			LogEvent("info", "Entered Email");
		else
			LogEventWithScreeshot("fail", "Unable to Enter Email");

		status = SetText("//*[@placeholder='Your password']", Password);
		if (status)
			LogEvent("info", "Entered Password");
		else
			LogEventWithScreeshot("fail", "Unable to Enter Password");

		status = ClickElement("//span[text()='Connect']");
		wait(2000);
		if (status)
			LogEvent("info", "Clicked on Connect");
		else
			LogEventWithScreeshot("fail", "Unable to Click on Connect");
		wait(2000);
		status = Exist("//*[text()='Dashboard | Measures Manager']");
		wait(4000);
		if (status)
			LogEvent("pass", "Login is sucessful");
		else {
			LogEventWithScreeshot("fail", "Login is not sucessful");
			loginstatus = false;
		}

		return loginstatus;
	}
	
	
}










