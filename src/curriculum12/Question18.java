package curriculum12;

public class Question18 {
    public static void main(String[] args){
        System.out.println("import java.util.ArrayList;\n" +
                "import java.util.List;\n" +
                "\n" +
                "public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        String[][] ainputArray = {\n" +
                "            {\"test@example.com\", \"123\"},\n" +
                "            {\"user@domain.com\", \"not-email\"},\n" +
                "            {\"admin@company.com\", \"example\"}\n" +
                "        };\n" +
                "        String regex = \"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$\";\n" +
                "        List<String[]> resultList = new ArrayList<>();\n" +
                "\n" +
                "        for (String[] row : ainputArray) {\n" +
                "            List<String> matches = new ArrayList<>();\n" +
                "            for (String val : row) {\n" +
                "                if (val.matches(regex)) {\n" +
                "                    matches.add(val);\n" +
                "                }\n" +
                "            }\n" +
                "            if (!matches.isEmpty()) {\n" +
                "                resultList.add(matches.toArray(new String[0]));\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        String[][] newArray = resultList.toArray(new String[0][]);\n" +
                "        for (String[] row : newArray) {\n" +
                "            for (String val : row) {\n" +
                "                System.out.println(val);\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}\n");
    }

}
