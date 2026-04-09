package curriculum12;

public class Question16 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        String[][] array = {{\"Hello\", \"World\"}, {\"Java\", \"Regex\"}};\n" +
                "        for (String[] row : array) {\n" +
                "            for (String element : row) {\n" +
                "                System.out.println(element);\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}\n");
    }

}
