package ejemplo;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

/**
 * Generado usando la opción
 * JUnit 4 / WebDriver Backed
 **/
public class SumaEnGoogleWebDriverBacked {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com.ar/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testTestDosMasDosGoogle() throws Exception {
		selenium.open("/");
		selenium.type("id=gbqfq", "4+4");

		// verifyEquals("2+2", selenium.getValue("id=gbqfq"));

        assertEquals("4+4", selenium.getValue("id=gbqfq"));
		selenium.typeKeys("id=gbqfq", "\n");

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if ("4 + 4 =".equals(selenium.getText("id=cwles"))) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if ("8".equals(selenium.getText("id=cwos"))) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
