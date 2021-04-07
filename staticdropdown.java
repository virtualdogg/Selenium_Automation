import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;





public class staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver.exe") ;
WebDriver driver= new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

// 'Select' keyword is present in the html elements

/*WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
Select dropdown=new Select(staticDropdown); 
dropdown.selectByIndex(3);
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByVisibleText("Select");

System.out.println(dropdown.getFirstSelectedOption().getText());


//Looping dropdown



driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000L);

for(int i=1;i<=5;i++)
{


driver.findElement(By.id("hrefIncAdt")).click();
	
}

System.out.print(driver.findElement(By.id("divpaxinfo")).getText());
*/
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
driver.findElement(By.xpath("//a[@value='IXB']")).click();
Thread.sleep(2000);
driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

//Autosuggestive Dropdown

driver.findElement(By.id("autosuggest")).sendKeys("ind");
Thread.sleep(3000);
//In CSS we give space instead of / which we do in xpath to traverse from parent to child and format of CSS is "tagname[attribute='value']"
List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
for(WebElement option:options)
{
	if (option.getText().equalsIgnoreCase("india"))
	{
		option.click();
		break;
	}
}
	
	}


	}


