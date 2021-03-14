package _00_common_grammar;

import java.util.Scanner;

public class _05_BranchStructure {
    public static void main(String[] args) {
        /**
         * if分支语句
         * Math.random() 可以获得[0, 1)之间的double数值
         */
        int i = (int) (Math.random() * 6);
        if (i > 3) {
            System.out.println("数值大于3");
        } else if (i == 3) {
            System.out.println("数值等于3");
        } else {
            System.out.println("数值小于3");
        }
        System.out.println("数值为：" + i);

        /**
         * switch分支语句
         * 创建控制台标准输入的文件扫描器（装饰者模式）
         * Scanner sc = new Scanner(System.in);
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要抽取的签(1～3)：");
        int mark = sc.nextInt();
        switch (mark) {
            case 1:
                System.out.println("上上签！");
                break;
            case 2:
                System.out.println("最近没有什么大事情！");
                break;
            case 3:
                System.out.println("下下签！");
                break;
            default:
                System.out.println("输入有错误，请重新输入");

        }
    }
}
