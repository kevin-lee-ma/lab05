package sol;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
    public static void main(String[] args) {
        System.out.println(regexifier("hithere 1234 goodjob 789you23456", "\\d+"));
    }
    public static String regexifier(String str, String regex) {
        if (str == null | regex == null) {
            return "";
        }
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        String s = "";
        while (m.find()) {
            s += m.group() + " ";
        }
        s = s.trim();
        return s;
    }

    /**
     * Finds brown.edu email addresses that are separated by word boundaries.
     * @param str - String in which to search for emails
     * @return a String with emails separated by a space between each
     */
    public static String brownEmails(String str) {
        if (str == null) {
            return "";
        }
        return regexifier(str, "[a-z0-9_-]+\\w*\\d*@brown\\.edu\\b");
    }

}
