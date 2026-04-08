package curriculum7;

public class Question2 {
    public static void main(String[] args) {
        try {
            // 例外が発生する可能性のある処理を try ブロックで囲みます
            String text = null;
            System.out.println(text.length());
        } catch (Exception e) {
            // 例外が発生した時の処理を catch ブロックに書きます
            System.out.println("例外が発生しました");
        }
    }
}

