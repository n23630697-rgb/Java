package curriculum14;

public class Question4 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        NumberUtils utils = new NumberUtils();\n" +
                "        boolean result = utils.isEven(10);\n" +
                "        System.out.println(result);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "class NumberUtils {\n" +
                "    public boolean isEven(int number) {\n" +
                "        return number % 2 == 0;\n" +
                "    }\n" +
                "}\n");
    }

}
