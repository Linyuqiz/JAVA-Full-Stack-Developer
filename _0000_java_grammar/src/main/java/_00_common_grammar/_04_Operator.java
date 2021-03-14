package _00_common_grammar;

public class _04_Operator {
    public static void main(String[] args) {
        /**
         * 1. 算数运算符：+ - * / % ++ --
         * 2. 赋值运算符：=
         * 3. 扩展赋值运算符：+= -= *= /= %=
         * 4. 关系运算符：> >= < <= == !=
         * 5. 逻辑运算符：&&(短路与) ||(短路或) !
         * 6. 位运算符：& | ^ ~ << >> >>>
         * 7. 条件运算符：() ? : ;
         */
        int a = 1;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(++a+b++);

    }
}
