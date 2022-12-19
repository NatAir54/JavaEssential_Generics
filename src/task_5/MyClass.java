package task_5;

public class MyClass <T> {

    public static <T> void factoryMethod(T obj) {
        System.out.println(obj);
    }
}

class MainApp {
    public static void main(String[] args) {
        MyClass.factoryMethod(new String("my first factory method"));
    }

}
