package array.practicals;

// Write A Program To Find Maximum Value of Array..
public class MaxArray {
    public static void main(String[] args) {
        int[] a = new int[]{55, 4, 66, 84, 11, 5, 1, 66, 3};

        int max = a[0];

        for (int i = 0; i <= a.length-1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
