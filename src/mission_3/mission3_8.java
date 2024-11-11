package mission_3;

import java.util.*;
import java.io.*;

// TODO: 2024-11-11
// 문자열 뒤집기 및 대소문자 변환
public class mission3_8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        for (int i = 0; i < input.length; i++) {
            if(input[i].equals(input[i].toUpperCase())) input[i] = input[i].toLowerCase();
            else input[i] = input[i].toUpperCase();
        }
        for (int i = input.length-1; i >= 0; i--) {
            System.out.print(input[i]);
        }

    }
}
