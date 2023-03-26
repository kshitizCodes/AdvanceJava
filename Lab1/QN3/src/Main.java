public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = arr[0], min= arr[0], sum = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
            sum += j;
        }
        System.out.printf("Smallest %d\nLargest %d\nSum %d", min, max, sum);
    }
}