package Lesson10;

public class Lesson11_1 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Leo");
        human1.getInfo();
    }
}
    class Human{
        String name;
        int age;

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public int getAge() {
            return age;
        }
        public void getInfo(){
            System.out.println(name+","+age);
        }
    }


