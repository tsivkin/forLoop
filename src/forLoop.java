public class forLoop {

    public static void main(String[] args) {
        for (int i = 100; i >= 1; i = i - 1) {
            if (getMultiplicity(i)) {

                System.out.print(i + "  ");
            }
        }
    }

    public static boolean getMultiplicity(int num1) {
        return num1 % 4 == 0;
    }
}