public class binarysearch {
    public static void main(String[] args) {
        int low, mid, high;
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 9;
        low = 0;
        high = a.length - 1;
        mid = (low + high) / 2;
        while (low <= high) {
            if (a[mid] == key) {
                System.out.println("element found at position : " + (low + 1));
                return;
            } else if (a[mid] > key) {
                high = mid - 1;
                mid = (low + high) / 2;
            } else if (a[mid] < key) {
                low = mid + 1;
                mid = (low + high) / 2;
            }

        }
        System.out.println("not found");

    }

}
