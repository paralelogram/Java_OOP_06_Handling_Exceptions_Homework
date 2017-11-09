import java.util.Scanner;

public class Main {
    public int readNumber(int start, int end) {
        int count;
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        if ( count >= start && count <= end) {
            return count;
        } else throw new RuntimeException();
    }

    public static void main(String [] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int start, end;
        System.out.println("input boundary sequence");
        System.out.println("start: ");
        start = scanner.nextInt();
        System.out.println("end:");
        end = scanner.nextInt();
        int[] array = new int[10];
        System.out.println("input growing sequence of numbers");
        for (int  i = 0; i < array.length; i++) {
            System.out.println("output" + m.readNumber(start, end));
        }

    }
}