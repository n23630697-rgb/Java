package curriculum9;

public class Question7 {
    public static void main(String[] args){
        System.out.println("class Animal {\n" +
                "    String name;\n" +
                "\n" +
                "    void eat() {\n" +
                "        System.out.println(name + \" is eating.\");\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "class Cat extends Animal {\n" +
                "    void meow() {\n" +
                "        System.out.println(\"Meow!\");\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        Cat cat = new Cat();\n" +
                "        cat.meow();\n" +
                "    }\n" +
                "}\n");
    }
}
