package curriculum12;

public class Question4 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        String input = \"1234567\";\n" +
                "        String regex = \"^([0-9]{5}|[0-9]{7})$\";\n" +
                "        System.out.println(input.matches(regex));\n" +
                "    }\n" +
                "}\n");
    }

}
