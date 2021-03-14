package _00_common_grammar;

public class _01_IdentifyName {
    public static void main(String[] args) {
        /**
         * 1. 必须以字母、下划线或美元符号开头
         * 2. 其他部分不限，但不能是特殊符号
         * 3. 大小写敏感，不能是Java的关键字或保留字
         * 4. 驼峰标识：类名首字母大写、方法和变量首字母小写
         * 5. 见名知义：通过标识符的名称能知道代表的含义
         */
        int _a = 10;
        int $b = 20;
        int a = 10;
        int getValue = 12;

    }
}
