import java.util.Scanner;

class Ransom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String note = sc.next();
        String magazine = sc.next();

        int[] a = new int[26];

        for (char c : magazine.toCharArray())
            a[c - 'a']++;

        boolean ok = true;

        for (char c : note.toCharArray()) {
            if (a[c - 'a'] == 0) {
                ok = false;
                break;
            }
            a[c - 'a']--;
        }

        System.out.println(ok ? "Possible" : "Not Possible");
    }
}
