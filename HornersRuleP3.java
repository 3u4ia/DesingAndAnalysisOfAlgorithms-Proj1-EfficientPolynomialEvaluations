import java.math.BigInteger;
import java.util.Random;

public class HornersRuleP3 {





    public BigInteger horner(int x, int[] coeffs){


        BigInteger leading = BigInteger.valueOf(coeffs[coeffs.length-1]); // for the leading coefficients

        for(int i = coeffs.length-2; i>= 0; i--){
            leading = leading.multiply(BigInteger.valueOf(x)).add(BigInteger.valueOf(coeffs[i]));
        }

        return leading;

    }

    public int[] generateCoeffsWithRandDigits(int n, int d){
        int[] coeffs = new int[n+1];
        for(int i = 0; i < coeffs.length; i++){ // was n+1
            coeffs[i] = generateRandomWithDigits(d);
        }
        System.out.println("\n");
        for (int coeff : coeffs) {
            System.out.println(coeff);
        }
        return coeffs;
    }
    public int generateRandomWithDigits(int d) {
        Random rand = new Random();
        int minimum = (int) Math.pow(10, d-1);
        int maximum = (int) Math.pow(10, d) - 1;
        return rand.nextInt(maximum - minimum + 1) + minimum;
    }




}
