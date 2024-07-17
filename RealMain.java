import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class RealMain {
    public static void main(String[] args) {
        int n = 3;
        int d = 2;
        String answerFile = "answerData.txt";
        String generatedFile = "generated.txt";
        RealMain randomizerObj = new RealMain();
        int x = randomizerObj.generateRandomWithDigits(d);
        int[] coeffs = randomizerObj.generateCoeffsWithRandDigits(n, d);

        BigInteger bruteAnswer = new BigInteger("0");
        BigInteger repeatAnswer = new BigInteger("0");
        BigInteger hornerAnswer = new BigInteger("0");

        long bruteTime = 0;
        long repeatTime = 0;
        long hornerTime = 0;

        PolynomialP3 repeatObj = new PolynomialP3();
        MainP3 bruteObj = new MainP3();
        HornersRuleP3 hornerObj = new HornersRuleP3();


        try(PrintWriter writer = new PrintWriter(generatedFile)){
            writer.println(x);
            writer.println(n);
            for(int i = 0; i < coeffs.length; i++){
                writer.println(coeffs[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        File readFile = new File(generatedFile);
        try {
            Scanner scanObj = new Scanner(readFile);
            int isX = scanObj.nextInt();
            int isN = scanObj.nextInt();
            int[] coefficients = new int[n+1];
            int j = 0;
            for(int i = 0; i < coefficients.length; i++){
                coefficients[i] = scanObj.nextInt();
            }
            scanObj.close();
            System.out.println("HEEEEEYYYYYYYYYY\n\n");
            for(int i =0; i < coefficients.length; i++){
                System.out.println(coefficients[i]);
            }
            scanObj.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }





        long startTime = System.currentTimeMillis();
        bruteAnswer = bruteObj.formula(BigInteger.valueOf(x), coeffs);
        long endTime = System.currentTimeMillis();
        bruteTime = endTime - startTime;

        startTime = System.currentTimeMillis();
        repeatAnswer = repeatObj.formula(x, coeffs);
        endTime = System.currentTimeMillis();
        repeatTime = endTime - startTime;

        startTime = System.currentTimeMillis();
        hornerAnswer = hornerObj.horner(x, coeffs);
        endTime = System.currentTimeMillis();
        hornerTime = endTime - startTime;



        try(PrintWriter writer = new PrintWriter(answerFile)){
            writer.println("Answer for bruteForce: " + bruteAnswer);
            writer.println("It took " + bruteTime + " seconds \n");
            writer.println("Answer for repeatSquaringTech " + repeatAnswer);
            writer.println("It took " + repeatTime + " seconds \n");
            writer.println("Answer for Horner's rule " + hornerAnswer);
            writer.println("It took " + hornerTime + " seconds");

        } catch (IOException e) {
            e.printStackTrace();
        }





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
