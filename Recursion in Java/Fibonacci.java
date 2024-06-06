
//The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.

public class Fibonacci {

    public static void main(String[] args) {
        int num = 10;
        int result = getFibonacci(num);
        System.out.println("Fibonacci of a "+ num + " is: "+ result);
    }

    public static int getFibonacci(int n){
        if(n <= 1){
            return n;   // Base case
        }else{
            return getFibonacci(n - 1) + getFibonacci(n - 2);   // Recursive case
        }
    }
}
