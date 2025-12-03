
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
//        int ans = maze(3,3);
//        System.out.println(ans);
        ArrayList<String> ans = mazeDiagonal("",3,3);
        System.out.println(ans);

    }
    public static int maze(int r,int c){
        if(r==1 || c == 1){
            return 1;
        }
        int left = maze(r-1,c);
        int right = maze(r,c-1);

        return left+right;
    }

    public static ArrayList<String> maze3(String p,int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(maze3(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(maze3(p+'R',r,c-1));
        }

        return list;
    }

    public static ArrayList<String> mazeDiagonal(String p,int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(mazeDiagonal(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(mazeDiagonal(p+'R',r,c-1));
        }
        if(r>1 && c>1){
            list.addAll(mazeDiagonal(p+'d',r-1,c-1));
        }

        return list;
    }
}