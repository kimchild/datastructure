import java.util.LinkedList;
import java.util.ListIterator;

/**
 * test1
 *
 * @author ckkim on 2018-03-27
 */
public class test1 {

    public static void main(String[] args) {

        /*/
        int start = 1;
        int end = 10;
        System.out.println(    (start+end)*end/2    );
        System.out.println(    10*(1+10)/2    );
        System.out.println(    (1+100)*100/2    );
        System.out.println(    (1+1000)*1000/2    );

        int sum = 0;
        for(int i = 1; i <= 100; i++)
            sum += i;

        System.out.println(sum);
        /**/

        ArrayList numbers = new ArrayList();
        System.out.println(numbers.toString());
        numbers.addLast(10);
        numbers.addLast(30);
        numbers.add(1, 20);
        numbers.addFirst(1);
        System.out.println(numbers.toString());

        numbers.remove(1);
        System.out.println(numbers.toString());

        numbers.removeFirst();
        System.out.println(numbers.toString());

        numbers.removeLast();
        System.out.println(numbers.toString());

        numbers.addLast(30);
        System.out.println(numbers.get(1));
        numbers.addLast(33);
        System.out.println(numbers.get(2));
        numbers.addLast(36);
        System.out.println(numbers.get(3));


        System.out.println(numbers.size());

        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.indexOf(33));
        System.out.println(numbers.indexOf(11));
        int n = 0;

        System.out.println("-------------------");
        ArrayList.ListIterator it = numbers.listIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        while(it.hasPrevious()) {
            System.out.println(it.previous());
        }
        while(it.hasNext()) {
            System.out.println(it.next());
        }



        System.out.println("-------------------");
        LinkedList nums = new LinkedList();
        nums.addLast(10);
        nums.addLast(20);
        nums.addLast(30);
        nums.addLast(40);
        ArrayList.ListIterator li = numbers.listIterator();
        while(li.hasNext()) {
            int number = (int)li.next();
            if(number == 30) {
                li.remove();
            }
            System.out.println(numbers);
        }

        System.out.println(numbers);



    }
}
