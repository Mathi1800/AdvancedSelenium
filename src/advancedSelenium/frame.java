package advancedSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");

		driver.switchTo().frame(0);

		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		String value = button1.getText();

		System.out.println(value);

		driver.switchTo().defaultContent();

		driver.switchTo().frame(0);
		driver.switchTo().frame(2);

		WebElement button2 = driver.findElement(By.xpath("//*[@id=\"Click\"]"));
		button1.click();

		/// count the frame

		driver.switchTo().defaultContent();

		List<WebElement> totalFrame = driver.findElements(By.tagName("iframe"));

		int size = totalFrame.size();

		System.out.println(size);

	}

}
