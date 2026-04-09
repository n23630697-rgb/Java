package curriculum12;

public class Question10 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        String input = \"12345abc\";\n" +
                "        String regex = \"^[0-9]{5}.*$\";\n" +
                "        System.out.println(input.matches(regex));\n" +
                "    }\n" +
                "}\n");
    }
}
