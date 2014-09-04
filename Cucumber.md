# Cucumber

## Archivo feature

```feature
Feture: Calculator

  Scenario: dos más dos es 4
    Given I have a calculator
    When I add 2 and 2
    Then I get 4

  Scenario: dos más tres es 5
    Given I have a calculator
    When I add 2 and 3
    Then I get 5

```

## Código del test

```java
public class CalculatorSteps {

	@Given("^Una calculadora")
	public void i_have_a_calculator() throws Throwable {
	    this.calculator = new Calculator();	    
	}

	@When("^Adiciono (\\d+) y (\\d+)$")
	public void i_add_and(int number1, int number2) throws Throwable {
		this.result = this.calculator.add(number1, number2);
	}

	@Then("^Obtengo (\\d+)$")
	public void i_get(int resultNumber) throws Throwable {
		if (this.result != resultNumber)
			throw new Exception();
	}

	private Calculator calculator;
	private int result;

}
```