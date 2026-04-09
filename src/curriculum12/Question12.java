package curriculum12;

public class Question12 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        String input = \"https://www.example.com\";\n" +
                "        String regex = \"^https?://[a-zA-Z0-9.-]+\\\\.(com|net|org|jp)$\";\n" +
                "        System.out.println(input.matches(regex));\n" +
                "    }\n" +
                "}\n");
    }

}
