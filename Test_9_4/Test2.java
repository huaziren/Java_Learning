public class Test2 {
    public static void main(String[] args) {
        int[] arrs = {5, 3, 8, 1, 9};
        printArray(arrs);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
