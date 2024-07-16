import java.math.BigInteger;
import java.util.Random;

public class Mainp2 {

    //Brute force Algorithm To solve a polynomial
//Pn(x) = 1 + x + 2x^2 3x^3

        public static void main(String[] args) {
            //Data description: The polynomial coefficients and teh point to be evaluated at
            //Two params n and d. n for the degree of the polynomial and d for the number of digits
            //for the coefficients of the polynomial and teh variable x
            //We can set teh vals for n and d in code.

            //First round experiments: make sure tht implementations of the three methods are correct.




            //repeated squaring technique



        }

        public  BigInteger poww(BigInteger num, int power){
            BigInteger temp = new BigInteger("0");
            temp = num;
            if(power == 0){
                return BigInteger.valueOf(1);
            }
            for(int i = 0; i < power-1; i++){
                num = num.multiply(temp);
            }
            return num;
        }

        public BigInteger formula(int n, BigInteger d){
            int[] coeffs = generateCoeffsWithRandDigits(n, d.intValue());
            BigInteger answer = new BigInteger("0");
            for(int i=0; i < n+1; i++){
                answer = answer.add((poww(d,i).multiply(BigInteger.valueOf(coeffs[i]))));
            }

            return answer;
        }


        public int[] generateCoeffsWithRandDigits(int n, int d){
            int[] coeffs = new int[n+1];
            for(int i = 0; i < n+1; i++){
                coeffs[i] = generateRandomWithDigits(d);
            }
//            for (int coeff : coeffs) {
//                System.out.println(coeff);
//            }
            return coeffs;
        }

    public int generateRandomWithDigits(int d) {
        Random rand = new Random();
        int minimum = (int) Math.pow(10, d-1);
        int maximum = (int) Math.pow(10, d) - 1;
        return rand.nextInt(maximum - minimum + 1) + minimum;
    }


// we can set d all the coefficients are randomly generated
        //one file doing brute force and one file doing another one

}
