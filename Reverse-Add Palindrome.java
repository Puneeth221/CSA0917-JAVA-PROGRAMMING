int n = 89;

while (true) {
    int temp = n, rev = 0;

    while (temp > 0) {
        rev = rev * 10 + temp % 10;
        temp /= 10;
    }

    n = n + rev;

    int x = n, r = 0;

    while (x > 0) {
        r = r * 10 + x % 10;
        x /= 10;
    }

    if (n == r) {
        System.out.println(n);
        break;
    }
}
