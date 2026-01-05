import java.util.*;

public class mergeSort {
    public static void mergeSort(List<Integer> arr, int low, int high){
    if(low >= high) return;
    int mid = (low + high) / 2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid + 1, high);
    merge(arr, low, mid, high);
}

    public static void merge(List<Integer> arr, int low, int mid, int high) {
        List<Integer> temp_array = new ArrayList<>();
        int left_start = low;
        int right_start = mid + 1;

        while (left_start <= mid && right_start <= high) {
            if (arr.get(left_start) <= arr.get(right_start)) {
                temp_array.add(arr.get(left_start));
                left_start++;
            } else {
                temp_array.add(arr.get(right_start));
                right_start++;
            }
        }
        while (left_start <= mid) {
            temp_array.add(arr.get(left_start));
            left_start++;
        }
        while (right_start <= high) {
            temp_array.add(arr.get(right_start));
            right_start++;
        }
        for (int i = low; i <= high; i++) {
            arr.set(i, temp_array.get(i - low));
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many values you want to add : ");
        int numberOfValues = sc.nextInt();
        System.out.print("Enter the values: ");
        while (i <= numberOfValues) {
            int number = sc.nextInt();
            numbers.add(number);
            i++;
        }
        sc.nextLine();
        System.out.println(numbers);
        mergeSort(numbers, 0, numbers.size() - 1);
        System.out.println(numbers);

        sc.close();
    }

}
