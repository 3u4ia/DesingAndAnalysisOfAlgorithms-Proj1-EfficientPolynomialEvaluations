import java.math.BigInteger;
import java.util.Random;

public class PolynomialP3 {



    public BigInteger repeatedSquaring(BigInteger x, int p){
        if(p==0){
            return BigInteger.valueOf(1);
        }
        else if(p==1){
            return x;
        }
        else if(p%2 == 0){
            return repeatedSquaring(x.multiply(x), p/2);
        }
        else{
            return x.multiply(repeatedSquaring(x.multiply(x), (p-1)/2));
        }
    }

    public BigInteger formula(int x,  int[] coeffs){
        BigInteger result = new BigInteger("0");
        for(int i = 0; i < coeffs.length; i++){
            result = result.add(repeatedSquaring(BigInteger.valueOf(x),i).multiply(BigInteger.valueOf(coeffs[i])));
        }
        return result;
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
