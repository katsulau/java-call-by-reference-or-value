package stringSample;

public class StringSample {

    public static void main(String[] args) {
        String str1 = "おはよう";


        // 参照値をコピー
        String str2 = str1;

        // この段階では、当然同じ参照値が格納されており、実際の値はおはようとなる。
        System.out.println(str1);
        System.out.println(str2);

        if (str1 == str2) {
            System.out.println("スタック領域にある参照値が同じです");
        }

        // スタック領域に別の参照値が設けられ、ヒープ領域に"こんばんは"を格納する領域が確保される。
        str1 = "こんばんは";

        System.out.println(str1);
        System.out.println(str2);


        if (str1 != str2) {
            System.out.println("スタック領域にある参照値が違います");
        }



        String str3 = "こんばんは";

        // 同じ文字列の場合、元々ある参照値が再利用される。
        if (str3 == str1) {
            System.out.println("str3とstr1は同じ参照値となります。");
        }

        // しかし、new演算子をつけた場合、明示的に新しい参照を作成するという意味になる。

        String str4 = new String("こんばんは");

        if (str4 != str1 && str4.equals(str1)) {
            System.out.println("str4とstr1は実際の値は同じですが、参照値は違います。");
        }
    }
}
