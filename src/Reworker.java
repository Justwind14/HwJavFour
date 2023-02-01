import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

public class Reworker {
    private LinkedList<Object> haha;

    Reworker() {
        haha = new LinkedList();
    }


    public LinkedList<Character>  rework (LinkedList<Character> haha){
        ListIterator<Character> replace = haha.listIterator();
        LinkedList<Character> haha2 = new LinkedList<>();
        while (replace.hasNext()) {
            haha2.addFirst(replace.next());
        }
        return haha2;
    }

    public LinkedList<Character>  enqueue (LinkedList<Character> haha, Character some) {
        haha.add(some);
        return haha;
    }

    public char  dequeue (LinkedList<Character> haha) {
        char any = haha.getFirst();
        haha.remove(0);
        System.out.println(haha);
        return any;
    }

    public char  first (LinkedList<Character> haha) {
        char any = haha.getFirst();
        System.out.println(haha);
        return any;
    }

    public int  summList (LinkedList<Character> haha) {
        ListIterator<Character> iter = haha.listIterator();
        int summ = 0;
        while (iter.hasNext()) {
            summ += Integer.parseInt(String.valueOf(iter.next()));
        }
        return summ;
    }


}
