package _01_object_oriented;

public class _01_VariableType {

    /**
     * 成员变量：有默认值
     */
    private static final int number = 100;

    public void show() {
        /**
         * 局部变量：无默认值
         */
        int a = 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        _01_VariableType variableType = new _01_VariableType();
        variableType.show();

        //静态变量通过类名直接调用
        System.out.println(_01_VariableType.number);
    }
}
