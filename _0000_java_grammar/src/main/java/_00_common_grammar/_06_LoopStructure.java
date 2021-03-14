package _00_common_grammar;

public class _06_LoopStructure {
    public static void main(String[] args) {
        /**
         * for循环
         */
        for (int i = 0; i <= 100; ++i) {
            System.out.println("for: 第" + i + "次输出");
        }

        /**
         * while循环语句
         */
        int i = 1;
        while (i <= 100) {
            System.out.println("while: 第" + i + "次输出");
            i++;
        }

        /**
         * do while循环
         */
        int j = 1;
        do {
            System.out.println("do while: 第" + j + "次输出");
            j++;
        } while (j <= 100);
    }
}
