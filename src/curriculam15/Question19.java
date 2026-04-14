package curriculam15;

public class Question19 {
    public static void main(String[] args){
        System.out.println("<project xmlns=\"http://apache.org\" \n" +
                "         xmlns:xsi=\"http://w3.org\"\n" +
                "         xsi:schemaLocation=\"http://apache.org http://apache.org\">\n" +
                "    <modelVersion>4.0.0</modelVersion>\n" +
                "\n" +
                "    <groupId>example</groupId>\n" +
                "    <artifactId>hello</artifactId>\n" +
                "    <version>1.0.0</version>\n" +
                "\n" +
                "    <dependencies>\n" +

                "        <dependency>\n" +
                "            <groupId>org.projectlombok</groupId>\n" +
                "            <artifactId>lombok</artifactId>\n" +
                "            <optional>true</optional>\n" +
                "        </dependency>\n" +
                "        <dependency>\n" +
                "            <groupId>org.webjars</groupId>\n" +
                "            <artifactId>bootstrap</artifactId>\n" +
                "            <version>4.5.3</version>\n" +
                "        </dependency>\n" +
                "    </dependencies>\n" +
                "</project>\n");
    }

}
