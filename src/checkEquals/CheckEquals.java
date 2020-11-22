package checkEquals;

import java.util.Arrays;

public class CheckEquals {
    public static void main(String[] args) {

        /* 値型 */
        int value1 = 1;

        int value2 = 1;

        // プリミティブ値の比較は、==を使う
        if (value1 == value2) {
            System.out.println("value1とvalue2の値は同じです。");
        }

        // equalsを使おうとした場合、そもそもプリミティブ値にequalsメソッドはないので比較できない。
//        if (value1.equals(value2)) {
//
//        }


        /* 参照型 */
        int[] array1 = {1, 2, 3};

        int[] array2 = {1, 2, 3};

        // ==を使う場合
        // 別のインスタンスなので、参照値は違う
        if (array1 == array2) {
            System.out.println("参照値が等しいです");
        } else {
            System.out.println("参照値が同じではないです");
        }

        // equalsを使う場合
        if (Arrays.equals(array1, array2)) {
            System.out.println("ヒープ領域の値を比較するので、等しいです");
        }
    }
}
