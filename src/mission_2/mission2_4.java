package mission_2;

import java.util.*;
import java.io.*;

//2개 정수 더하고 빼기
public class mission2_4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = br.readLine().split(" ");
        System.out.println("합:"+ (Integer.parseInt(ab[0]) + Integer.parseInt(ab[1])) + " 빼기:" + (Integer.parseInt(ab[0]) - Integer.parseInt(ab[1])));
    }
}
