package curriculum14;

public class Question10 {
    public static void main(String[] args){
        System.out.println("import static org.junit.jupiter.api.Assertions.*;\n" +
                "import org.junit.jupiter.api.Test;\n" +
                "\n" +
                "public class ArrayUtilsTest {\n" +
                "    @Test\n" +
                "    void testContainsNumber() {\n" +
                "        ArrayUtils utils = new ArrayUtils();\n" +
                "        assertTrue(utils.containsNumber(new int[]{10, 20, 30}, 20));\n" +
                "        assertFalse(utils.containsNumber(new int[]{10, 20, 30}, 50));\n" +
                "        assertFalse(utils.containsNumber(new int[]{}, 1));\n" +
                "    }\n" +
                "}\n");
    }

}
