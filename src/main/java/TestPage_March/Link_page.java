package TestPage_March;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary_March.BaseLibrary_March;

public class Link_page extends BaseLibrary_March
{
	
    public Link_page()
    {
		
    	PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[text()='links']")
    private WebElement linkbtn;
    
    @FindBy(xpath = "//*[text()='Demo Page']")
    private WebElement demopagebtn;
    
    @FindBy(xpath ="//*[text()='Created']" )
    private WebElement createdbtn;
    
    @FindBy(xpath = "//*[text()='No Content']")
    private WebElement nocontentbtn;
    
    @FindBy(xpath = "//*[text()='Moved']")
    private WebElement movedbtn;
    
    @FindBy(xpath = "//*[text()='Unauthorized']")
    private WebElement badrequestbtn;
    
    @FindBy(xpath = "//*[text()='Unauthorized']")
    private WebElement unauthorizedbtn;
    
    @FindBy(xpath = "//*[text()='Forbidden']")
    private WebElement forbiddenbtn;
    
    @FindBy(xpath = "//*[text()='Not Found']")
    private WebElement notfoundbtn;
    
   
   
  
   public void ClickOnLink()
   {
   	linkbtn.click();
   	elemenToBeClickable(linkbtn, 2);
   	
   }
   public void ClickOndemopage() 
   {
   	demopagebtn.click();
   	
   	
   	ChangeWindow(1);
    	driver.close();
       ChangeWindow(0);
	
   	
   	
   }
   public void ClickOnApI() 
   {  
   	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   	ChangeWindow(0);
   	
   	createdbtn.click();
   	nocontentbtn.click();
   	movedbtn.click();
   	badrequestbtn.click();
   	unauthorizedbtn.click();
   	forbiddenbtn.click();
   	notfoundbtn.click();
   	
   }
}
