package task_2;

import java.util.ArrayList;
import java.util.List;

public class MyList <T>{
    List<T> list = new ArrayList<T>();


    public List<T> getList() {
        return list;
    }

    public void addElement(T element) {
        list.add(element);
    }

    public T getElementByIndex(int index) {
        return list.get(index);
    }

    public int numberOfElements() {
        return list.size();
    }

    public static void main(String[] args) {
        MyList<String> listFirst = new MyList<>();
        listFirst.addElement("winter");
        listFirst.addElement("spring");
        listFirst.addElement("summer");
        listFirst.addElement("autumn");

        System.out.println(listFirst.getList());
        System.out.println("Number of elements: " + listFirst.numberOfElements());
        System.out.println("First element: " + listFirst.getElementByIndex(0));
        System.out.println("Third element: " + listFirst.getElementByIndex(2));

        MyList<Integer> listSecond = new MyList<>();
        listSecond.addElement(25);
        listSecond.addElement(10);
        listSecond.addElement(81);

        System.out.println();
        System.out.println(listSecond.getList());
        System.out.println("Number of elements: " + listSecond.numberOfElements());
        System.out.println("First element: " + listSecond.getElementByIndex(0));
        System.out.println("Second element: " + listSecond.getElementByIndex(1));
    }


}
