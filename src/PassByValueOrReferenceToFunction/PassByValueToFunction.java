package PassByValueOrReferenceToFunction;

public class PassByValueToFunction {

    public static void main(String[] args) {
        int value = 1;

        addNumber(value);

        System.out.println(String.format("main関数でvalueの値を出力します。値は%sです。", value));
    }


    private static void addNumber(int value) {
        value = value + 1;

        System.out.println(String.format("addNumberメソッド内でvalueに1足しました。値は%sです", value));
    }
}
