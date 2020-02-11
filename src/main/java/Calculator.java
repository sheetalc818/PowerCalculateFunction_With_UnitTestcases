public class Calculator {

    public int power(int a, int b) {//return Math.pow(a,b);
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result =  result*a;
        }

        return result;
    }
}
