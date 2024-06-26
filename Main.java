import java.math.BigInteger;
//Brute force Algorithm To solve a polynomial
//Pn(x) = 1 + x + 2x^2 3x^3
public class Main {
    public static void main(String[] args) {
        //Data description: The polynomial coefficients and teh point to be evaluated at
        //Two params n and d. n for the degree of the polynomial and d for the number of digits
        //for the coefficients of the polynomial and teh variable x
        //We can set teh vals for n and d in code.

        //First round experiments: make sure tht implementations of the three methods are correct.




        //repeated squaring technique

        // graphic design x marketing

        BigInteger answer = new BigInteger("0");
        answer = formula(6000, BigInteger.valueOf(690));
        System.out.println(answer);

    }

    static  BigInteger poww(BigInteger num, int power){
        BigInteger temp = new BigInteger("0");
        temp = num;
        for(int i = 0; i < power-1; i++){
            num = num.multiply(temp);
        }
        return num;
    }

    static BigInteger formula(int n, BigInteger x){
        BigInteger answer = new BigInteger("0");
        for(int i=1; i < n+1; i++){
            answer = answer.add(poww(x, i).multiply(BigInteger.valueOf(i)));
        }
        answer = answer.add(BigInteger.valueOf(1));

        return answer;
    }


// we can set d all the coefficients are randomly generated
    //one file oding brute force and one file doing another one
}
