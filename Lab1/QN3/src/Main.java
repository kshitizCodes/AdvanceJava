public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5, 6, 7, 8, 9};
        int max = arr[0], min= arr[0], sum = 0;
        for(int i=0; i<arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum+=arr[i];
        }
        System.out.printf("Smallest %d\nLargest %d\nSum %d", min, max, sum);
    }
}