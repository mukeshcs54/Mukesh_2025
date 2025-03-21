package TestPage_March;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary_March.BaseLibrary_March;

public class Textbox_page extends BaseLibrary_March
{
	
     public Textbox_page()
     {
    	
    	 PageFactory.initElements(driver, this);
     }
     
     @FindBy(xpath = "//*[text()='text box']")
     private WebElement textboxbtn;
     
     @FindBy(xpath = "//*[@id=\"fullname1\"]")
     private WebElement fullnamebtn;
     @FindBy(xpath = "//*[@id=\"fullemail1\"]")
     private WebElement emailbtn;
     @FindBy(xpath = "//*[@id=\"fulladdresh1\"]")
     private WebElement c_addressbtn;
     @FindBy(xpath = "//*[@id=\"paddresh1\"]")
     private WebElement p_addressbtn;
     @FindBy(xpath = "//*[@value=\"Submit\"]")
     private WebElement submitbtn;
     
     public void ClickOnTextbox()
     {
    	 textboxbtn.click();
    	 elemenToBeClickable(textboxbtn, 2);
     }
     public void fillDetails()
     {
    	 fullnamebtn.sendKeys("Mukesh Kumar");
    	 emailbtn.sendKeys("mukeshcs54@gmail.com");
    	 c_addressbtn.sendKeys("Block H 169 Sector 63 Noida ");
    	 p_addressbtn.sendKeys("Block c 145 Sector 22 Noida");
    	 submitbtn.click();
    	 
    	
    	 
     }
     public void getdetails()
     {
    	List<WebElement>list= driver.findElements(By.xpath("//*[@class=\"col-md-6 mt-5\"]/label"));
    	
    	for(int i=1;i<=list.size()-1;i=i=i+2)
    	{
    		  String expected=list.get(i).getText();
    		  System.out.println(expected);
    	}
     }
     
}
