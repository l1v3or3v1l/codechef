import java.util.*;

public class FLOW010 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String s = sc.next().toLowerCase();
            if (s.compareTo("b") == 0) {
                System.out.println("BattleShip");
            } 
            if (s.compareTo("c") == 0) {
                System.out.println("Cruiser");
            }
            if (s.compareTo("d") == 0) {
                System.out.println("Destroyer");
            }
            
            if (s.compareTo("f") == 0) {
                System.out.println("Frigate");
            }
        }
        sc.close();
    }

}
