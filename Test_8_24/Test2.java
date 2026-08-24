public class Test2 {
    public static void main(String[] args) {
        int[] scores = {90, 87, 81, 76};
        int sum = 0;
        int max = scores[0];
        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if(max < scores[i]) {
                max = scores[i];
            }
        }
        System.out.println(sum);
        System.out.println(max);
    }
} 
