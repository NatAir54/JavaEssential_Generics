package task_5;

public class MyClass <T>{


    public static <T> void factoryMethod(T obj){

        System.out.println(obj);
    }


    public static void main(String[] args) {

        factoryMethod(new String("my first factory method"));
    }
}
