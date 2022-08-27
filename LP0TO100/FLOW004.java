import java.util.*;

public class FLOW004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String[] s = sc.next().split("");
            System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[s.length-1]));
        }
        sc.close();
    }
}
