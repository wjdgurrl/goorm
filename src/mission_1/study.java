package mission_1;

public class study {
    public static void main(String[] args) {
        byte b = 127;
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
        System.out.println("12="+i2);
    }
}
