package advancedSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {

		String baseUrl = "https://www.leafground.com/file.xhtml";
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		WebElement upload = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]"));

		upload.click();

		StringSelection selection = new StringSelection("C:\\Users\\mathi\\Downloads\\TestLeaf Logo.png");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
