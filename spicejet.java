
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class spicejet
{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		



				// TODO Auto-generated method stub

				
		System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver.exe") ;
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com");

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
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	
		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}

		

		
		 
	}

			



	}
