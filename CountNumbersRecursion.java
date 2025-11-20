public class CountNumbersRecursion {
    public static void main(String[] args) {
        int ans = count(123111,1,0);
        System.out.println(ans);

    }
    static int count(int n,int target,int c){
        if(n==0){
            return c;
        }

        int rem = n%10;
        if(rem == target){
            return count(n/10,target,c+1);
        }else{
            return count(n/10,target,c);
        }
    }
}