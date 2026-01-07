import java.util.ArrayList;
import java.util.List;

public class sorting {
    static void swap(int[] arr, int min, int i){
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
    }
    static void selection(int[] arr, int n){
        // Starting point :
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            // Finding min value :
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, min, i);
        }
    }

    static void bubble(int[] arr, int n){
        for(int i = n-1; i>=1; i--){
            boolean isSwapped = false;
            for(int j = 0; j<i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }
    
    static void insertion(int[] arr, int n){
        for(int i = 0; i<=n-1; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1 };
        int n = arr.length;
        // selection(arr, n);
        // bubble(arr, n);
        // insertion(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}