public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[6]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Array length " + arr.length);
        }

    }
}