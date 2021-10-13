public class Main_test {
    public static int max(int numA, int numB) {
        int result;
        if (numA < numB) {
            result = numA;
        } else {
            result = numB;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 15, b = 8;
        int c = max(a, b);
        System.out.println("Largest value = " + c);
    }
}
