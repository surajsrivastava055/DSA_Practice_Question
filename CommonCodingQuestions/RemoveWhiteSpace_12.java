package CommonCodingQuestions;

public class RemoveWhiteSpace_12 {

    public static void removeWhiteSpace(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = " Hi I am gyan   chandra  shrivastava I am I   ";
        removeWhiteSpace(str);
    }

}
