package TestPage_March;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary_March.BaseLibrary_March;

public class Button_page extends BaseLibrary_March
{
	
   public Button_page()
   {
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath = "//a[text()='buttons']")
   private WebElement  Buttonsbtn;
   
   @FindBy(xpath = "//*[@ondblclick=\"doubletext()\"]")
   private WebElement doubleclickbtn;
   @FindBy(xpath = "//*[@id=\"double-content\"]")
   private WebElement doubleclickText;
   
   @FindBy(xpath = "//*[@oncontextmenu=\"righttext()\"]")
   private WebElement rightclickbtn;
   @FindBy(xpath = "//*[@id=\"right-content\"]")
   private WebElement rightText;
   
   @FindBy(xpath = "//*[@onclick=\"clicktext()\"]")
   private WebElement Clickbtn;
   
   @FindBy(xpath = "//*[@id=\"click-content\"]")
   private WebElement ClickText;
   
   public void ClickOnButtons()
   {
  	 Buttonsbtn.click();
   }
   
   public void ClickOnActionButton()
   {
      DoubleClick(doubleclickbtn);
     
      System.out.println(doubleclickText.getText());
     
      RightClick(rightclickbtn);
      System.out.println(rightText.getText());
      
      Clickbtn.click();
      System.out.println(ClickText.getText());
   }
}
