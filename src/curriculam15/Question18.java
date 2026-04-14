package curriculam15;

public class Question18 {
    public static void main(String[] args){
        System.out.println("<!-- 依存関係の設定 -->\n" +
                "<dependencies>\n" +
                "    <dependency>\n" +
                "        <groupId>junit</groupId>\n" +
                "        <artifactId>junit</artifactId>\n" +
                "        <version>4.11</version>\n" +
                "        <scope>test</scope>\n" +
                "    </dependency>\n" +
                "</dependencies>\n" +
                "\n" +
                "<!-- 拡張機能（プラグイン）の設定 -->\n" +
                "<build>\n" +
                "    <plugins>\n" +
                "        <plugin>\n" +
                "            <groupId>org.apache.maven.plugins</groupId>\n" +
                "            <artifactId>maven-clean-plugin</artifactId>\n" +
                "            <version>3.1.0</version>\n" +
                "        </plugin>\n" +
                "    </plugins>\n" +
                "</build>\n");
    }

}
