import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium webdriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions a =new Actions(driver);
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		List<WebElement> as =driver.findElements(By.cssSelector(".ui-menu-item .ui-menu-item-wrapper"));
		for(int j=0;j<as.size();j++)
		{
			if(as[1].getText() equals )
		}
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		List<WebElement> tr= driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));

		List<WebElement> th= tr.get(1).findElements(By.tagName("td"));
		System.out.println("Rows"+tr.size());
		System.out.println("Columns"+th.size());
		//System.out.println(th.get(1).getText());
		
for(int i=0;i<th.size();i++)
{
		System.out.println(th.get(i).getText());

}
	

	}

}
