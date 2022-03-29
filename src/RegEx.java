import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String text = "HI my name is Umang Sharma" + "\n" + " HI my name is Jay Dev" + "\n" + "HI my name is Sumit pal";
        String delimters = "\\w+\\w\\s+\\w+\\w+\\s+\\w+\\w+\\s+\\w+\\s(\\w+\\s+\\w+)";

        Pattern pattern = Pattern.compile(delimters);
        MatchResult matcher
                = pattern
                .matcher(text);

        while (((Matcher) matcher).find()) {
            // Get the group matched using group() method
            System.out.println(matcher.group(1));


        }
    }
}
