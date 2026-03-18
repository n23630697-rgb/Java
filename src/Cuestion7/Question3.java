package Cuestion7;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("""
public class Main {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("例外が発生しました");
        }
    }
}
""");
    }
}


