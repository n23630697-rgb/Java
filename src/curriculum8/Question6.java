package curriculum8;

public class Question6 {
    public static void main(String[] args){
        System.out.println("public class BankAccount {\n" +
                "    private double balance;\n" +
                "\n" +
                "    public double getBalance() {\n" +
                "        return balance;\n" +
                "    }\n" +
                "\n" +
                "    public void deposit(double amount) {\n" +
                "        if (amount > 0) {\n" +
                "            balance += amount;\n" +
                "        } else {\n" +
                "            System.out.println(\"エラー：0より大きい金額を入力してください。\");\n" +
                "        }\n" +
                "    }\n" +
                "}\n");
    }
}

