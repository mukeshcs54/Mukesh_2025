package TestPage_March;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary_March.BaseLibrary_March;

public class Radiobutton_page extends BaseLibrary_March
{
	
   public Radiobutton_page()
   {
	  
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath = "//a[text()='radio buttons']")
   private WebElement radiobutton;
   
   @FindBy(xpath = "//*[@id=\"yes\"]")
   private WebElement yesbtn;
   
   @FindBy(xpath = "//*[@id=\"radio-content\"]")
   private WebElement yesText;
   
   @FindBy(xpath = "//*[@id=\"impressive\"]")
   private WebElement impressivebtn;
   
   @FindBy(xpath = "//*[@id=\"radio-content\"]")
   private WebElement impressiveText;
   
   @FindBy(xpath = "//*[@id=\"no\"]")
   private WebElement nobtn;
   
   @FindBy(xpath = "//*[@id=\"radio-content\"]")
   private WebElement noText;
   
   public void ClickOnRadioButton()
   {
   	
   	radiobutton.click();
   	elemenToBeClickable(radiobutton, 2);
   	
   }
   public void Clickonbutton()
   {
   	yesbtn.click();
   	System.out.println(yesText.getText());
   	impressivebtn.click();
   	
   	System.out.println(impressiveText.getText());
   	nobtn.click();
	System.out.println(noText.getText());
   	
   }
}
