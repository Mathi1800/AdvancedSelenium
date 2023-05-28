package advancedSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01xmbpudsk1phvw7vnmem48cjj272439.node0");
		;

		// open windows

		String oldWindow = driver.getWindowHandle();
//
		System.out.println(oldWindow);
		WebElement firstButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
		firstButton.click();

		Set<String> handles = driver.getWindowHandles();

		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);

		}
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mathimathi800@gmail.com");
		driver.close();
		driver.switchTo().window(oldWindow);
		// multiple windows

		WebElement openMultiple = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
		openMultiple.click();

		int noOfWindows = driver.getWindowHandles().size();
		System.out.println(noOfWindows);

		// close the child windows

		WebElement dontCloseMe = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		dontCloseMe.click();

		Set<String> newWindowsHandle = driver.getWindowHandles();

		for (String allWindows : newWindowsHandle) {

			if (!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
		}

	}

}
