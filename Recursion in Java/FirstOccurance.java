public class FirstOccurance {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 5, 8, 9, 5, 1};
        int key = 5;
        int startingIndex = 0;
        int res = firstOccurance(arr, key, startingIndex);
        if(res == -1){
            System.out.println("Key is not present in the array");
        }else{
            System.out.println("Key is present at index: "+firstOccurance(arr, key, startingIndex));
        }
        
    }

    public static int firstOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1; 
        }
        if(arr[i] == key){
            return i;  // Base case
        }
        return firstOccurance(arr, key, i+1);   // Recursive case
    }
}
