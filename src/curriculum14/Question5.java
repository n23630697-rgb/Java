package curriculum14;

public class Question5 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        ArrayUtils utils = new ArrayUtils();\n" +
                "        int[] numbers = {5, 2, 8, 1, 9};\n" +
                "        int result = utils.findMin(numbers);\n" +
                "        System.out.println(result);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "class ArrayUtils {\n" +
                "    public int findMin(int[] array) {\n" +
                "        int min = array[0];\n" +
                "        for (int num : array) {\n" +
                "            if (num < min) {\n" +
                "                min = num;\n" +
                "            }\n" +
                "        }\n" +
                "        return min;\n" +
                "    }\n" +
                "}\n");
    }
}
