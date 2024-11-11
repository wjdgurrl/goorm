package mission_3;

import java.util.*;
import java.io.*;

// TODO: 2024-11-11
// input : 정수배열
// output : 버블정렬, 선택정렬 등등 통한 뒤의 배열
public class mission3_10 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = (br.readLine().split(""));
        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        arr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] bubbleSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                temp = arr[i];
                if(temp > arr[j]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    static int[] selectSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {

        }
    }
}
