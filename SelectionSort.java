// select the minimum element from the unsorted array and swap it with the first element of the unsorted array

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("UnSorted array: " + java.util.Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }   
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            System.out.println("Pass " + (i+1) + ": " + java.util.Arrays.toString(arr));
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted array
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;  
        }
        System.out.println("Pass " + n + ": " + java.util.Arrays.toString(arr));    
    }
    
}
