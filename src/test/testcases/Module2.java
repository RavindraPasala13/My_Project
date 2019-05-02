package test.testcases;
public class Module2 extends UserLibrary {
	public static void TC_03_To_check_EntireModules()
	{
		boolean status = false;
		//Step 1 and Step 2 of the TC, login to application using valid userName & password
				Login(URL, UserName , Password);
				status = ClickElement("//*[text()='Dashboard']");
				if (status)
					LogEvent("info", "Clicked on Dashboard");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Dashboard");
			     wait(200);
				status = ClickElement("//*[text()='Participants']");
				if (status)
					LogEvent("info", "Clicked on Participants");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Participants");
				wait(200);
				status = ClickElement("//*[text()='Organizations ']");
				if (status)
					LogEvent("info", "Clicked on Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Organizations");
				wait(200);
				status = ClickElement("//*[text()='Practices ']");
				if (status)
					LogEvent("info", "Clicked on Practices");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Practices");
				wait(200);
				status = ClickElement("//*[text()='Providers ']");
				if (status)
					LogEvent("info", "Clicked on Providers");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Providers");
				wait(200);
				status = ClickElement("//*[text()='Patients ']");
				if (status)
					LogEvent("info", "Clicked on Patients");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Patients");
				wait(200);
				status = ClickElement("//*[text()='Patients Details ']");
				if (status)
					LogEvent("info", "Clicked on Patients Details");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Patients Details");
				wait(200);
				status = ClickElement("//*[text()='Analytics']");
				if (status)
					LogEvent("info", "Clicked on Analytics");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Analytics");
				wait(200);
				status = ClickElement("//*[text()='Measure Analysis ']");
				if (status)
					LogEvent("info", "Clicked on Measure Analysis");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Measure Analysis");
				wait(200);
				status = ClickElement("//*[text()='Patient Analysis ']");
				if (status)
					LogEvent("info", "Clicked on Measure Patient Analysis");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Patient Analysis");
				wait(200);
				status = ClickElement("//*[text()='DSRIP Reports ']");
				if (status)
					LogEvent("info", "Clicked on Measure DSRIP Reports");
				else
					LogEventWithScreeshot("fail", "Unable to Click on DSRIP Reports");
				wait(200);
				status = ClickElement("//*[@class='feather feather-layers']");
				if (status)
					LogEvent("info", "Clicked on Measures");
				else
					LogEventWithScreeshot("fail", "Unable to Click on measures");
				wait(200);
				status = ClickElement("//*[@class='feather feather-settings']");
				wait(20);
				if (status)
					LogEvent("info", "Clicked on Settings Button");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Settings Button");
				status = ClickElement("//*[text()=' Practice Management ']");
				wait(20);
				if (status)
					LogEvent("info", "Clicked on Practice Management");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Practice Management");
				status = ClickElement("//*[text()='Add New Client']");
				wait(200);
				if (status)
					LogEvent("info", "Clicked on Add New Client");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Add New Client");
				status = SetText("//*[@placeholder='Define Client']",ClientName);
				if (status)
					LogEvent("info", "Entered ClientName");
				else
					LogEventWithScreeshot("fail", "Unable to Entered ClientName");
				status = SetText("//*[@placeholder='Define TIN']",TIN);
				if (status)
					LogEvent("info", "Entered TIN");
				else
					LogEventWithScreeshot("fail", "Unable to Entered TIN");
				status = SetText("//*[@placeholder='Location']",Location);
				if (status)
					LogEvent("info", "Entered Location");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Location");
				status = SetText("//*[@placeholder='Zipcode']",Zipcode);
				if (status)
					LogEvent("info", "Entered Zipcode");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Zipcode");
				status = SetText("//*[@placeholder='Main Contact']",MainContact);
				if (status)
					LogEvent("info", "Entered MainContact");
				else
					LogEventWithScreeshot("fail", "Unable to Entered MainContact");
				wait(2);
				status = SetText("//*[@placeholder='Email']", Email);
				if (status)
					LogEvent("info", "Entered Email");
				else
					LogEventWithScreeshot("fail", "Unable to Email");
				wait(200);
				status = ClickElement("//*[@class='btn-text']");
				if (status)
					LogEvent("info", "Clicked on Add Client");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Add Client");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[1]/span");
				if (status)
					LogEvent("info", "Clicked on View Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to Click on View Organizations");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[2]/span");
				if (status)
					LogEvent("info", "Clicked on Edit client");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Edit client");
				wait(200);
				status = SetText("//*[@placeholder='Define Client']",ReClientName);
				if (status)
					LogEvent("info", "Entered ClientName");
				else
					LogEventWithScreeshot("fail", "Unable to Entered ClientName");
				wait(20);
				status = ClickElement("//*[text()='Update Client']");
				if (status)
					LogEvent("info", "Clicked on Update client");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Update client");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[3]/span");
				wait(200);
				if (status)
					LogEvent("info", "Add organizations to the client");
				else
					LogEventWithScreeshot("fail", "Unable to Add organizations to the client");
				wait(20);
				status = SetText("//*[@placeholder='Define Organization']",Organization);
				if (status)
					LogEvent("info", "Entered Organization");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Organization");
				wait(20);
				status = SetText("//*[@placeholder='Define TIN']",TIN1);
				if (status)
					LogEvent("info", "Entered TIN");
				else
					LogEventWithScreeshot("fail", "Unable to Entered TIN");
				wait(20);
				status = SetText("//*[@placeholder='Main Contact']",MainContact1);
				if (status)
					LogEvent("info", "Entered Main Contact");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Main Contact");
				wait(20);
				status = SetText("//*[@placeholder='Email']",Email1);
				if (status)
					LogEvent("info", "Entered Email");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Email");
				wait(200);
				status = ClickElement("//*[@class='btn btn-secondary ladda-button']");
				if (status)
					LogEvent("info", "Add organizations to the client");
				else
					LogEventWithScreeshot("fail", "Unable to Add organizations to the client");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[1]/span");
				if (status)
					LogEvent("info", "view Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to view Organizations");
				wait(200);
				status = ClickElement("//*[@id='collapse_0']/div/div[1]/div/div/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view practices");
				else
					LogEventWithScreeshot("fail", "Unable to view practices");
				wait(20);
				status = ClickElement("//*[@id='collapse_0']/div/div[1]/div/div/div[4]/div/button[3]/span");
				if (status)
					LogEvent("info", "ADD practices");
				else
					LogEventWithScreeshot("fail", "Unable to ADD practices");
				
				wait(20);
				status = SetText("//*[@placeholder='Define Practice']",Practice);
				if (status)
					LogEvent("info", "Entered Practice");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Practice");
				wait(20);
				status = SetText("//*[@placeholder='TIN # ']",Tin2);
				if (status)
					LogEvent("info", "Entered TIN");
				else
					LogEventWithScreeshot("fail", "Unable to Entered TIN");
				wait(20);
				status = SetText("//*[@placeholder='Contact Name']",Contact);
				if (status)
					LogEvent("info", "Entered Contact");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Contact");
				wait(20);
				status = SetText("//*[@placeholder='Email']",Email2);
				if (status)
					LogEvent("info", "Entered Email");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Email");
				wait(200);
				status = ClickElement("//*[text()='Add Practice']");
				if (status)
					LogEvent("info", "Click on practice");
				else
					LogEventWithScreeshot("fail", "Unable to Click on practice");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[1]/span");
				if (status)
					LogEvent("info", "view Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to view Organizations");
				wait(200);
				status = ClickElement("//*[@id='collapse_0']/div/div[1]/div/div/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view practices");
				else
					LogEventWithScreeshot("fail", "Unable to view practices");
				wait(200);
				status = ClickElement("//*[@id='collapsePractices_0']/div/div/div/div[1]/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view providers");
				else
					LogEventWithScreeshot("fail", "Unable to view providers");
				wait(200);
				status = ClickElement("//*[@id='collapsePractices_0']/div/div/div/div[1]/div[4]/div/button[3]/span");
				if (status)
					LogEvent("info", "Add providers");
				else
					LogEventWithScreeshot("fail", "Unable to Add providers");
				wait(20);
				status = SetText("//*[@placeholder='Define Provider']",provider);
				if (status)
					LogEvent("info", "Entered Provider");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Provider");
				wait(20);
				status = SetText("//*[@placeholder='Contact Name']",Contact1);
				if (status)
					LogEvent("info", "Entered Contact1");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Contact1");
				wait(20);
				status = SetText("//*[@placeholder='Location']",Location1);
				if (status)
					LogEvent("info", "Entered Location1");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Location1");
				wait(20);
				status = SetText("//*[@placeholder='Email']",Email3);
				if (status)
					LogEvent("info", "Entered Email3");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Email3");
				wait(200);
				status = SetText("//*[@placeholder='City']",City);
				if (status)
					LogEvent("info", "Entered City");
				else
					LogEventWithScreeshot("fail", "Unable to Entered City");
				wait(20);
				status = SetText("//*[@placeholder='State']",State);
				if (status)
					LogEvent("info", "Entered State");
				else
					LogEventWithScreeshot("fail", "Unable to Entered State");
				wait(20);
				status = SetText("//*[@placeholder='Zip']",ZIP1);
				if (status)
					LogEvent("info", "Entered ZIP1");
				else
					LogEventWithScreeshot("fail", "Unable to Entered ZIP1");
				wait(20);
				status = SetText("//*[@placeholder='NPI']",NPI1);
				if (status)
					LogEvent("info", "Entered NPI");
				else
					LogEventWithScreeshot("fail", "Unable to Entered NPI");
				wait(200);
				status = ClickElement("//*[text()='Add Provider']");
				if (status)
					LogEvent("info", "Click on  Provider");
				else
					LogEventWithScreeshot("fail", "Unable to Click on  Provider");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[1]/span");
				if (status)
					LogEvent("info", "view Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to view Organizations");
				wait(200);
				status = ClickElement("//*[@id='collapse_0']/div/div[1]/div/div/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view practices");
				else
					LogEventWithScreeshot("fail", "Unable to view practices");
				wait(200);
				status = ClickElement("//*[@id='collapsePractices_0']/div/div/div/div[1]/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view providers");
				else
					LogEventWithScreeshot("fail", "Unable to view providers");
	}

	
	public static void TC_03_ToLogin_as_a_System_admin_Tocheck_Practicemanagement() 
	{
		boolean status = false;
		//Step 1 and Step 2 of the TC, login to application using valid userName & password
				Login(URL, UserName , Password);
				status = ClickElement("//*[text()='Dashboard']");
				if (status)
					LogEvent("info", "Clicked on Dashboard");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Dashboard");
			     wait(200);
				status = ClickElement("//*[text()='Participants']");
				if (status)
					LogEvent("info", "Clicked on Participants");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Participants");
				wait(200);
				status = ClickElement("//*[text()='Organizations ']");
				if (status)
					LogEvent("info", "Clicked on Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Organizations");
				wait(200);
				status = ClickElement("//*[text()='Practices ']");
				if (status)
					LogEvent("info", "Clicked on Practices");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Practices");
				wait(200);
				status = ClickElement("//*[text()='Providers ']");
				if (status)
					LogEvent("info", "Clicked on Providers");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Providers");
				wait(200);
				status = ClickElement("//*[text()='Patients ']");
				if (status)
					LogEvent("info", "Clicked on Patients");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Patients");
				wait(200);
				status = ClickElement("//*[text()='Patients Details ']");
				if (status)
					LogEvent("info", "Clicked on Patients Details");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Patients Details");
				wait(200);
				status = ClickElement("//*[text()='Planning']");
				if (status)
					LogEvent("info", "Clicked on Planning");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Planning");
				wait(200);
				status = ClickElement("//*[@class='feather feather-layers']");
				if (status)
					LogEvent("info", "Clicked on Measures");
				else
					LogEventWithScreeshot("fail", "Unable to Click on measures");
				wait(200);
				status = ClickElement("//*[text()='Analytics']");
				if (status)
					LogEvent("info", "Clicked on Analytics");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Analytics");
				wait(200);
				status = ClickElement("//*[text()='Measure Analysis ']");
				if (status)
					LogEvent("info", "Clicked on Measure Analysis");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Measure Analysis");
				wait(200);
				status = ClickElement("//*[text()='Patient Analysis ']");
				wait(2000);
				if (status)
					LogEvent("info", "Clicked on Measure Patient Analysis");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Patient Analysis");
				wait(200);
				status = ClickElement("//*[text()='Admin Reports ']");
				if (status)
					LogEvent("info", "Clicked on Measure Admin Reports");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Admin Reports");
				wait(200);
				status = ClickElement("//*[text()='DSRIP Reports ']");
				wait(200);
				if (status)
					LogEvent("info", "Clicked on Measure DSRIP Reports");
				else
					LogEventWithScreeshot("fail", "Unable to Click on DSRIP Reports");
				
				wait(200);
				status = ClickElement("//*[text()='Contracts']");
				wait(200);
				if (status)
					LogEvent("info", "Clicked on Contracts");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Contracts");
				wait(200);
				status = ClickElement("//*[text()='Contract Manager ']");
				wait(200);
				if (status)
					LogEvent("info", "Clicked on Contract Manager");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Contract Manager");
				wait(200);
				status = ClickElement("//*[text()='Add New Contract ']");
				wait(200);
				if (status)
					LogEvent("info", "Clicked on Add New Contract");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Add New Contract");
				wait(200);
				status = ClickElement("//*[text()='Template Manager ']");
				wait(200);
				if (status)
					LogEvent("info", "Clicked on Template Manager");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Template Manager");
				wait(200);
				status = ClickElement("//*[text()='Create Template ']");
				if (status)
					LogEvent("info", "Clicked on Create Template");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Create Template");
				wait(200);
				status = ClickElement("//*[@class='feather feather-settings']");
				wait(20);
				if (status)
					LogEvent("info", "Clicked on Settings Button");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Settings Button");
				status = ClickElement("//*[text()=' Practice Management ']");
				wait(20);
				if (status)
					LogEvent("info", "Clicked on Practice Management");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Practice Management");
				status = ClickElement("//*[text()='Add New Client']");
				wait(200);
				if (status)
					LogEvent("info", "Clicked on Add New Client");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Add New Client");
				status = SetText("//*[@placeholder='Define Client']",ClientName);
				if (status)
					LogEvent("info", "Entered ClientName");
				else
					LogEventWithScreeshot("fail", "Unable to Entered ClientName");
				status = SetText("//*[@placeholder='Define TIN']",TIN);
				if (status)
					LogEvent("info", "Entered TIN");
				else
					LogEventWithScreeshot("fail", "Unable to Entered TIN");
				status = SetText("//*[@placeholder='Location']",Location);
				if (status)
					LogEvent("info", "Entered Location");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Location");
				status = SetText("//*[@placeholder='Zipcode']",Zipcode);
				if (status)
					LogEvent("info", "Entered Zipcode");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Zipcode");
				status = SetText("//*[@placeholder='Main Contact']",MainContact);
				if (status)
					LogEvent("info", "Entered MainContact");
				else
					LogEventWithScreeshot("fail", "Unable to Entered MainContact");
				wait(2);
				status = SetText("//*[@placeholder='Email']", Email);
				if (status)
					LogEvent("info", "Entered Email");
				else
					LogEventWithScreeshot("fail", "Unable to Email");
				wait(200);
				status = ClickElement("//*[@class='btn-text']");
				if (status)
					LogEvent("info", "Clicked on Add Client");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Add Client");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[1]/span");
				if (status)
					LogEvent("info", "Clicked on View Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to Click on View Organizations");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[2]/span");
				if (status)
					LogEvent("info", "Clicked on Edit client");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Edit client");
				wait(200);
				status = SetText("//*[@placeholder='Define Client']",ReClientName);
				if (status)
					LogEvent("info", "Entered ClientName");
				else
					LogEventWithScreeshot("fail", "Unable to Entered ClientName");
				wait(20);
				status = ClickElement("//*[text()='Update Client']");
				if (status)
					LogEvent("info", "Clicked on Update client");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Update client");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[3]/span");
				wait(200);
				if (status)
					LogEvent("info", "Add organizations to the client");
				else
					LogEventWithScreeshot("fail", "Unable to Add organizations to the client");
				wait(20);
				status = SetText("//*[@placeholder='Define Organization']",Organization);
				if (status)
					LogEvent("info", "Entered Organization");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Organization");
				wait(20);
				status = SetText("//*[@placeholder='Define TIN']",TIN1);
				if (status)
					LogEvent("info", "Entered TIN");
				else
					LogEventWithScreeshot("fail", "Unable to Entered TIN");
				wait(20);
				status = SetText("//*[@placeholder='Main Contact']",MainContact1);
				if (status)
					LogEvent("info", "Entered Main Contact");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Main Contact");
				wait(20);
				status = SetText("//*[@placeholder='Email']",Email1);
				if (status)
					LogEvent("info", "Entered Email");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Email");
				wait(200);
				status = ClickElement("//*[@class='btn btn-secondary ladda-button']");
				if (status)
					LogEvent("info", "Add organizations to the client");
				else
					LogEventWithScreeshot("fail", "Unable to Add organizations to the client");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[1]/span");
				if (status)
					LogEvent("info", "view Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to view Organizations");
				wait(200);
				status = ClickElement("//*[@id='collapse_0']/div/div[1]/div/div/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view practices");
				else
					LogEventWithScreeshot("fail", "Unable to view practices");
				wait(20);
				status = ClickElement("//*[@id='collapse_0']/div/div[1]/div/div/div[4]/div/button[3]/span");
				if (status)
					LogEvent("info", "ADD practices");
				else
					LogEventWithScreeshot("fail", "Unable to ADD practices");
				
				wait(20);
				status = SetText("//*[@placeholder='Define Practice']",Practice);
				if (status)
					LogEvent("info", "Entered Practice");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Practice");
				wait(20);
				status = SetText("//*[@placeholder='TIN # ']",Tin2);
				if (status)
					LogEvent("info", "Entered TIN");
				else
					LogEventWithScreeshot("fail", "Unable to Entered TIN");
				wait(20);
				status = SetText("//*[@placeholder='Contact Name']",Contact);
				if (status)
					LogEvent("info", "Entered Contact");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Contact");
				wait(20);
				status = SetText("//*[@placeholder='Email']",Email2);
				if (status)
					LogEvent("info", "Entered Email");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Email");
				wait(200);
				status = ClickElement("//*[text()='Add Practice']");
				if (status)
					LogEvent("info", "Click on practice");
				else
					LogEventWithScreeshot("fail", "Unable to Click on practice");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[1]/span");
				if (status)
					LogEvent("info", "view Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to view Organizations");
				wait(200);
				status = ClickElement("//*[@id='collapse_0']/div/div[1]/div/div/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view practices");
				else
					LogEventWithScreeshot("fail", "Unable to view practices");
				wait(200);
				status = ClickElement("//*[@id='collapsePractices_0']/div/div/div/div[1]/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view providers");
				else
					LogEventWithScreeshot("fail", "Unable to view providers");
				wait(200);
				status = ClickElement("//*[@id='collapsePractices_0']/div/div/div/div[1]/div[4]/div/button[3]/span");
				if (status)
					LogEvent("info", "Add providers");
				else
					LogEventWithScreeshot("fail", "Unable to Add providers");
				wait(20);
				status = SetText("//*[@placeholder='Define Provider']",provider);
				if (status)
					LogEvent("info", "Entered Provider");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Provider");
				wait(20);
				status = SetText("//*[@placeholder='Contact Name']",Contact1);
				if (status)
					LogEvent("info", "Entered Contact");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Contact");
				wait(20);
				status = SetText("//*[@placeholder='Location']",Location1);
				if (status)
					LogEvent("info", "Entered Location");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Location");
				wait(20);
				status = SetText("//*[@placeholder='Email']",Email3);
				if (status)
					LogEvent("info", "Entered Email");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Email");
				wait(200);
				status = SetText("//*[@placeholder='City']",City);
				if (status)
					LogEvent("info", "Entered City");
				else
					LogEventWithScreeshot("fail", "Unable to Entered City");
				wait(20);
				status = SetText("//*[@placeholder='State']",State);
				if (status)
					LogEvent("info", "Entered State");
				else
					LogEventWithScreeshot("fail", "Unable to Entered State");
				wait(20);
				status = SetText("//*[@placeholder='Zip']",ZIP1);
				if (status)
					LogEvent("info", "Entered ZIP1");
				else
					LogEventWithScreeshot("fail", "Unable to Entered ZIP1");
				wait(20);
				status = SetText("//*[@placeholder='NPI']",NPI1);
				if (status)
					LogEvent("info", "Entered NPI");
				else
					LogEventWithScreeshot("fail", "Unable to Entered NPI");
				wait(200);
				status = ClickElement("//*[text()='Add Provider']");
				if (status)
					LogEvent("info", "Click on  Provider");
				else
					LogEventWithScreeshot("fail", "Unable to Click on  Provider");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[1]/span");
				if (status)
					LogEvent("info", "view Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to view Organizations");
				wait(200);
				status = ClickElement("//*[@id='collapse_0']/div/div[1]/div/div/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view practices");
				else
					LogEventWithScreeshot("fail", "Unable to view practices");
				wait(200);
				status = ClickElement("//*[@id='collapsePractices_0']/div/div/div/div[1]/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view providers");
				else
					LogEventWithScreeshot("fail", "Unable to view providers");
				wait(2000);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*boolean status = false;
		//Step 1 and Step 2 of the TC, login to application using valid userName & password
				Login(URL, UserName , Password);
				status = ClickElement("//*[@class='feather feather-settings']");
				wait(20);
				if (status)
					LogEvent("info", "Clicked on Settings Button");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Settings Button");
				status = ClickElement("//*[text()=' Practice Management ']");
				wait(20);
				if (status)
					LogEvent("info", "Clicked on Practice Management");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Practice Management");
				status = ClickElement("//*[text()='Add New Client']");
				wait(200);
				if (status)
					LogEvent("info", "Clicked on Add New Client");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Add New Client");
				status = SetText("//*[@placeholder='Define Client']",ClientName);
				if (status)
					LogEvent("info", "Entered ClientName");
				else
					LogEventWithScreeshot("fail", "Unable to Entered ClientName");
				status = SetText("//*[@placeholder='Define TIN']",TIN);
				if (status)
					LogEvent("info", "Entered TIN");
				else
					LogEventWithScreeshot("fail", "Unable to Entered TIN");
				status = SetText("//*[@placeholder='Location']",Location);
				if (status)
					LogEvent("info", "Entered Location");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Location");
				status = SetText("//*[@placeholder='Zipcode']",Zipcode);
				if (status)
					LogEvent("info", "Entered Zipcode");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Zipcode");
				status = SetText("//*[@placeholder='Main Contact']",MainContact);
				if (status)
					LogEvent("info", "Entered MainContact");
				else
					LogEventWithScreeshot("fail", "Unable to Entered MainContact");
				wait(2);
				status = SetText("//*[@placeholder='Email']", Email);
				if (status)
					LogEvent("info", "Entered Email");
				else
					LogEventWithScreeshot("fail", "Unable to Email");
				wait(200);
				status = ClickElement("//*[@class='btn-text']");
				if (status)
					LogEvent("info", "Clicked on Add Client");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Add Client");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[1]/span");
				if (status)
					LogEvent("info", "Clicked on View Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to Click on View Organizations");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[2]/span");
				if (status)
					LogEvent("info", "Clicked on Edit client");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Edit client");
				wait(200);
				status = SetText("//*[@placeholder='Define Client']",ReClientName);
				if (status)
					LogEvent("info", "Entered ClientName");
				else
					LogEventWithScreeshot("fail", "Unable to Entered ClientName");
				wait(20);
				status = ClickElement("//*[text()='Update Client']");
				if (status)
					LogEvent("info", "Clicked on Update client");
				else
					LogEventWithScreeshot("fail", "Unable to Click on Update client");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[3]/span");
				wait(200);
				if (status)
					LogEvent("info", "Add organizations to the client");
				else
					LogEventWithScreeshot("fail", "Unable to Add organizations to the client");
				wait(20);
				status = SetText("//*[@placeholder='Define Organization']",Organization);
				if (status)
					LogEvent("info", "Entered Organization");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Organization");
				wait(20);
				status = SetText("//*[@placeholder='Define TIN']",TIN1);
				if (status)
					LogEvent("info", "Entered TIN");
				else
					LogEventWithScreeshot("fail", "Unable to Entered TIN");
				wait(20);
				status = SetText("//*[@placeholder='Main Contact']",MainContact1);
				if (status)
					LogEvent("info", "Entered Main Contact");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Main Contact");
				wait(20);
				status = SetText("//*[@placeholder='Email']",Email1);
				if (status)
					LogEvent("info", "Entered Email");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Email");
				wait(200);
				status = ClickElement("//*[@class='btn btn-secondary ladda-button']");
				if (status)
					LogEvent("info", "Add organizations to the client");
				else
					LogEventWithScreeshot("fail", "Unable to Add organizations to the client");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[1]/span");
				if (status)
					LogEvent("info", "view Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to view Organizations");
				wait(200);
				status = ClickElement("//*[@id='collapse_0']/div/div[1]/div/div/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view practices");
				else
					LogEventWithScreeshot("fail", "Unable to view practices");
				wait(20);
				status = ClickElement("//*[@id='collapse_0']/div/div[1]/div/div/div[4]/div/button[3]/span");
				if (status)
					LogEvent("info", "ADD practices");
				else
					LogEventWithScreeshot("fail", "Unable to ADD practices");
				
				wait(20);
				status = SetText("//*[@placeholder='Define Practice']",Practice);
				if (status)
					LogEvent("info", "Entered Practice");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Practice");
				wait(20);
				status = SetText("//*[@placeholder='TIN # ']",Tin2);
				if (status)
					LogEvent("info", "Entered TIN");
				else
					LogEventWithScreeshot("fail", "Unable to Entered TIN");
				wait(20);
				status = SetText("//*[@placeholder='Contact Name']",Contact);
				if (status)
					LogEvent("info", "Entered Contact");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Contact");
				wait(20);
				status = SetText("//*[@placeholder='Email']",Email2);
				if (status)
					LogEvent("info", "Entered Email");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Email");
				wait(200);
				status = ClickElement("//*[text()='Add Practice']");
				if (status)
					LogEvent("info", "Click on practice");
				else
					LogEventWithScreeshot("fail", "Unable to Click on practice");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[1]/span");
				if (status)
					LogEvent("info", "view Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to view Organizations");
				wait(200);
				status = ClickElement("//*[@id='collapse_0']/div/div[1]/div/div/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view practices");
				else
					LogEventWithScreeshot("fail", "Unable to view practices");
				wait(200);
				status = ClickElement("//*[@id='collapsePractices_0']/div/div/div/div[1]/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view providers");
				else
					LogEventWithScreeshot("fail", "Unable to view providers");
				wait(200);
				status = ClickElement("//*[@id='collapsePractices_0']/div/div/div/div[1]/div[4]/div/button[3]/span");
				if (status)
					LogEvent("info", "Add providers");
				else
					LogEventWithScreeshot("fail", "Unable to Add providers");
				wait(20);
				status = SetText("//*[@placeholder='Define Provider']",provider);
				if (status)
					LogEvent("info", "Entered Provider");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Provider");
				wait(20);
				status = SetText("//*[@placeholder='Contact Name']",Contact1);
				if (status)
					LogEvent("info", "Entered Contact1");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Contact1");
				wait(20);
				status = SetText("//*[@placeholder='Location']",Location1);
				if (status)
					LogEvent("info", "Entered Location1");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Location1");
				wait(20);
				status = SetText("//*[@placeholder='Email']",Email3);
				if (status)
					LogEvent("info", "Entered Email3");
				else
					LogEventWithScreeshot("fail", "Unable to Entered Email3");
				wait(200);
				status = SetText("//*[@placeholder='City']",City);
				if (status)
					LogEvent("info", "Entered City");
				else
					LogEventWithScreeshot("fail", "Unable to Entered City");
				wait(20);
				status = SetText("//*[@placeholder='State']",State);
				if (status)
					LogEvent("info", "Entered State");
				else
					LogEventWithScreeshot("fail", "Unable to Entered State");
				wait(20);
				status = SetText("//*[@placeholder='Zip']",ZIP1);
				if (status)
					LogEvent("info", "Entered ZIP1");
				else
					LogEventWithScreeshot("fail", "Unable to Entered ZIP1");
				wait(20);
				status = SetText("//*[@placeholder='NPI']",NPI1);
				if (status)
					LogEvent("info", "Entered NPI");
				else
					LogEventWithScreeshot("fail", "Unable to Entered NPI");
				wait(200);
				status = ClickElement("//*[text()='Add Provider']");
				if (status)
					LogEvent("info", "Click on  Provider");
				else
					LogEventWithScreeshot("fail", "Unable to Click on  Provider");
				wait(200);
				status = ClickElement("/html/body/app-root/ng-component/div/div/main/ng-component/div/div[2]/div[1]/div/div[1]/div[6]/div/button[1]/span");
				if (status)
					LogEvent("info", "view Organizations");
				else
					LogEventWithScreeshot("fail", "Unable to view Organizations");
				wait(200);
				status = ClickElement("//*[@id='collapse_0']/div/div[1]/div/div/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view practices");
				else
					LogEventWithScreeshot("fail", "Unable to view practices");
				wait(200);
				status = ClickElement("//*[@id='collapsePractices_0']/div/div/div/div[1]/div[4]/div/button[1]/span");
				if (status)
					LogEvent("info", "view providers");
				else
					LogEventWithScreeshot("fail", "Unable to view providers");
	
				*/
	
	


