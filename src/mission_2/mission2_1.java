package mission_2;
import java.util.*;
import java.io.*;
//홀짝 구분
public class mission2_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num  = Integer.parseInt(br.readLine());
        if(num % 2 == 0) System.out.println("짝");
        else System.out.println("홀");
        br.close();
    }
}
