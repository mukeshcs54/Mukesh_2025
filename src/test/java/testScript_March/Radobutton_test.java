package testScript_March;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestPage_March.Radiobutton_page;
import baseLibrary_March.BaseLibrary_March;

public class Radobutton_test extends BaseLibrary_March
{
	 Radiobutton_page ob;
	@BeforeTest
	public void getUrl_Testingbaba()
	{
		getUrl_testingbaba("https://www.testingbaba.com/old/");
		ob= new Radiobutton_page();
	}
	
	@Test(priority = 0, groups= {"Radobutton_test"})
 	public void ClickonRadiobuttonbtn()
 	{
 		
 		ob.ClickOnRadioButton();
 	}
 	@Test(priority = 1, groups= {"Radobutton_test"})
 	public void ClickOnButtobbtn()
 	{
 		ob.Clickonbutton();
 	}
}
