package mission_3;
import java.util.*;
import java.io.*;

// TODO: 2024-11-11
// 람다식으로 입력 받아서 계산기기

@FunctionalInterface
interface addOperation{
    int addNum(int a,int b);
}
@FunctionalInterface
interface minuseOperation{
    int minusNum(int a, int b);
}
@FunctionalInterface
interface multiplyOperation{
    int multiNum(int a, int b);
}
@FunctionalInterface
interface divineOperation{
    int divineNum(int a, int b);
}

public class mission3_9 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int a = Integer.parseInt(br.readLine());
            String operator = br.readLine();
            int b = Integer.parseInt(br.readLine());
            int answer = 0;
            if(operator.equals("+")){
                addOperation add = (x,y) -> x+y;
                answer = add.addNum(a,b);
            }else if(operator.equals("-")){
                minuseOperation minus = (x,y) -> x-y;
                answer = minus.minusNum(a,b);
            }else if(operator.equals("/")){
                divineOperation divine = (x,y) -> x/y;
                answer = divine.divineNum(a,b);
            }else if(operator.equals("*")){
                multiplyOperation multi = (x,y) -> x*y;
                answer = multi.multiNum(a,b);
            }else{
                System.out.println("wrong operation");
            }
            System.out.println(answer);
        }
        catch(NumberFormatException e){
            System.out.println("input error : "+ e.getMessage());
        }
        br.close();
    }
}