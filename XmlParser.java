import java.util.Stack;

public class XmlParser
{
    public static void main(String[] args)
    {

        // format the string to xml
        System.out.println(xmlParser("<a><b><c><d>MyText</d></c>AnotherText</b>Final</a>"));

    }

    private static String xmlParser(String s) {
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack();
        for (int i = 0; i < s.length();) {
            String temp = "";
            int j = 1;
            int r;
            if (s.charAt(i) == '<') {
                r = (s.substring(i)).indexOf('>');
                temp = s.substring(i, i + r + 1);
                if (temp.contains("/")) {
                    stack.pop();
                    j--;
                } else {
                    stack.add(temp);
                }
                i += r + 1;
            } else {
                r = s.substring(i).indexOf('<');
                temp = s.substring(i, i + r);
                i += r;
            }
            sb.append(temp);
            sb.append("\n");
        }
        return sb.toString();
    }
}
