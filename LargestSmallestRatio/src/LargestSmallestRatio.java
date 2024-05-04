public class LargestSmallestRatio {

    public static double calculateRatio(int[] a) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : a) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        if (min1 <= 0 || min2 <= 0) {
            System.out.println("Invalid input: array must contain at least two positive numbers");
            return -1; // Or throw an exception
        }

        return (double) (max1 + max2) / (min1 + min2);
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 12, 450, 1, 1, 5, 6, 23, 6, 8, 9, 321, 2, 3};
        double ratio = calculateRatio(a);
        System.out.println("Ratio: " + ratio);
    }
}
