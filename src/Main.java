import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Character> piligrim = new LinkedList<>() ;
        piligrim.add('1');
        piligrim.add('2');
        piligrim.add('3');
        piligrim.add('4');
        piligrim.add('5');
        Reworker reworker = new Reworker();
//        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//        System.out.println(reworker.rework(piligrim));

//        Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди,
//        не удаляя.
//        System.out.println(reworker.enqueue(piligrim, 'j'));
//        System.out.println(reworker.dequeue(piligrim));
//        System.out.println(reworker.first(piligrim));

        //    Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
        System.out.println(reworker.summList(piligrim));

    }
}