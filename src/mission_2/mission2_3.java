package mission_2;
import java.io.*;
import java.util.*;

//정수 5개 오름차
public class mission2_3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        br.close();
    }
}
