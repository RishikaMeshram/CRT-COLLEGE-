public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55,66,77};
        int loc = 0;
        int target = 66;
        int low = 0;
        int n = arr.length;
        int high = n-1;
        boolean flag = false;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                loc = mid;
                flag = true;
                break;
            }
            else if(target < arr[mid]){
                high = mid-1;
            }
            else if(target > arr[mid]){
                low = mid+1;
            }
        }
        if(flag){
        System.out.println("Target found");
    }
    else{
        System.out.println("Target absent");
    }
    }
    
}
