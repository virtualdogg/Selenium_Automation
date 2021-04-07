import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver.exe") ;
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.cleartrip.com/");
	
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		Select total = new Select(driver.findElement(By.id("Adults")));
		total.selectByValue("5");
		Select tota = new Select(driver.findElement(By.id("Childrens")));
		tota.selectByValue("4");
		Select tot = new Select(driver.findElement(By.id("Infants")));
		tot.selectByValue("3");
		
		driver.findElement(By.xpath("//i[@class='rArrow blue']")).click();

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("AIRLINEANSHUL");
		driver.findElement(By.id("SearchBtn")).click();
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());



	
	}

}
