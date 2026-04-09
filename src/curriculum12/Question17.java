package curriculum12;

public class Question17 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        String[][] ainputArray = {{\"123\", \"abc\"}, {\"456\", \"789\"}, {\"12a\", \"345\"}};\n" +
                "        for (String[] row : ainputArray) {\n" +
                "            for (String val : row) {\n" +
                "                System.out.println(val);\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}\n");
    }

}
