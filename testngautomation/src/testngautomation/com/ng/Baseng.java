package testngautomation.com.ng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Baseng   extends Main {

	WebDriver driver;
	
	@BeforeSuite 
	public void setup() {
		
		
	}
	@BeforeMethod
	public void B4class() {
		
		
		
 }
	
	@BeforeClass
	  public void login() {
		
	 }
	 
	
	@Test
	public void tc1() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Test1\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://3.17.16.254:8080/wp-login.php?redirect_to=http%3A%2F%2F3.17.16.254%3A8080%2Fwp-admin%2Foptions-general.php&reauth=1\r\n");
		driver.manage().window().maximize();
		
		System.out.println("Test worked"); //To print anything
		
		WebElement uname=driver.findElement(By.xpath("//input[@type='text']"));
        uname.sendKeys("user");
        Thread.sleep(3000);
        
        int sum = numSum(10,15); 
        System.out.println("Sum is :"+sum);
        
	}
	
	
    @AfterMethod
	public void logout() {
	driver.quit();	
	}
    
    @AfterSuite
    public void close() {
    }
    
}

    
