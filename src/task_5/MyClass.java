package task_5;


public class MyClass <T> {
    public T field;

    public MyClass(T field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "MyClass {" +
                "field: " + field +
                '}';
    }

    public static <T> MyClass<T> factoryMethod(T obj) {
        return new MyClass<>(obj);
    }
}

class MainApp {
    public static void main(String[] args) {
        System.out.println(MyClass.factoryMethod("my first factory method"));
        System.out.println(MyClass.factoryMethod(0.57));
        System.out.println(MyClass.factoryMethod(88989999900L));
    }

}
