public class Main {
    public static void main(String[] args) {
        reverse(1234,0);

    }
    static void reverse(int n,int rev){
        if(n == 0){
            System.out.println(rev);
            return;
        }
        int rem = n%10;
        rev = rev*10+rem;
        reverse(n/10,rev);
    }
}