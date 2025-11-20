public class FindElementRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int start = 0;
        return helper(arr,target,start);
    }
    static int helper(int[] arr,int target,int start){
        if(arr.length == 0){
            return -1;
        }
        if(start == arr.length){
            return -1;
        }
        if(arr[start] == target){
            return start;
        }else{
            return helper(arr,target,start+1);
        }
    }
}