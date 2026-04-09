package curriculum11;

public class Question19 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        int n1 = 0, n2 = 1;\n" +
                "        for (int i = 0; i < 10; i++) {\n" +
                "            System.out.print(n1 + (i < 9 ? \", \" : \"\"));\n" +
                "            int next = n1 + n2;\n" +
                "            n1 = n2;\n" +
                "            n2 = next;\n" +
                "        }\n" +
                "    }\n" +
                "}\n");
    }

}
