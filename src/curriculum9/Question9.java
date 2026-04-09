package curriculum9;

public class Question9 {
    public static void main(String[] args){
        System.out.println("class Shape {\n" +
                "    String color;\n" +
                "}\n" +
                "\n" +
                "class Circle extends Shape {\n" +
                "    double radius;\n" +
                "\n" +
                "    double calculateArea() {\n" +
                "        return Math.PI * radius * radius;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        Circle circle = new Circle();\n" +
                "        circle.radius = 5.0;\n" +
                "        System.out.println(circle.calculateArea());\n" +
                "    }\n" +
                "}\n");
    }
}

