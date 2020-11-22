package stringSample;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {
    public static void main(String[] args) {

        List<String> sampleList = new ArrayList<>();

        // これを動かすとOutOfMemoryErrorが出る。
        for (int count = 0; count < 100000000; count++) {
            String hogehoge = new String("a");
            sampleList.add(hogehoge);
        }


        // こっちだとOutOfMemoryErrorが出ない
        for (int count = 0; count < 100000000; count++) {
            String hogehoge = "a";
            sampleList.add(hogehoge);
        }
        System.out.println("処理に成功しました");
    }
}
