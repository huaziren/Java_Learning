package test_9_6;



public class Test1 {
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static void main(String[] args) {
        System.out.println(max(3, 6));
        System.out.println(max(2, 8, 5));
    }
}



