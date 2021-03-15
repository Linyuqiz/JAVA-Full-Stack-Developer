package _01_object_oriented;

public class _00_Student {

    private int number;
    private String name;

    public _00_Student() {
    }

    public _00_Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "_00_Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
