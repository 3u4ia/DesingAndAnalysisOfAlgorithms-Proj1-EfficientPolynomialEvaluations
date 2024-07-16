import java.math.BigInteger;

public class Polynomial {
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




    public static void main(String[] args) {
        Polynomial obj = new Polynomial();
        BigInteger answer = new BigInteger("0");
        for(int i = 1; i < 10000; i++){ // i was 26
            answer = answer.add(obj.repeatedSquaring(BigInteger.valueOf(123), i).multiply(BigInteger.valueOf(i)));
        }
        System.out.println(answer);
    }







    static BigInteger poww(BigInteger num, int power){
        BigInteger temp = new BigInteger("0");
        temp = num;
        for(int i = 0; i < power-1; i++){
            num = num.multiply(temp);
        }
        return num;
    }
}
