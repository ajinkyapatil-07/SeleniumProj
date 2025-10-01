package WindowsPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMsg {

	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium2025\\src\\test\\resources\\drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("https://demo.guru99.com/test/delete_customer.php");			
		
    	
     driver.findElement(By.name("cusid")).sendKeys("53920");					
     driver.findElement(By.name("submit")).submit();	
     Alert alert=driver.switchTo().alert();        // Switching to Alert
     
     String alertms= driver.switchTo().alert().getText();     // Capturing alert message.
     
     System.out.println(alertms);   // Displaying alert message
     
     alert.accept();   // Accepting alert
    /* 
     * Types of alert-
         Simple Alert
         Prompt Alert
         Confirmation Alert
     
      
        The following methods are useful to handle alerts in Selenium:

    	 1. Void dismiss(): This method is used when the ‘Cancel’ button is clicked in the alert box.
    	 driver.switchTo().alert().dismiss();

    	 2. Void accept(): This method is used to click on the ‘OK’ button of the alert.

    	 driver.switchTo().alert().accept();

    	 3. String getText(): This method is used to capture the alert message.

    	 driver.switchTo().alert().getText();

    	 4. Void sendKeys(String stringToSend): This method is used to send data to the alert box.

    	 driver.switchTo().alert().sendKeys("Text"); */
}
}