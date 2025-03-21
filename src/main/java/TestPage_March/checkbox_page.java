package TestPage_March;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary_March.BaseLibrary_March;

public class checkbox_page extends BaseLibrary_March
{

	public checkbox_page()
	{
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='check box']")
    private WebElement checkboxbtn;
    
    @FindBy(xpath = "//*[@onclick=\"myFunction()\"]")
    private WebElement Mobilebtn;
    
    @FindBy(xpath = "//*[@id=\"text\"]")
    private WebElement MobileText;
    @FindBy(xpath = "//*[@id=\"mylaptop\"]")
    private WebElement Laptopbtn;
    
    @FindBy(xpath = "//*[@id=\"text1\"]")
    private WebElement LaptopText;
    
    @FindBy(xpath = "//*[@id=\"mydesktop\"]")
    private WebElement Desktopbtn;
    
    @FindBy(xpath = "//*[@id=\"text2\"]")
    private WebElement DesktopText;
    
    public void ClickOnCheckbox()
    {
    	checkboxbtn.click();
    	elemenToBeClickable(checkboxbtn, 2);
    }
    public void ClickOnGagets()
    {
    	WebElement frameloc=driver.findElement(By.xpath("//*[@src=\"Checkbox.html\"]"));
    	driver.switchTo().frame(frameloc);
    	Mobilebtn.click();
        System.out.println(MobileText.getText());
    	
        Laptopbtn.click();
        System.out.println(LaptopText.getText()); 
          
        Desktopbtn.click();
        System.out.println(DesktopText.getText());
      }      
   }
