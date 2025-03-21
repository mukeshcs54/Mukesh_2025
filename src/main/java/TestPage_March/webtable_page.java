package TestPage_March;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseLibrary_March.BaseLibrary_March;

public class webtable_page extends BaseLibrary_March
{
	
   public webtable_page()
   {
	   
	   PageFactory.initElements(driver, this);
	   
   }
    @FindBy(xpath = "//a[text()='web tables']")
	 private WebElement webtablebtn;
	 
	 @FindBy(xpath = "//*[@src=\"Webtable.html\"]")
	 private WebElement frameloc;
	 
	 
	 @FindBy(xpath = "//*[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
	 private WebElement namebtn;
	 
	 @FindBy(xpath = "//*[@pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\"]")
	 private WebElement emailbtn;
	 
	 @FindBy(xpath = "//*[text()='Save']")
	 private WebElement savebtn;
	 
	 @FindBy(xpath = "//*[text()='Edit']")
	 private WebElement editbtn;
	 
	 @FindBy(xpath = "//*[@name=\"edit_name\"]")
	 private WebElement editnamebtn;
	 
	 @FindBy(xpath = "//*[@name=\"edit_email\"]")
	 private WebElement editemailbtn;
	 
	 @FindBy(xpath = "//*[text()='Update']")
	 private WebElement updatebtn;
	 
	 public void ClickOnwebtable()
     {
    	 webtablebtn.click();
    	elemenToBeClickable(webtablebtn, 1);
     }
     public void ClickOnDetails() 
     {
    	 driver.switchTo().frame(frameloc);
    	 
    	 namebtn.sendKeys("Mukesh kumar");
    	 emailbtn.sendKeys("mukeshcs54@gmail.com");
    	 savebtn.click();
    	
     }
     
     public void getupdated_UIdata()
     {
    	 editbtn.click();
    	 
    	 WebElement col1=driver.findElement(By.xpath("//*[@name=\"edit_name\"]"));
    	 col1.clear();
    	 col1.sendKeys("ABC");
    	 
    	 
    	 WebElement col2=driver.findElement(By.xpath("//*[@name=\"edit_email\"]"));
    	 
    	 col2.clear();
    	 col2.sendKeys("ABC@gmail.com");
    	 
    	 updatebtn.click();
    	 
    	 String col1Text =driver.findElement(By.xpath("//*[@data-name=\"ABC\"]/td[1]")).getText();
    	 System.out.println(col1Text);
    	 String col2Text= driver.findElement(By.xpath("//*[@data-name=\"ABC\"]/td[2]")).getText();
    	 System.out.println(col2Text);
     }
     
     
     
}
