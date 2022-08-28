import java.io.*;

public class CHFRICH {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().split(" ")[0]);
        while (t-- != 0) {
            String[] in = br.readLine().split(" ");
            int a = Integer.parseInt(in[0]);
            int b = Integer.parseInt(in[1]);
            int x = Integer.parseInt(in[2]);
            System.out.println((b - a) / x);
        }
    }

}
