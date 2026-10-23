import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word 1 ");
        String word1 = sc.nextLine();

        System.out.print("Enter word 2 ");
        String word2 = sc.nextLine();

        char[] a = word1.toLowerCase().toCharArray();
        char[] b = word2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("words are anagram");
        } else {
            System.out.println("words are not anagram");
        }

    }
}
