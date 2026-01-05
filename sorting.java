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
    public static void main(String[] args) {
        int[] arr = { 11, 22, 10, 8, 23 };
        int n = arr.length;
        // selection(arr, n);
        bubble(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}