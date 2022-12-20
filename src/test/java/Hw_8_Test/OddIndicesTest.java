package Hw_8_Test;

import Hw_8.OddIndices;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class OddIndicesTest {
    @Test
    public void OddIndicesTestHappyPath(){

        int [] array = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult ={590, 985, 68};

        OddIndices ai = new OddIndices();

        int[] actualResult = ai.OddIndices(array);

        Assert.assertEquals(expectedResult,actualResult);


    }
}
