package baseLibrary_March;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import applicationUtility_March.ApplicationUtility_March;
import io.github.bonigarcia.wdm.WebDriverManager;
import waitUtility_March.WaitUtility.Wait_Utlity;

public class BaseLibrary_March implements ApplicationUtility_March,Wait_Utlity
{
	  public static WebDriver driver;
	 
	  String closedbtn="//*[text()='×']";
	  String Practicebtn="//*[text()='Practice']";
	  String elementbtn="//*[@data-target=\"#elements\"]";
	 
      public void getUrl_testingbaba(String url)
      {
    	  WebDriverManager.chromedriver().setup();
    	  driver=new ChromeDriver();
    	  driver.get("https://www.testingbaba.com/old/");
    	  driver.manage().window().maximize();
    	  driver.findElement(By.xpath(closedbtn)).click();
    	  driver.findElement(By.xpath(Practicebtn)).click();
    	  driver.findElement(By.xpath(elementbtn)).click();
      }
	
      @AfterTest
     public void teardown()
     {
    	 driver.close();
     }
	@Override
	public void ChangeWindow(int indexno)
	{
         Set<String>tab=driver.getWindowHandles();
         ArrayList<String>tabno=new ArrayList<String>(tab);
         driver.switchTo().window(tabno.get(indexno));
     
		
	}
	@Override
	public void DoubleClick(WebElement ele) 
	{
		Actions act= new Actions(driver);
		act.doubleClick(ele).perform();
		
	}
	@Override
	public void RightClick(WebElement ele) 
	{
		Actions act= new Actions(driver);
		act.contextClick(ele).perform();
		
	}

	@Override
	public void visibilityOfElement(WebElement ele, int time) 
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}

	@Override
	public void elemenToBeClickable(WebElement ele, int time)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}

	@Override
	public void alertisPresent(int time) 
	{
		WebDriverWait wait= new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
}
