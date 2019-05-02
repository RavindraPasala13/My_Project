package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Module1 extends UserLibrary
{
	
	
	public static void TC01_Verify_MeasuresManager_Login() 
	{
		
		//Step 1 and Step 2 of the TC, login to application using valid userName & password
		Login(URL, UserName , Password);
	}
	
	public static void TC_04_ToLogin_as_a_System_admin_Click_contracts_CreateNewTemplate()
	{
		Boolean status;
		Login(URL, UserName , Password);
		status = ClickElement("//*[text()='Contracts']");
		if (status)
			LogEvent("info", "Clicked on Contracts");
		else
			LogEventWithScreeshot("fail", "Unable to Click on Contracts");
		status = ClickElement("//*[text()='Create Template ']");
		if (status)
			LogEvent("info", "Click on template");
		else
			LogEventWithScreeshot("fail", "Unable to click on Template");
		wait(200);
		status = SetText("//*[@placeholder='Full Template Name']",TemplateName);
		if (status)
			LogEvent("info", "Entered TemplateName");
		else
			LogEventWithScreeshot("fail", "Unable to Entered TemplateName");
		wait(200);
		status = SetText("//*[@placeholder='Abbreviation - Max of 6 characters']",Abbreviation);
		if (status)
			LogEvent("info", "Entered Abbreviation");
		else
			LogEventWithScreeshot("fail", "Unable to Entered Abbreviation");
		wait(200);
		status = ClickElement("//*[@placeholder='Must be unique']");
		if (status)
			LogEvent("info", "Clicked on Templateversion");
		else
			LogEventWithScreeshot("fail", "Unable to Click on Templateversion");
		wait(200);
		status = SetText("//*[@placeholder='Define this template']",DefinedTemplate);
		if (status)
			LogEvent("info", "template is defined");
		else
			LogEventWithScreeshot("fail", "Unable to defined template");
		driver.findElement(By.xpath("//*[@id='templateTab-type-panel']/div/div[2]/div/div/div[1]/div[1]/ng-select/div/span")).click();
		wait(200);
		driver.findElement(By.xpath("//*[@role='option']/span[text()='Medicare']")).click();
		wait(200);
		driver.findElement(By.xpath("//*[@id='templateTab-type-panel']/div/div[2]/div/div/div[1]/div[2]/ng-select/div/span")).click();
		wait(200);
		driver.findElement(By.xpath("//*[@role='option']/span[text()='Stars Format']")).click();
		wait(200);
		status = ClickElement("//*[@id='templateTab-type-panel']/div/button/span[1]/span");
		if (status)
			LogEvent("info", "Clicked on Next button");
		else
			LogEventWithScreeshot("fail", "Unable to Click on next button");
		wait(200);
		driver.findElement(By.xpath("//*[@id='templateTab-details-panel']/div/div[1]/div/div/div[1]/div[1]/input")).click();
		wait(200);
		Select month=new Select(driver.findElement(By.xpath("//*[@id='templateTab-details-panel']/div/div[1]/div/div/div[1]/div[1]/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[1]")));
		wait(200);
		month.selectByVisibleText("Mar");
		wait(200);
		Select year=new Select(driver.findElement(By.xpath("//*[@id='templateTab-details-panel']/div/div[1]/div/div/div[1]/div[1]/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[2]")));
		wait(200);
		year.selectByVisibleText("2018");
		wait(200);
		status = ClickElement("//*[@id='templateTab-details-panel']/div/div[1]/div/div/div[1]/div[1]/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[4]/div[3]/div");
		if (status)
			LogEvent("info", "Clicked on Template start date");
		else
			LogEventWithScreeshot("fail", "Unable to Click on Template start date");
		wait(200);
		driver.findElement(By.xpath("//*[@id='templateTab-details-panel']/div/div[1]/div/div/div[1]/div[2]/input")).click();
		wait(200);
		Select month1=new Select(driver.findElement(By.xpath("//*[@id='templateTab-details-panel']/div/div[1]/div/div/div[1]/div[2]/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[1]")));
		wait(200);
		month1.selectByVisibleText("Jul");
		wait(200);
		Select year1=new Select(driver.findElement(By.xpath("//*[@id='templateTab-details-panel']/div/div[1]/div/div/div[1]/div[2]/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[2]")));
		wait(200);
		year1.selectByVisibleText("2019");
		wait(200);
		status = ClickElement("//*[@id='templateTab-details-panel']/div/div[1]/div/div/div[1]/div[2]/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[3]/div[4]/div");
		if (status)
			LogEvent("info", "Clicked on Template End date");
		else
			LogEventWithScreeshot("fail", "Unable to Click on Template End date");
		wait(200);
		driver.findElement(By.xpath("//*[@id='templateTab-details-panel']/div/div[1]/div/div/div[2]/div[1]/ng-select/div/span")).click();
		wait(200);
		driver.findElement(By.xpath("//*[@role='option']/span[text()='Two-sided']")).click();
		wait(200);
		driver.findElement(By.xpath("//*[@id='templateTab-details-panel']/div/div[1]/div/div/div[2]/div[2]/ng-select/div/span")).click();
		wait(200);
		driver.findElement(By.xpath("//*[@role='option']/span[text()='Yes, attribution by health plan']")).click();
		wait(200);
		driver.findElement(By.xpath("//*[@id='templateTab-details-panel']/div/div[3]/div/div/div[2]/input")).click();
		wait(200);
        Select ect1=new Select(driver.findElement(By.xpath("//*[@id='templateTab-details-panel']/div/div[3]/div/div/div[2]/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[1]")));
    	wait(200);
		ect1.selectByVisibleText("May");
		wait(200);
		Select ect2=new Select(driver.findElement(By.xpath("//*[@id='templateTab-details-panel']/div/div[3]/div/div/div[2]/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[2]")));
		wait(200);
		ect2.selectByVisibleText("2018");
		wait(200);
		status = ClickElement("//*[@id='templateTab-details-panel']/div/div[3]/div/div/div[2]/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[3]/div[4]/div");
		if (status)
			LogEvent("info", "Selelcted Deadline");
		else
			LogEventWithScreeshot("fail", "Unable to Selelct Deadline");
		wait(200);
		status = SetText("//*[@placeholder='Define %']", Weight);
		if (status)
			LogEvent("info", "Entered weight");
		else
			LogEventWithScreeshot("fail", "Unable to enter weight");
		wait(200);
		status = ClickElement("//*[@id='templateTab-details-panel']/div/button/span[1]/span");
		if (status)
			LogEvent("info", "Clicked on Next button");
		else
			LogEventWithScreeshot("fail", "Unable to Click on Next button");
		wait(200);
		status = SetText("//*[@placeholder='What is the title of this submission group?']", submission);
		if (status)
			LogEvent("info", "Entered Submission title");
		else
			LogEventWithScreeshot("fail", "Unable to Entered Submission title");
		wait(200);
		driver.findElement(By.xpath("//*[@id='templateTab-measures-panel']/div/div/div/div[2]/div/div/div[1]/div[2]/input")).click();
		wait(200);
		Select s3=new Select(driver.findElement(By.xpath("//*[@id='templateTab-measures-panel']/div/div/div/div[2]/div/div/div[1]/div[2]/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[1]")));
		wait(200);
		s3.selectByVisibleText("May");
		wait(200);
		Select s4=new Select(driver.findElement(By.xpath("//*[@id='templateTab-measures-panel']/div/div/div/div[2]/div/div/div[1]/div[2]/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[2]")));
		wait(200);
		s4.selectByVisibleText("2018");
		wait(200);
		status = ClickElement("//*[@id='templateTab-measures-panel']/div/div/div/div[2]/div/div/div[1]/div[2]/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[4]/div[4]/div");
		wait(200);
		if (status)
			LogEvent("info", "Clicked on submission date");
		else
			LogEventWithScreeshot("fail", "Unable to Clicked on submission date");
		status = ClickElement("//*[text()=' Next Section ']");
		if (status)
			LogEvent("info", "Clicked on Next button");
		else
			LogEventWithScreeshot("fail", "Unable to Clicked on Next button");
		wait(200);
		status = ClickElement("//*[text()='Publish Template']");
		if (status)
			LogEvent("info", "Clicked on publish template");
		else
			LogEventWithScreeshot("fail", "Unable to Clicked on publish template");
		wait(200);
		status = ClickElement("/html/body/div[1]/div/div/div[3]/button");
		if (status)
			LogEvent("info", "Clicked on OK button");
		else
			LogEventWithScreeshot("fail", "Unable to Clicked on OK button");
		wait(2000);
	}
	
}

	


		
	 






















/* status = Dropdown("//*[@id='templateTab-type-panel']/div/div[2]/div/div/div[1]/div[1]/ng-select/div/div/div[1]","//*[@id='a5dd7d6e12d7']/div/div[2]",Payer);
		if (status)
			LogEvent("info", "Payer is selected");
		else
			LogEventWithScreeshot("fail", "Unable to select payer");
		wait(200);*/
	/*	status = Dropdown("//*[@id='templateTab-type-panel']/div/div[2]/div/div/div[1]/div[2]/ng-select","//*[@id='a15a332116c3']/div/div[2]",Format);
		if (status)
			LogEvent("info", "Format is selected");
		else
			LogEventWithScreeshot("fail", "Unable to select Format");
		wait(2000);
		status = ClickElement("//*[text()=' Next Section ']");
		if (status)
			LogEvent("info", "Click on Next");
		else
			LogEventWithScreeshot("fail", "Unable to click on Next");
		*/
	

		
		