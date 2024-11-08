package mission_2;
import java.util.*;
import java.io.*;
public class mission2_5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        ID id = new ID(input[0],Integer.parseInt(input[1]));
        System.out.println(id.getName()+" "+id.getAge());

    }
    private static class ID{
        private String name;
        private int age;

        private ID(String name, int age){
            this.name = name;
            this.age = age;
        }
        private String getName(){
            return this.name;
        }
        private int getAge(){
            return this.age;
        }
    }
}
