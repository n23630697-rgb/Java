package curriculum14;

public class Question6 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        StringUtils utils = new StringUtils();\n" +
                "        boolean result = utils.isEmpty(\"\");\n" +
                "        System.out.println(result);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "class StringUtils {\n" +
                "    public boolean isEmpty(String input) {\n" +
                "        return input == null || input.isEmpty();\n" +
                "    }\n" +
                "}\n");
    }
}
