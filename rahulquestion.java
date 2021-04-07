import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulquestion

	{

	public static void main(String[] args) throws InterruptedException

	{

	System.setProperty("webdriver.chrome.driver","E:\\\\selenium webdriver\\\\chromedriver.exe");

	    WebDriver driver=new ChromeDriver();    

	    driver.get("http://www.spicejet.com/");

	    System.out.println(driver.getTitle());

	    // OriginStation

	    driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();        

	        driver.findElement(By.cssSelector("a[value='DEL']")).click();

	        System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));

	        // Destination

	        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();     

	        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();   

	        System.out.println( driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("value"));

	  //    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

	}

	}
