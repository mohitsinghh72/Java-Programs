public class ArraySortCheckerRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        boolean ans = SortChecker(arr);
        System.out.println(ans);

    }
    static boolean SortChecker(int[] arr){
        return helper(arr,0);
    }
    static boolean helper(int[] arr,int First){
        if(First+1>arr.length-1){
            return true;
        }
        if(arr[First]>arr[First+1]){
            return false;
        }else{
            return helper(arr,First+1);
        }
    }
}