import java.util.Scanner;

class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        int f1 = 1, f2 = 1;

        for (int i = 1; i <= n; i++)
            f1 *= i;

        for (int i = 1; i <= n-r; i++)
            f2 *= i;

        System.out.println(f1 / f2);
    }
}
