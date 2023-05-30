package advancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) {

		String baseUrl = ("https://the-internet.herokuapp.com/broken_images");
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);

		WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[1]"));

		// Natural width

		if (brokenImage.getAttribute("naturalWidth").equals("0")) {

			System.out.println("Link is broken");

		} else {
			System.out.println("Link is not broken");
		}
	}

}
