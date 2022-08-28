import java.io.*;

public class CHOPRT {
    
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().split(" ")[0]);
        while(t-- != 0) {
                String[] in = br.readLine().split(" ");
                int a = Integer.parseInt(in[0]);
                int b = Integer.parseInt(in[1]);
                if (a < b) {
                    System.out.println("<");
                } else if (a > b) {
                    System.out.println(">");
                } else {
                    System.out.println("=");
                }
            }
        }
    }