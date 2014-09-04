# Generación automática desde la IDE

## Usando el acceso remoto

```java
public class SumaEnGoogleRemoteControl2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com.ar/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test22EnGoogle() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("gbqfq")).clear();
    driver.findElement(By.id("gbqfq")).sendKeys("2+2");
    Thread.sleep(1000);
    driver.findElement(By.id("gbqfq")).sendKeys("\n");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("4".equals(driver.findElement(By.id("cwos")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
```

## Usando WebDriver

```java
public class SumaEnGoogleWebDriver {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com.ar/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDosMasDosGoogle() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("gbqfq")).clear();
    driver.findElement(By.id("gbqfq")).sendKeys("2+2");
    //  selenium.typeKeys("id=gbqfq", "\n");

    //  driver.findElement(By.id("gbqfq")).sendKeys("2+2");
    try {
      assertEquals("2+2", driver.findElement(By.id("gbqfq")).getAttribute("value"));
      driver.findElement(By.id("gbqfq")).submit();
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("gbqfq")).sendKeys("");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("2 + 2 =".equals(driver.findElement(By.id("cwles")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if ("4".equals(driver.findElement(By.id("cwos")).getText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
```



## Usando el Wrapper de Selenium 

```java
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
```