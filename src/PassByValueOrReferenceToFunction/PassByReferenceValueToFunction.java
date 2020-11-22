package PassByValueOrReferenceToFunction;

import java.util.ArrayList;
import java.util.List;

public class PassByReferenceValueToFunction {
    // javaでは参照型は参照値の値渡しをしていることを確認するmainメソッド
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("編集前っす");

        editList(list);

        // もし、参照渡しであれば、ここも[編集加えました]と表示されるがそうではない。
        System.out.println(list);
    }


    static void editList(List<String> list) {

        list = new ArrayList<>();

        list.add("編集加えました");

        System.out.println(list);
    }
}
