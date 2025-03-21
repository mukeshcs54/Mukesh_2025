package waitUtility_March;

import org.openqa.selenium.WebElement;

public interface WaitUtility
{
	public interface Wait_Utlity
	{
	   public void visibilityOfElement(WebElement ele, int time);
	   public void elemenToBeClickable(WebElement ele, int time);
	   public void alertisPresent(int time);
	   
	}

}
