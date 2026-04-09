package curriculum12;

public class Question5 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        String input = \"1234567812345678\";\n" +
                "        String regex = \"^[0-9]{16}$\";\n" +
                "        System.out.println(input.matches(regex));\n" +
                "    }\n" +
                "}\n");
    }

}
