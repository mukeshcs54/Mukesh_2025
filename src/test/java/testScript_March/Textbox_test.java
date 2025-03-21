package testScript_March;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import TestPage_March.Textbox_page;
import baseLibrary_March.BaseLibrary_March;

public class Textbox_test extends BaseLibrary_March
{
	Textbox_page ob;
	@BeforeTest
	public void getUrl_Testingbaba()
	{
		getUrl_testingbaba("https://www.testingbaba.com/old/");
		
		ob= new Textbox_page();
	}
	@Test(priority = 0, groups= {"Textbox_test"})
	public void ClickOnTextboxbtn()
	{
		ob.ClickOnTextbox();
	}
	@Test(priority = 1, groups= {"Textbox_test"})
	public void getfillDetails()
	{
		ob.fillDetails();
	}
	@Test(priority = 2, groups= {"Textbox_test"})
	public void getDetails()
	{
		ob.getdetails();
	}
	
}
