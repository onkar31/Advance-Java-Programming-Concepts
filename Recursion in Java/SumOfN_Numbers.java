public class SumOfN_Numbers {
    public static void main(String[] args) {
        int num = 10;
        int result = getSum(num);
        System.out.println("The sum of first "+ num + " number is: "+ result);
    }

    public static int getSum(int n){
        if(n <= 1){
            return n;   // Base case
        }else{
            return n + getSum(n - 1);   // Recursive case
        }
    }
}
