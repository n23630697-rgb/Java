package curriculum11;

public class Question14 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        int sum = 0;\n" +
                "        for (int i = 1; i <= 100; i++) {\n" +
                "            if (i % 2 == 0 || i % 3 == 0) {\n" +
                "                sum += i;\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(sum);\n" +
                "    }\n" +
                "}\n");
    }
}
