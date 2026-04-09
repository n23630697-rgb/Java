package curriculum12;

public class Question7 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        String input = \"090-1234-5678\";\n" +
                "        String regex = \"^[0-9]{3}-[0-9]{4}-[0-9]{4}$\";\n" +
                "        System.out.println(input.matches(regex));\n" +
                "    }\n" +
                "}\n");
    }

}
