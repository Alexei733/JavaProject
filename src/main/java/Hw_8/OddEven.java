package Hw_8;


/*      В классе OddEven создать алгоритм oddEven(),
        который принимает на вход целое число,
        возвращает “Odd”,  если число нечетное,
        и “Even”, если число четное.

        Test Data:
        -345 →  “Odd”
        0 →  “Even”
        222222 →  “Even”*/


public class OddEven {

    public String oddEven(Long number) {

        String Odd = "Odd";
        String Even = "Even";
        String Undefined = "Undefined";

        if (number <= 2147483647L && number >= -2147483648L) {


            if (number % 2 == 0) {
                return Even;

            } else {
                return Odd;

            }

        }
        return Undefined;

    }

}