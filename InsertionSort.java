package love.seeyoufxp.recursion;

public class InsertionSort {
    public static void sort(int[] a) {
        insertion(a, 1);
    }

    public static void insertion(int[] a, int low) {
        if (low == a.length - 1) {
            return;
        }

        int t = a[low];
        int i = low - 1;
        while (i >= 0 && a[i] > t) {
            a[i + 1] = a[i];
            i--;
        }
        if (i + 1 != low) {
            a[i + 1] = t;
        }

        insertion(a, low + 1);
    }
}
