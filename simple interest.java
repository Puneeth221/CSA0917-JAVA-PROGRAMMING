import java.util.Scanner;

class Interest {
    double p, r, t, si;

    void calculate() {
        si = (p * r * t) / 100;
    }

    void display() {
        System.out.println("Simple Interest = " + si);
    }
}

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Interest obj = new Interest();

        obj.p = sc.nextDouble();
        obj.r = sc.nextDouble();
        obj.t = sc.nextDouble();

        obj.calculate();
        obj.display();
    }
}
