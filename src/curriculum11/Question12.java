package curriculum11;

public class Question12 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        int evenSum = 0;\n" +
                "        int oddSum = 0;\n" +
                "        for (int i = 10; i <= 50; i++) {\n" +
                "            if (i % 2 == 0) {\n" +
                "                evenSum += i;\n" +
                "            } else {\n" +
                "                oddSum += i;\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(evenSum);\n" +
                "        System.out.println(oddSum);\n" +
                "    }\n" +
                "}\n");
    }

}
