package Cuestion7;

public class Question7 {
    public static void main(String[] args){
        System.out.println("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        try {\n" +
                "            String text = null;\n" +
                "            System.out.println(text.length());\n" +
                "\n" +
                "            int[] numbers = {1, 2, 3};\n" +
                "            System.out.println(numbers[5]);\n" +
                "\n" +
                "        } catch (NullPointerException e) {\n" +
                "            System.out.println(\"エラー：変数がnullのため、操作を完了できません。\");\n" +
                "\n" +
                "        } catch (ArrayIndexOutOfBoundsException e) {\n" +
                "            System.out.println(\"エラー：配列のインデックスが範囲外です。\");\n" +
                "\n" +
                "        } catch (Exception e) {\n" +
                "            System.out.println(\"予期せぬエラーが発生しました: \" + e.getMessage());\n" +
                "        }\n" +
                "    }\n" +
                "}\n");
    }
}

