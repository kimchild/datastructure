package linked;

/**
 * test2
 *
 * @author ckkim on 2018-03-27
 */
public class test2 {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addFirst(20);
        numbers.addFirst(10);
        numbers.addLast(30);

        System.out.println(numbers.node(0));
        System.out.println(numbers.node(1));
        System.out.println(numbers.node(2));
        System.out.println(numbers);
        System.out.println(numbers.removeFirst());
        System.out.println(numbers);
        numbers.add(0, 1);
        numbers.add(1, 2);
        numbers.add(2, 3);
        System.out.println(numbers);
        System.out.println(numbers.remove(1));
        System.out.println(numbers.remove(3));
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));
        System.out.println(numbers.indexOf(20));

        numbers.addFirst(0);
        numbers.addLast(30);
        LinkedList.ListIterator it = numbers.listIterator();
        while(it.hasNext()) {
            if((int)it.next() == 20)
                it.add(25);
        }
        System.out.println(numbers);
        it = numbers.listIterator();
        while(it.hasNext()) {
            if((int)it.next() == 3)
                it.remove();
        }
        System.out.println(numbers);


    }
}
