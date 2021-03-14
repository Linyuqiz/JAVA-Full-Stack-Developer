package _00_common_grammar;

public class _07_Recursion {
    public static void main(String[] args) {
        /**
         * 递归：程序调用自身程序
         * 注意：递归会加大资源消耗，尽量不要使用
         */
        for (int i = 1; i <= 10; i++) {
            System.out.print(getNumber(i) + "\t");
        }
    }

    /**
     * 斐波那契数列
     *
     * @param number 第几个数字
     * @return 整型
     */
    public static int getNumber(int number) {
        if (number == 1 || number == 2) {
            return 1;
        } else {
            return getNumber(number - 1) + getNumber(number - 2);
        }
    }
}
