import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao day");
        int day = scanner.nextInt();

        for (int i = 1; i <= day; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
