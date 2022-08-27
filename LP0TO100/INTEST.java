import java.util.*;

public class INTEST {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int out = 0;
        while (n-- != 0) {
            int t = sc.nextInt();
            if (t %  k == 0) {
                out++;
            }
        }
        System.out.println(out);
        sc.close();
    }

}
