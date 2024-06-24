import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        //Data description: The polynomial coefficients and teh point to be evaluated at
        //Two params n and d. n for the degree of the polynomial and d for the number of digits
        //for the coefficients of the polynomial and teh variable x
        //We can set teh vals for n and d in code.

        //First round experiments: make sure tht implementations of the three methods are correct.


//        BigInteger something = (BigInteger)obj.pnX(4, 3);
//        System.out.print(something);


         BigInteger val = BigInteger.valueOf(1 + 4 + 2*(int)Math.pow(123, 2) + 3*(int)Math.pow(123, 3) +
                4*(int)Math.pow(123,4) + 5L *(int)Math.pow(123,5) + 6L *(int)Math.pow(123,6) +
                 7L *(int)Math.pow(123,7) + 8L *(int)Math.pow(123,8) + 9L *(int)Math.pow(123,9) +
                 10L *(int)Math.pow(123,10) + 11L *(int)Math.pow(123,11) + 12L *(int)Math.pow(123,12) +
                 13L *(int)Math.pow(123,13) + 14L *(int)Math.pow(123,14) + 15L *(int)Math.pow(123,15) +
                 16L *(int)Math.pow(123,16) + 17L *(int)Math.pow(123, 17) + 18L *(int)Math.pow(123,18) +
                 19L *(int)Math.pow(123,19) + 20L *(int)Math.pow(123,20) + 21L *(int)Math.pow(123, 21) +
                 22L *(int)Math.pow(123,22) + 23L *(int)Math.pow(123,23) + 24L *(int)Math.pow(123,24) +
                 25L *(int)Math.pow(123,25));
        System.out.println(val);

    }




}
