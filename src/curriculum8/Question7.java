package curriculum8;

public class Question7 {
    public static void main(String[] args){
        System.out.println("public class Person {\n" +
                "    private int age;\n" +
                "\n" +
                "    public void setAge(int age) {\n" +
                "        if (age < 18) {\n" +
                "            throw new IllegalArgumentException(\"18歳未満は許可されていません。\");\n" +
                "        }\n" +
                "        this.age = age;\n" +
                "    }\n" +
                "}\n");
    }
}
