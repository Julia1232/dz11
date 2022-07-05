package Lesson10;

public class Lesson11_2 {
    public static void main(String[] args) {
        Man man = new Man("Georg", 50);
    }
}
class Man {
    private String name;
    private int age;

    public Man() {
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Man(String name) {
        System.out.println("второй конструктор");
        this.name = name;
    }

    public Man(String name, int age) {
        System.out.println("третий конструктор");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setage(int agw) {
        this.age = age;
    }

}
