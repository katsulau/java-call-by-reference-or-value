package passValue;

public class PassValueIfChange {

    public static void main(String[] args) {

        // 代入した後に変数を書き換えた場合どうなるのか確認

        /* 値型の場合 */

        int num1 = 1;

        int num2 = num1;

        System.out.println(num2); // 1


        num2 = 2;

        System.out.println(num1); // 1
        System.out.println(num2); // 2


        /* 参照型の場合 */
        int[] arr1 = {1, 2, 3};

        int[] arr2 = arr1;

        arr2[0] = 7;

        // arr1の値出力
        System.out.println(arr1[0]); // 7
        System.out.println(arr1[1]); // 2
        System.out.println(arr1[2]); // 3

        // arr2の値出力
        System.out.println(arr1[0]); // 7
        System.out.println(arr1[1]); // 2
        System.out.println(arr1[2]); // 3
    }
}
