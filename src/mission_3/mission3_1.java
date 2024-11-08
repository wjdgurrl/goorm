package mission_3;

public class mission3_1 {
    static class Square{
        private final int length;
        private final int height;
        Square(int length,int height) {
            this.length = length;
            this.height = height;
        }
        public int getWidth(){
            return length * height;
        }
        public int getLine(){
            return 2 * (length + height);
        }
    }
    public static void main(String[] args) {
       Square square = new Square(5,7);
        System.out.println("넓이:" + square.getWidth());
        System.out.println("둘레:" + square.getLine());
    }
}

