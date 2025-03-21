package testScript_March;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestPage_March.webtable_page;
import baseLibrary_March.BaseLibrary_March;

public class Webtable_Test extends BaseLibrary_March
{
	webtable_page ob;
	@BeforeTest
	public void getUrl_Testingbaba()
	{
		getUrl_testingbaba("https://www.testingbaba.com/old/");
		ob= new webtable_page();
	}
	@Test(priority = 0, groups= {"Webtable_Test"})
	public void ClickOnwebtable()
    {
   	  ob.ClickOnwebtable();
    }
	@Test(priority = 1, groups= {"Webtable_Test"})
    public void ClickOnDetails() 
    {
   	 ob.ClickOnDetails();
    }
	@Test(priority = 2, groups= {"Webtable_Test"})
    public void getupdated_UIdata()
    {
   	 ob.getupdated_UIdata();
    }
}
