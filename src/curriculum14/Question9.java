package curriculum14;

public class Question9 {
    public static void main(String[] args){
        System.out.println("import static org.junit.jupiter.api.Assertions.*;\n" +
                "import org.junit.jupiter.api.Test;\n" +
                "\n" +
                "public class StringUtilsTest {\n" +
                "    @Test\n" +
                "    void testContainsChar() {\n" +
                "        StringUtils utils = new StringUtils();\n" +
                "        assertTrue(utils.containsChar(\"apple\", 'a'));\n" +
                "        assertFalse(utils.containsChar(\"apple\", 'z'));\n" +
                "        assertFalse(utils.containsChar(\"\", 'a'));\n" +
                "    }\n" +
                "}\n");
    }

}
