package advancedSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {

		String baseUrl = "https://www.amazon.in/";
		System.setProperty("webdriver.driver.chromedriver", "D:\\\\Selenium_training\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);

		WebElement input = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		input.sendKeys("iphone");

		Thread.sleep(4500);
		List<WebElement> optionList = driver.findElements(By.xpath("//*[@id=\\\"twotabsearchtextbox\\\"]/li"));

		for (WebElement webElement : optionList) {
			if (webElement.getText().equals("iphone 13")) {
				webElement.click();
				break;
			}
		}

	}

}
