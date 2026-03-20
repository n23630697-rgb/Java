package curriculum8;

public class Question8 {
    public static void main(String[] args){
        System.out.println("public class Product {\n" +
                "    private double price;\n" +
                "\n" +
                "    public double getPrice() {\n" +
                "        return price;\n" +
                "    }\n" +
                "\n" +
                "    public void setPrice(double price) {\n" +
                "        if (price >= 0) {\n" +
                "            this.price = price;\n" +
                "        }\n" +
                "    }\n" +
                "}\n");
    }
}

