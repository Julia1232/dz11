public class Rectangle {
    public static void main(String[] args) {
        int doubleSidel = 6;
        int doubleSidel2 = 10;
        int a = doubleAriaCalculator(doubleSidel, doubleSidel2);
        int b = doubleperimeterCalculator(doubleSidel, doubleSidel2);
        System.out.println("Периметр "+ a);
        System.out.println("Площаль "+ b);
    }
    public static int doubleAriaCalculator (int doubleSidel, int doubleSidel2){
    int doubleAriaCalculator;
        doubleAriaCalculator=doubleSidel + doubleSidel2;
        return doubleAriaCalculator;
    }
    public static int doubleperimeterCalculator (int doubleSidel, int doubleSidel2){
        int doubleperimeterCalculator;
        doubleperimeterCalculator=doubleSidel *doubleSidel2;
        return doubleperimeterCalculator;
    }
}


