public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str = null;
        char[] ch = str.toCharArray();
    }
}