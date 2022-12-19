package task_5;

public class MyClass <T> {

    public static <T> T factoryMethod(T obj) {
        return obj;
    }
}

class MainApp {
    public static void main(String[] args) {

        System.out.println(MyClass.factoryMethod("my first factory method"));
        System.out.println(MyClass.factoryMethod(0.57));
        System.out.println(MyClass.factoryMethod(88989999900L));
    }

}
