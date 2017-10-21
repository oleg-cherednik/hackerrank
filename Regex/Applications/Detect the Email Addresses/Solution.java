import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Oleg Cherednik
 * @since 21.10.2017
 */
public class Solution {

    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        Pattern pattern = Pattern.compile("\\w+(?:\\.\\w+)*@\\w+(?:\\.\\w+)*");
        scan.nextLine();
        Set<String> emails = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            String str = scan.nextLine();
            Matcher matcher = pattern.matcher(str);

            while (matcher.find())
                emails.add(matcher.group());
        }

        boolean sep = false;

        for (String email : emails) {
            if (sep)
                System.out.print(';');
            System.out.print(email);
            sep = true;
        }

        scan.close();
    }
}
