
public class PalindromeWord {

    public static void main(String... args) {
        System.out.println(palindromeWord("asa"));
    }

    static boolean palindromeWord(String word) {
        return word.toLowerCase().replaceAll("[^a-z]", "")
                .equals(new StringBuilder(word.toLowerCase()).reverse()
                        .toString().replaceAll("[^a-z]", ""));
    }
}