//compare a[j] to temp 
// if a[j] > temp, shift a[j] to the right
// else insert temp at a[j+1]

public class InsertionSort {
    static int[] arr = {64, 34, 25, 12, 22, 11, 90};
    public static void main(String[] args) {
        System.out.println("UnSorted array: " + java.util.Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
    
    public static void insertionSort(int[] arr){

        for(int i = 1; i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
            System.out.println("Pass " + (i) + ": " + java.util.Arrays.toString(arr));
        }

    }
}
