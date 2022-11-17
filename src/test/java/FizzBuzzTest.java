import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {


    //1.Positive testing Happy path
    // if (star <= end)
    // return array;


    //start < end
    @Test
    public void testStartLessThanEnd_HappyPath() {
        //AAA
        //arange
        int start = 1;
        int end = 20;
        String[] epectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, epectedResult);

    }


}
