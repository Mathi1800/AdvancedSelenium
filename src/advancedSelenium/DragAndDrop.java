package advancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");

		WebElement from = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]/p"));

		WebElement to = driver.findElement(By.xpath("//*[@id=\"form:drop_header\"]"));

		Actions action = new Actions(driver);

		// action.clickAndHold(from).moveToElement(to).release(to).build().perform();

		action.dragAndDrop(from, to).build().perform();

	}

}
