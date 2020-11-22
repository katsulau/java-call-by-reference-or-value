package PassByValueOrReferenceToFunction;

import java.util.ArrayList;
import java.util.List;

public class PassByReferenceToFunction {


    // Javaでは正確には参照渡しは存在しないが、参照渡しっぽく動くため便宜上参照渡しとして説明。
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hola");

        editList(list);

        System.out.println("main関数で呼び出しているリストの中身は" + list);
    }

    private static void editList(List<String> list) {
        list.add("こんにちは");

        System.out.println("editListメソッド内で呼び出しているリストの中身は" + list);
    }
}
