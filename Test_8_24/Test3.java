public class Test3 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 1, 9};
        int sum = 0;
        int max = nums[0];
        for (int s : nums) {
            sum += s;
        }
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println(sum);
        System.out.println(max);
    }
}
