public class maxSubArraySum {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 5, 6, 7, 8, 7 };
        int k = 3;
        // int subarray = 0;
        int sum = 0;
        int maxsum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + a[i];
            maxsum = sum;
            // subarray++;
        }
        // System.out.println(sum);

        for (int i = k; i < a.length; i++) {
            sum = sum - a[i - k] + a[i];
            if (maxsum < sum) {
                maxsum = sum;
            }
            // System.out.println(sum);
            // subarray++;
        }
        System.out.println(maxsum);

    }

}
