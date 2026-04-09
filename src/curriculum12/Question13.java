package curriculum12;

public class Question13 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        String input = \"123456789X\";\n" +
                "        String regex = \"^[0-9]{9}[0-9X]$\";\n" +
                "        System.out.println(input.matches(regex));\n" +
                "    }\n" +
                "}\n");
    }

}
