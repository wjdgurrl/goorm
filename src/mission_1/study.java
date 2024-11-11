package mission_1;

import java.util.Arrays;

public class study {
    public static void main(String[] args) {
        /*byte b = 127;
        b = (byte) (b+1);
        System.out.println("b=" + b);

        byte b2 = -127;
        b2 = (byte) (b-1);
        System.out.println("b2="+b2);

        int i = 1234;
        System.out.println("i="+i);

        long l = 1234L;
        System.out.println("L="+l);

        //int i2 = 1234L;
        int i2 = 2_147_483_647;
        System.out.println("12="+i2);*/

        /*for (int i = 3; i < 100; i+=3) {
            System.out.print(i +" ");
        }*/
        int[] numbers = new int[101];
        for (int i = 1; i <= 100; i++) {
            numbers[i] = i;
            if (isPrime(i)) System.out.println(i + " is prime");
        }
        int[] b = new int[5];
        b[0] = 1;
        b = new int[7];
        System.out.println(b[6]);

    }
    public static boolean isPrime(int num) {
        if (num == 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


