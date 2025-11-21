import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {
        ArrayList<String> ans = subSeq2("","abc");
        System.out.println(ans);

    }
    static void subSeq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));
    }
    static ArrayList<String> subSeq2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subSeq2(p+ch,up.substring(1));
        ArrayList<String> Right = subSeq2(p,up.substring(1));

        left.addAll(Right);
        return left;
    }
}