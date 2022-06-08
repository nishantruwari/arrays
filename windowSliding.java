//Window sliding helps bring down the time complexity ti n from n^2
public class windowSliding {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 5, 6, 7, 8, 7 };
        int k = 3;
        // int subarray = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + a[i];
            // subarray++;
        }
        System.out.println(sum);

        for (int i = k; i < a.length; i++) {
            sum = sum - a[i - k] + a[i];
            System.out.println(sum);
            // subarray++;
        }

    }

}
