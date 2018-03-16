import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float C;
        System.out.println("Nhap gia tri do C: ");
        C = scanner.nextFloat();
        float F = (C * 9) / 5 + 32;
        System.out.println("Gia tri do F la: " + F);
    }
}
