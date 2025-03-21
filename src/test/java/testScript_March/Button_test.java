package testScript_March;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestPage_March.Button_page;
import baseLibrary_March.BaseLibrary_March;

public class Button_test extends BaseLibrary_March
{
	Button_page ob;
	@BeforeTest
	public void getUrl_Testingbaba()
	{
		getUrl_testingbaba("https://www.testingbaba.com/old/");
		ob= new Button_page();
	}
	@Test(priority = 0 ,groups = {"Button_test"})
	public void ClickOnButtonbtn()
	{
		ob.ClickOnButtons();
	}
	@Test(priority = 1,groups = {"Button_test"})
	public void ClickOnActionButtonbtn()
	{
		ob.ClickOnActionButton();
	}
    
}
