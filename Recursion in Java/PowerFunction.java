public class PowerFunction {

    public static int calcPower(int x, int n){
        if(n == 0){
            return 1;   // Base case
        }
        return x * calcPower(x, n-1);   // Recursive case
    }
    public static void main(String[] args) {
        System.out.println(calcPower(2, 10));
    }
}
