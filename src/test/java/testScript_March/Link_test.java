package testScript_March;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestPage_March.Link_page;
import baseLibrary_March.BaseLibrary_March;

public class Link_test extends BaseLibrary_March
{ 
	Link_page ob;
	@BeforeTest
	public void getUrl_Testingbaba()
	{
		getUrl_testingbaba("https://www.testingbaba.com/old/");
		ob= new Link_page();
	}
	@Test(priority = 0, groups= {"Link_test"})
	public void ClickLinksbtn()
	{
		ob.ClickOnLink();
	}
	@Test(priority = 1, groups= {"Link_test"})
	public void ClickDemopagebtn() 
	{
		ob.ClickOndemopage();
	}
	@Test(priority = 2, groups= {"Link_test"})
	public void ClickAPIbtn()
	{
		ob.ClickOnApI();
	}
}
