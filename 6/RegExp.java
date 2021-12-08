public class RegExp {
    public static void main(String[] args) {
        String input = "17:33 pm";
        Pattern pattern =
                Pattern.compile("([1-9]|1[0-2])\\s*:\\s*([0-5][0-9])\\s*([ap]m)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            String hour = matcher.group(1); //17
            String minute = matcher.group(2); //33
            String period = matcher.group(3); //pm
        }

    }
}
