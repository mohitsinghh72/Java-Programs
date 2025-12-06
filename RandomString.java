import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();

        for(int i = 0;i<10;i++){
            int randomchar = 97 + (int)(random.nextFloat() * 26);
            sb.append((char)randomchar);
        }
        System.out.println(sb);
    }
}
