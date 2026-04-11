package curriculum14;

public class Question7 {
    public static void main(String[] args){
        System.out.println("import static org.junit.jupiter.api.Assertions.*;\n" +
                "import org.junit.jupiter.api.Test;\n" +
                "\n" +
                "public class StringUtilsTest {\n" +
                "    @Test\n" +
                "    void testGetLength() {\n" +
                "        StringUtils utils = new StringUtils();\n" +
                "        assertEquals(5, utils.getLength(\"hello\"));\n" +
                "        assertEquals(0, utils.getLength(\"\"));\n" +
                "        assertEquals(3, utils.getLength(\"ABC\"));\n" +
                "    }\n" +
                "}\n");
    }
}
