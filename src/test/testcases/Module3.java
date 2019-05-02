package test.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Module3 extends UserLibrary {
	
	public static void TC_05_CreateNewTemplate()
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
		wait(200);
		status=Dropdownselection("//*[@id='templateTab-type-panel']/div/div[2]/div/div/div[1]/div[1]/ng-select/div/span","//*[@role='option']",Payer);
		wait(200);
		if (status)
			LogEvent("info", "payer is defined");
		else
			LogEventWithScreeshot("fail", "Unable to defined Payer");
		
		
		
		
		
		
		/*driver.findElement(By.xpath("//*[@id='templateTab-type-panel']/div/div[2]/div/div/div[1]/div[1]/ng-select/div/span")).click();
		List<WebElement> values=driver.findElements(By.xpath("//*[@role='option']"));
		int a=values.size();
		System.out.println(a);
        for(WebElement hi:values)
        {
        	System.out.println(hi.getText());
        }
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
}
}