package curriculum14;

public class Question3 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        StringUtils utils = new StringUtils();\n" +
                "        String result = utils.toUpperCase(\"hello\");\n" +
                "        System.out.println(result);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "class StringUtils {\n" +
                "    public String toUpperCase(String input) {\n" +
                "        return input.toUpperCase();\n" +
                "    }\n" +
                "}\n");
    }

}
