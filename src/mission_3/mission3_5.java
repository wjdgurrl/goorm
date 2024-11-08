package mission_3;

import java.io.*;
interface Calculate{
    double calcul(double a, double b);
}
class AddCalculate implements Calculate{
    @Override
    public double calcul(double a, double b){
        return a+b;
    }
}
class MinusCalculate implements Calculate{
    @Override
    public double calcul(double a, double b){
        return a-b;
    }
}
class MultipleCalculate implements Calculate{
    @Override
    public double calcul(double a, double b){
        return a * b;
    }
}
class DivineCalculate implements Calculate{
    @Override
    public double calcul(double a, double b){
        return a / b;
    }
}
public class mission3_5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double answer = 0;
        try{
            double a = Double.parseDouble(br.readLine());
            char operator = br.readLine().charAt(0);
            double b = Double.parseDouble(br.readLine());
            Calculate calculate = null;
            switch (operator){
                case '+':
                     calculate = new AddCalculate();
                    break;
                case '-':
                    calculate = new MinusCalculate();
                    break;
                case '/':
                    calculate = new DivineCalculate();
                    break;
                case '*':
                    calculate = new MultipleCalculate();
                    break;
                default:
                    throw new IllegalArgumentException("잘못된 연산자 오류");
            }
            answer = calculate.calcul(a, b);
            System.out.println(answer);
        }catch (NumberFormatException e){
            throw new NumberFormatException("숫자만 입력");
        }catch (Exception e){
            throw new EOFException("오류");
        }
        br.close();
    }
}
