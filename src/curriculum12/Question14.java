package curriculum12;

public class Question14 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        String input = \"Example123!\";\n" +
                "        String regex = \"^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$\";\n" +
                "        System.out.println(input.matches(regex));\n" +
                "    }\n" +
                "}\n");
    }

}
