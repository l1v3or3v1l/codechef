import java.util.*;

public class FLOW007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int rev = 0;
            while(n != 0) {
                rev = (rev*10) + (n%10);
                n /= 10;
            }
            System.out.println(rev);
        }
        sc.close();
    }
}
