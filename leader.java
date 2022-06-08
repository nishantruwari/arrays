public class leader {
    public static void main(String[] args) {

        int count = 0;
        int a[] = new int[] { 1, 3, 5, 6, 9, 6, 1 };
        for (int i = 0; i < a.length; i++) {
            count = 0;
            for (int j = i; j < a.length; j++) {
                if (a[i] < a[j]) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(a[i]);
            }

        }
    }
}
