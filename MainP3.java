import java.math.BigInteger;
import java.util.Random;

public class MainP3 {
    //Brute force Algorithm To solve a polynomial
//Pn(x) = 1 + x + 2x^2 3x^3



    public BigInteger poww(BigInteger num, int power){
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

    public BigInteger formula(BigInteger x, int[] coeffs){
        BigInteger answer = new BigInteger("0");
        for(int i=0; i < coeffs.length; i++){ // was n+1
            answer = answer.add((poww(x,i).multiply(BigInteger.valueOf(coeffs[i]))));
        }

        return answer;
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


// we can set d all the coefficients are randomly generated
    //one file doing brute force and one file doing another one
}
