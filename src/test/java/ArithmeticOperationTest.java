import org.junit.Assert;
import org.junit.Test;
import ua.epam.ArithmeticOperation;

/**
 * Created by Nataliia_Shevtsova on 9/9/2016.
 */
public class ArithmeticOperationTest {
    @org.junit.Test
    public void getDivision() throws Exception {

        ArithmeticOperation a = new ArithmeticOperation();
        int res =  a.getDivision(150, 5);
        Assert.assertEquals(30, res);
    }

    @Test(expected = ArithmeticException.class)
    public void getDivisionException() throws Exception {

        ArithmeticOperation a = new ArithmeticOperation();
        int res =  a.getDivision(150, 0);
        //Assert.assertEquals(30, res);
    }

    @Test
    public void getSum() throws Exception {
        ArithmeticOperation a = new ArithmeticOperation();
        int res = a.getSum(22, 44);
        Assert.assertEquals(66, res);
    }

    @Test
    public void getSumNotExpected() throws Exception {
        ArithmeticOperation a = new ArithmeticOperation();
        int res = a.getSum(22, 44);
        Assert.assertNotEquals(72, res);
    }

    @Test
    public void getSubtraction() throws Exception {
        ArithmeticOperation a = new ArithmeticOperation();
        int res = a.getSubtraction(88, 77);
        Assert.assertEquals(11, res);
    }

    @Test
    public void getSubtractionNotEquals() throws Exception {
        ArithmeticOperation a = new ArithmeticOperation();
        int res = a.getSubtraction(88, 77);
        Assert.assertNotEquals(5, res);
    }

    @Test
    public void getMultiplication() throws Exception {
        ArithmeticOperation a = new ArithmeticOperation();
        int res = a.getMultiplication(44,10);
        Assert.assertEquals(440, res);
    }

    @Test
    public void getMultiplicationNotEquals() throws Exception {
        ArithmeticOperation a = new ArithmeticOperation();
        int res = a.getMultiplication(44,10);
        Assert.assertNotEquals(100, res);
    }

}
