package mission_1;

import java.io.*;

public class Goorm {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("name:");
        String name = br.readLine();
        System.out.print("age:");
        String age = br.readLine();
        System.out.println(name+" "+age);
        br.close();
    }
}
