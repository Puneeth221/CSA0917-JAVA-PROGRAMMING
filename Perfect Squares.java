import java.util.Scanner;

class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = (int)Math.sqrt(n);

        if (r * r == n)
            System.out.println("Perfect Square");
        else
            System.out.println("Not Perfect Square");
    }
}
