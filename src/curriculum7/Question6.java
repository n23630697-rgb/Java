package curriculum7;

public class Question6 {
    public static void main(String[] args) {
        try {
            // 例外が発生する可能性のある処理
            int result = 10 / 0;
            System.out.println("結果: " + result);

        } catch (Exception e) {
            // 例外が発生した場合に実行される
            System.out.println("エラーが発生しました");

        } finally {
            // 例外の有無にかかわらず、最後に必ず実行される
            System.out.println("プログラム終了");
        }
    }
}

