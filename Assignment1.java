import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver.exe") ;
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//1
		
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		driver.findElement(By.cssSelector("input[value='option1']")).click();

		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());

//2

	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
