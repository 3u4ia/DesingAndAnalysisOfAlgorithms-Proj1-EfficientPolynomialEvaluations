import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class RealMain {
    public static void main(String[] args) {
        Mainp2 bruteObj = new Mainp2();
        PolynomialP2 repeatedSquareObj = new PolynomialP2();
        String filePath = "answerData.txt";

        BigInteger answer = new BigInteger("0");
        long startTime = System.currentTimeMillis();
        answer = bruteObj.formula(10000, BigInteger.valueOf(3));
        long endTime = System.currentTimeMillis();
        try(PrintWriter writer = new PrintWriter(filePath)){
            writer.println("Answer: " + answer);
            writer.println("It took " + (endTime - startTime));
        } catch (IOException e) {
            e.printStackTrace();
        }



        startTime = System.currentTimeMillis();
        System.out.println(repeatedSquareObj.formula(10000, 3));
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }
}
