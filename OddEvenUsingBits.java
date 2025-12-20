public class Main {
    public static void main(String[] args) {
        boolean ans = isOdd(23);
        System.out.println(ans);


    }
    public static boolean isOdd(int n){
        if((n & 1) == 1){
            return true;
        }else{
            return false;
        }
    }
}