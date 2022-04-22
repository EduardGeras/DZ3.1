public class Main {
    public static void main(String[] args) {
        // Задание 6
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result = result - (result * 2);
        System.out.println(result);

        // Задание 7
        int a1 = 5;
        int b1 = 7;
        int c1;
        c1 = b1;
        b1 = a1;
        a1 = c1;
        System.out.println(a1);
        System.out.println(b1);

        // Задание 8
        int a2 = 256;
        a2 = a2 / 10;
        int b2 = a2 % 10;
        System.out.println(b2);
    }
}