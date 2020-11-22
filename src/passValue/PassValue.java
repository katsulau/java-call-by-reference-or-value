package passValue;

public class PassValue {
    public static void main(String[] args) {

        /* 値型（プリミティブ型）の場合 */

        int num1 = 1;

        int num2 = num1;

        System.out.println(num2); // 1

        /* 参照型の場合 */

        int[] arr1 = {1, 2, 3};

        int[] arr2 = arr1;

        System.out.println(arr2[0]); // 1
        System.out.println(arr2[1]); // 2
        System.out.println(arr2[2]); // 3
    }
}
