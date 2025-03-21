package testScript_March;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestPage_March.checkbox_page;
import baseLibrary_March.BaseLibrary_March;

public class checkbox_test extends BaseLibrary_March
{
	checkbox_page ob;
   @BeforeTest
   public void getUrl_Testingbaba()
   {
	   getUrl_testingbaba("https://www.testingbaba.com/old/");
	   ob= new checkbox_page();
   }
   @Test(priority = 0 , groups= {"checkbox_test"})
   public void ClickOnCheckboxbtn()
	{
		ob.ClickOnCheckbox();
	}
	
	@Test(priority = 1, groups= {"checkbox_test"})
	public void ClickOnGagetsbtn()
	{
		ob.ClickOnGagets();
	}
}
