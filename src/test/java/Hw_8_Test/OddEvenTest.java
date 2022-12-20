package Hw_8_Test;

import Hw_8.OddEven;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test
    public void testOddEven_Even_HappyPath() {
       long number = 1;
       String expectedResult = "Odd";

       OddEven as = new OddEven();
       String actualResult = as.oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testOddEven_Odd_HappyPath() {
        //AAA
        //arrange
        long number = 19;
        String expectedResult = "Odd";

        OddEven as = new OddEven();
        //act
        String actualResult = as.oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testOddEven_null_check_HappyPath() {
        //AAA
        //arrange
        long number = 0;
        String expectedResult = "Even";

        OddEven as = new OddEven();
        //act
        String actualResult = as.oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    /*-2 147 483 648 до 2 147 483 647. NegativeTest*/

    @Test
    public void testOddEve_NegativeNumber_HappyPath() {
        //AAA
        //arrange
        long number = -2147483648;
        String expectedResult = "Even";

        OddEven as = new OddEven();
        //act
        String actualResult = as.oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);


    }
}
