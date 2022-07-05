package Lesson11_computer;
import java.util.Arrays;
public class Computer {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        Computer comp1 = new Computer();
        computers[0] = comp1;
        Computer comp2 = new Computer();
        computers[1] = comp2;
        Computer comp3 = new Computer();
        computers[2] = comp3;
        Computer comp4 = new Computer();
        computers[3] = comp4;
        Computer comp5 = new Computer();
        computers[4] = comp5;
        System.out.println (Arrays.toString(computers));
    }
}

