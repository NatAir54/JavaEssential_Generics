package task_5;

public class MyClass <T>{


    public static <T> T factoryMethod(T obj){

        return obj;
    }

    public static void main(String[] args) {

        System.out.println(factoryMethod(new String("my first factory method")));
    }

}
