import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorExample {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(100);
        a1.add(100);
        a1.add("pw");
        a1.add(1.1);
        a1.add("L");
//Using Iterator to traverse forward
        Iterator itr = a1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

    }
//Using ListIterator to traverse backward
        ListIterator itr1 = a1.listIterator(a1.size());
        while (itr1.hasPrevious()){
            System.out.println(itr1.previous());
        }
}
}
