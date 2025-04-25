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
        int index = 0;
        for(int elements: arr ){
            if(elements == target){
                return index;
            }
            index++;
        }
        return -1;
    }
}