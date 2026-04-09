package curriculum12;

public class Question3 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        String input = \"test@example.com\";\n" +
                "        String regex = \"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$\";\n" +
                "        System.out.println(input.matches(regex));\n" +
                "    }\n" +
                "}\n");
    }

}
