public class Hanoi {
    public static void main(String[] args) {
        hanoii(3, 'A', 'C', 'B');
    }

    public static void hanoii(int n, char from, char to, char help) {
        if (n == 0) return;
        hanoii(n - 1, from, help, to);
        System.out.println("disk " + n + ": " + from + " -> " + to);
        hanoii(n - 1, help, to, from);
    }
}