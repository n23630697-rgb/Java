package curriculum7;

public class Question9 {
    public static void main(String[] args) {
        // """ で囲むことで、中のコードをそのまま文字列として扱えます
        System.out.println("""
public class Main {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());

            int[] numbers = {1, 2, 3};
            System.out.println(numbers);

        } catch (NullPointerException e) {
            System.out.println("エラー：変数がnullのため、操作を完了できません。");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー：配列のインデックスが範囲外です。");

        } catch (Exception e) {
            System.out.println("予期せぬエラーが発生しました: " + e.getMessage());
        }
    }
}
""");
    }
}


