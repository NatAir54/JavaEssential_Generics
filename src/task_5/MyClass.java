package task_5;

public class MyClass <T> {

    public static <T> T factoryMethod(T obj) {
        return obj;
    }
}

class MainApp {
    public static void main(String[] args) {
        System.out.println(MyClass.factoryMethod(new String("my first factory method")));
    }

}
