import java.util.*;

public class LUCKYFOUR {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String[] in = sc.next().split("");
            int count = 0;
            for (int i=0; i < in.length; i++) {
                if (in[i].compareTo("4") == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }

}
