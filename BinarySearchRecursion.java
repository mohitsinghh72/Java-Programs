public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,43,56,78,99};
        int ans = search(arr,43,0,arr.length-1);
        System.out.println(ans);

    }
    static int search(int[] arr, int target,int start, int end){

        if(start>end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return mid;
        }else if(target>arr[mid]){
            return search(arr,target,mid+1,end);
        }else{
            return search(arr,target,start,mid-1);
        }
    }
}