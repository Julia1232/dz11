package Lesson11_1;

public class Test1 {
    public static void main(String[] args) {
        Autor autor = new Autor();
        Title title = new Title();
        Content content = new Content();

        Test1 t = new Test1();
        t.result(autor);
        t.result(title);
        t.result(content);
    }

    public void result(BookMain a) {
        a.show();
    }
}

