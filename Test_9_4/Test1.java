public class Test1 {
    public static void main(String[] args) {
        int m = max(10, 20);
        int[] nums = {5, 3, 8, 1, 9};
        int total = sum(nums);
        System.out.println(m);
        System.out.println(total);
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int s : arr) {
            sum += s;
        }
        return sum;
    }
}
