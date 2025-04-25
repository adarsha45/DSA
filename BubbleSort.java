public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("UnSorted array: " + java.util.Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));


    }
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped = false;
            System.out.println("Pass " + (i+1) + ": " + java.util.Arrays.toString(arr));
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;  
                    swapped = true;
                }
            }
            if(!swapped){
                break; // If no two elements were swapped in the inner loop, then break
            }
        }
    }
}