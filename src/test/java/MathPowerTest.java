
import org.junit.Assert;
import org.junit.Test;

public class MathPowerTest {

    @Test
    public void givenMethod_WhenPower_ThenShouldReturnResult() {
        Calculator calculator = new Calculator();
        int result= calculator.power(2,3);
        Assert.assertEquals(result,8);
    }

    @Test
    public void givenMethod_WhenPowerZero_ThenShouldReturnOne(){
        Calculator calculator = new Calculator();
        int result= calculator.power(2,0);
        Assert.assertEquals(result,1);

    }

    @Test
    public void givenMethod_WhenNegativeValue_ThenShouldReturnResult() {
        Calculator calculator = new Calculator();
        int result= calculator.power(2,-2);
        Assert.assertEquals(result,1);

    }

}
