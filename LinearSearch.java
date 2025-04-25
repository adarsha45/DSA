public class LinearSearch{
    public static void main(String[] args){
        int[] arr = {4,7,2,3,8,9};
        int target = 8; 
        int result = linearSearch(arr,target);
        
        if(result != -1){
            System.out.println("Target Found at index " + result);
        }else{
            System.out.println("Tearget Missing");
        }
    }

    public static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}