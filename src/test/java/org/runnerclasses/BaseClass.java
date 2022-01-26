package org.runnerclasses;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void url(String url) {
		driver.get(url);

	}

	public static void maxBrowwser() {
		driver.manage().window().maximize();

	}

	public static void pageUrl() {
		String c = driver.getCurrentUrl();
		System.out.println(c);

	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void exit() {
		driver.quit();
	}

	public static void alertAccept() {
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	}

	public static void alertDismiss() {
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();

	}

	public static void alertSendKeys(String text) {
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys(text);

	}

	public static void sendKeys(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void btnClick(WebElement element) {
		element.click();

	}

	public static String getText(WebElement element) {
		return element.getText();

	}

	public static String getAttribute(WebElement element) {
		return element.getAttribute("value");
		

	}

	public static void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void dragAndDrop(WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();

	}

	public static void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();

	}

	public static void rightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();

	}

	public static void keyUpAndDown(WebElement element, String text) {
		Actions a = new Actions(driver);
		a.keyDown(element, Keys.SHIFT).sendKeys(element, text).keyUp(element, Keys.SHIFT).build().perform();

	}

	public static void robot() throws AWTException {
		Robot r = new Robot();

	}

	public static void upAndDown(int n) throws AWTException {
		Robot r = new Robot();
		for (int i = 1; i < n; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

	}

	public static void screenShot(String path) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);

	}

	public static void scrollDown(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void scrollUp(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void javaScriptSend(WebElement element, String script) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript(script, element);
	}

	public static void javaScriptClick(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].click()", element);

	}

	public static void javaScriptGet(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		Object o = j.executeScript("return arguments[0].getAttribute('value')", element);
		String s = (String) o;
		System.out.println(s);

	}

	public static void frame(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();

	}

	public static void windowHandle(int n) {
		Set<String> allWindow = driver.getWindowHandles();
		List<String> l = new LinkedList<String>();
		l.addAll(allWindow);
		driver.switchTo().window(l.get(n));
	}

	public static void multiple(WebElement element) {
		Select s = new Select(element);
		boolean m = s.isMultiple();
		if (m == true) {
			System.out.println("multiple values can be selected");

		} else {
			System.out.println("single value can be selected");

		}

	}

	public static void sindex(WebElement element, int i) {
		Select s = new Select(element);
		s.selectByIndex(i);

	}

	public static void svalue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void svisible(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

	public static void firstSelectedText(WebElement element) {
		Select s = new Select(element);
		WebElement f = s.getFirstSelectedOption();
		System.out.println(f.getText());
	}

	public static void firstSelectedValue(WebElement element) {
		Select s = new Select(element);
		WebElement f = s.getFirstSelectedOption();
		System.out.println(f.getAttribute("value"));

	}

	public static void allSelectedText(WebElement element) {
		Select s = new Select(element);
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement a : all) {
			System.out.println(a.getText());
		}

	}

	public static void dsindex(WebElement element, int i) {
		Select s = new Select(element);
		s.deselectByIndex(i);

	}

	public static void dsvalue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);

	}

	public static void dsvisible(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);

	}

	public static void dsall(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();

	}

	
	public static void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	public static void endTime() {
		Date d = new Date();
		System.out.println(d);

	}
	public static void iwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}
