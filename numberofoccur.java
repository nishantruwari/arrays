//return first and last occurence of 30
public class numberofoccur {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 9, 19, 30, 30, 30, 30, 30, 40, 50 };

        int low = 0;
        int key = 30;
        int high = arr.length - 1;
        int mid = (high + low) / 2;
        int i;
        int lowerindex, lastindex;
        System.out.println("hii");
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                i = lowerindex = lastindex = mid;
                while (arr[i] == 30) {
                    if (arr[i - 1] == 30) {
                        lowerindex = i - 1;
                        i--;
                    }

                }
                System.out.println("First index " + lowerindex);
                while (arr[i] == 30) {
                    if (arr[i + 1] == 30) {
                        lastindex = i + 1;
                        i++;
                    }

                }
                System.out.println("last index " + lastindex);
                return;

            } else if (arr[mid] > key) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }

        }
        System.out.println("not found");
    }

}
