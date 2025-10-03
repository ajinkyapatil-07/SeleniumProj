package WindowsPopup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

public class WindowHandle_popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium2025\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");			
	    driver.manage().window().maximize();		
	    driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
	    Thread.sleep(4000);
	    
	    Set<String> handler=driver.getWindowHandles();// using getwindowhandles();
	    Iterator<String> it= handler.iterator();     // using Iterator
	    String Parentwindow =it.next();              //using next()method capturing the paranedwindowID
	    System.out.println("paranedwindowID" + Parentwindow);            
	    Thread.sleep(4000);
	    String ChildWindow=it.next();
	    System.out.println("ChilddwindowID" +ChildWindow);
	    Thread.sleep(4000);
	    
	    driver.switchTo().window(ChildWindow);              // switch to Childwindow
	    System.out.println(driver.getTitle());
	    driver.close();
	    
	    Thread.sleep(4000);
	    driver.switchTo().window(Parentwindow);            // switch to parentwindow
	    System.out.println(driver.getTitle());
	    driver.close();

	}

}
