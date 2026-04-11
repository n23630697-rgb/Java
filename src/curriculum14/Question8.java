package curriculum14;

public class Question8 {
    public static void main(String[] args){
        System.out.println("import static org.junit.jupiter.api.Assertions.*;\n" +
                "import org.junit.jupiter.api.Test;\n" +
                "\n" +
                "public class ArrayUtilsTest {\n" +
                "    @Test\n" +
                "    void testIsArrayEmpty() {\n" +
                "        ArrayUtils utils = new ArrayUtils();\n" +
                "        assertTrue(utils.isArrayEmpty(null));\n" +
                "        assertTrue(utils.isArrayEmpty(new int[]{}));\n" +
                "        assertFalse(utils.isArrayEmpty(new int[]{1, 2, 3}));\n" +
                "    }\n" +
                "}\n");
    }

}
