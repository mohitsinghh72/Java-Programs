public class FibonacciRecursion {
    public static void main(String[] args) {
        int ans = fibo(6);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n == 1 || n==0){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}