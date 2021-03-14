package _00_common_grammar;

public class _08_ArrayType {
    public static void main(String[] args) {
        /**
         * 1. 相同(必须)类型(基本和引用)的有顺序的集合
         * 2. 按照先后次序排列组合而成
         * 3. 一旦被创建，大小不可以改变
         * 4. 一连串的存储空间
         * 5. 标记从0开始的
         *
         * 使用方法：声明数组 分配空间 赋值 处理数据
         */
        int[] array;
        array = new int[5];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        System.out.println(array[0]);

        //数组的创建方式一
        int[] arr1 = new int[5];
        //数组的创建方式二
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        //数组的创建方式三
        int[] arr3 = {1, 2, 3, 4, 5};
    }
}
