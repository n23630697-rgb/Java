package curriculum14;

public class Question1 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        Calculator calc = new Calculator();\n" +
                "        int result = calc.add(5, 3);\n" +
                "        System.out.println(result);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "class Calculator {\n" +
                "    public int add(int a, int b) {\n" +
                "        return a + b;\n" +
                "    }\n" +
                "}\n");
    }

}
