import java.util.ArrayList;
import java.util.Arrays;

public class FindAllElementRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,6,7,10};
        ArrayList<Integer> ans = search(arr,4);
        System.out.println(ans);


    }
    static ArrayList<Integer> search(int[] arr, int target){
        return helper(arr,new ArrayList<>(),target,0);

    }
    static ArrayList<Integer> helper(int[] arr,ArrayList<Integer> list,int target, int index){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return helper(arr,list,target,index+1);
    }
}