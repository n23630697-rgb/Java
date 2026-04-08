package curriculum7;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class Question10 {
    public static void main(String[] args) {
        System.out.println("""
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("カスタム例外が発生しました");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
""");
    }
}


