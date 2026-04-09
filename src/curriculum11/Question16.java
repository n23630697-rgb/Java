package curriculum11;

public class Question16 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        int[] numbers = {2, 5, 8, 11, 14, 17, 20};\n" +
                "        int sum = 0;\n" +
                "        for (int num : numbers) {\n" +
                "            if (num % 2 != 0) {\n" +
                "                sum += num;\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(sum);\n" +
                "    }\n" +
                "}\n");
    }

}
