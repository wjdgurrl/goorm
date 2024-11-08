package mission_2;
import java.util.*;
import java.io.*;
public class mission2_6 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        float avg = 0;
        for(int n : arr) avg+=n;

        System.out.println(avg/arr.length);

    }
}
