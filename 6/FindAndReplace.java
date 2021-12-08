public class FindAndReplace {
    public static void main(String[] args) {
        Map<String, String> replacements = new HashMap<String, String>();
        replacements.put("1", "один");
        replacements.put("2", "два");
        replacements.put("3", "три");
        String line ="12312313253235";
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("([1-3])");
        Matcher m = p.matcher(line);
        while (m.find()) {
            String repString = replacements.get(m.group(1));
            if (repString != null)
                m.appendReplacement(sb, repString);
        }
        m.appendTail(sb);

        System.out.println(sb.toString()); 
    }
}
