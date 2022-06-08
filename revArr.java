public class revArr {
    public static void main(String[] args) {
        int a[] = new int[] { 1, 2, 3, 4, 5 };
        int temp;
        int j = a.length - 1;
        int i = 0;
        System.out.println("original array");
        for (i = 0; i <= j; i++) {
            System.out.println(a[i]);
        }
        i = 0;

        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        j = a.length;
        System.out.println("Reveresed array ");
        for (i = 0; i < j; i++) {
            System.out.println(a[i]);
        }

    }

}
