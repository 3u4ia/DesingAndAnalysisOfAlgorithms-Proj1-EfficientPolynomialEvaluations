public class HornersRuleP2 {
    public int horner(int n, int x){
        int[] coeffs = new int[n+1];


        for(int i = 0; i < n; i++){
            coeffs[i] = i+1;
        }

        int leading = coeffs[n]; // for the leading coefficients

        for(int i = n-1; i>= 0; i--){
            leading = leading * x + coeffs[i];
        }

        return leading;

    }



    public static void main(String[] args) {
        HornersRuleP2 obj = new HornersRuleP2();
        System.out.println(obj.horner(5, 2));
    }
}
