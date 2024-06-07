public class LastOccurance {
    public static void main(String[] args) {
        int arr[] = {2, 2, 6, 2, 8, 9, 2, 2};
        int key = 2;
        int lastIndex = arr.length - 1;
        int res = lastOccurance(arr, key, lastIndex);
        if(res == -1){
            System.out.println("Key is not present in the array");
        }else{
            System.out.println("Last occurance of "+ key + " is present at index: "+ lastOccurance(arr, key, lastIndex));
        }     
    }

    public static int lastOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1; 
        }
        if(arr[i] == key){
            return i;  // Base case
        }
        return lastOccurance(arr, key, i-1);   // Recursive case
    }
}
