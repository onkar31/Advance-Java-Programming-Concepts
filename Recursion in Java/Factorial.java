
public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        long result = getFactorial(num);
        System.out.println("factorial of a "+ num + " is: "+ result);
    }

    public static long getFactorial(int n){
        if(n == 0){
            return 1;   // Base case
        }else{
            return n * getFactorial(n - 1);    // Recursive case
        }
    }
}
