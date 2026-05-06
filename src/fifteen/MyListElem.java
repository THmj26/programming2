package fifteen;

public class MyListElem <E> { // the usual elements to make linked lists

    public E value;
    public MyListElem<E> next = null;

    MyListElem (E value) {
        this.value = value;
    }
}
