package testRunner;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.CalculatorScreen;
import setup.Setup;

public class calcTestRunner extends Setup
{

    @Test
    public void _01doSum()
    {
        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        String additionResult = calculatorScreen.doSum();
        System.out.println("Sum is : " + additionResult);
        String resultExpected = "12";

        Assert.assertEquals(additionResult,resultExpected);
    }

    @Test
    public void _02doSubtraction()
    {
        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        String subtractionResult = calculatorScreen.doSub();
        System.out.println("Sub is : " + subtractionResult);
        String resultExpected = "6";

        Assert.assertEquals(subtractionResult,resultExpected);
    }

    @Test
    public void _03doMultiplication()
    {
        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        String multiplicationResult = calculatorScreen.doMulti();
        System.out.println("Multiply is : " + multiplicationResult);
        String resultExpected = "16";

        Assert.assertEquals(multiplicationResult,resultExpected);
    }


    @Test
    public void _04doVaag()
    {
        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        String divisionResult = calculatorScreen.doDivn();
        System.out.println("Division is : " + divisionResult);
        String resultExpected = "3";

        Assert.assertEquals(divisionResult,resultExpected);
    }
}
