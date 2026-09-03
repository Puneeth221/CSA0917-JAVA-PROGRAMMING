import java.util.Scanner;

class BinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bin = sc.nextInt();
        int temp = bin;
        int decimal = 0;
        int power = 1;

        // Binary to Decimal
        while (bin > 0) {
            int r = bin % 10;
            decimal = decimal + r * power;
            power = power * 2;
            bin = bin / 10;
        }

        // Decimal to Octal
        int octal = 0;
        power = 1;
        int n = decimal;

        while (n > 0) {
            int r = n % 8;
            octal = octal + r * power;
            power = power * 10;
            n = n / 8;
        }

        System.out.println("Decimal = " + decimal);
        System.out.println("Octal = " + octal);
    }
}
