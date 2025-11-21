public class RemoveCharacterRecursion {
    public static void main(String[] args) {
        String ans = skip2("baccab");
        System.out.println(ans);
    }
    static void skip(String p,String up){
        if(up.length() == 0){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a') {
            return skip2(up.substring(1));
        }
        else{
            return ch+skip2(up.substring(1));
        }
    }
}