package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorScreen
{
    @FindBy(id = "com.google.android.calculator:id/digit_0")
    AndroidElement button0;
    @FindBy(id = "com.google.android.calculator:id/digit_1")
    AndroidElement button1;
    @FindBy(id = "com.google.android.calculator:id/digit_2")
    AndroidElement button2;
    @FindBy(id = "com.google.android.calculator:id/digit_3")
    AndroidElement button3;
    @FindBy(id = "com.google.android.calculator:id/digit_4")
    AndroidElement button4;
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    AndroidElement button5;
    @FindBy(id = "com.google.android.calculator:id/digit_6")
    AndroidElement button6;
    @FindBy(id = "com.google.android.calculator:id/digit_7")
    AndroidElement button7;
    @FindBy(id = "com.google.android.calculator:id/digit_8")
    AndroidElement button8;
    @FindBy(id = "com.google.android.calculator:id/digit_9")
    AndroidElement button9;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    AndroidElement buttonPlus;
    @FindBy(id = "com.google.android.calculator:id/op_sub")
    AndroidElement buttonMinus;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    AndroidElement buttonMultiplication;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    AndroidElement buttonDivision;

    @FindBy(id = "com.google.android.calculator:id/eq")
    AndroidElement buttonEquals;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    AndroidElement buttonResult;

    @FindBy(id = "com.google.android.calculator:id/clr")
    AndroidElement buttonClear;


    public CalculatorScreen(AndroidDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String doSum()
    {
        button7.click();
        buttonPlus.click();
        button5.click();
        buttonEquals.click();
        return buttonResult.getText();
    }

    public String doSub()
    {
        buttonClear.click();
        button9.click();
        buttonMinus.click();
        button3.click();
        buttonEquals.click();
        return buttonResult.getText();
    }

    public String doMulti()
    {
        buttonClear.click();
        button8.click();
        buttonMultiplication.click();
        button2.click();
        buttonEquals.click();
        return buttonResult.getText();
    }

    public String doDivn()
    {
        buttonClear.click();
        button6.click();
        buttonDivision.click();
        button2.click();
        buttonEquals.click();
        return buttonResult.getText();
    }


}
