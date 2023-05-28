package advancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {

		String baseUrl = "https://demo.guru99.com/test/social-icon.html";

		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);

		WebElement value = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[1]"));
		String result = value.getAttribute("title");
		System.out.println(result);
		String ActualResult = "Mail";

		if (result.equals(ActualResult)) {

			System.out.println("Testcase Passed");
		} else {
			System.out.println("testcase Failed");
		}
	}

}
