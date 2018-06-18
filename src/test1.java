import account.Refund;

/**
 * test1
 *
 * @author ckkim on 2018-03-27
 */
public class test1 {

    public String getM() {
        TestClass.TestStr.getStr();
//        TestClass testClass = new TestClass();
//        testClass.getAbc();
        return "abc";
    }
    public static void main(String[] args) {

        Refund refund = new Refund();
        refund.setCustomer("레스토랑");
        refund.setRefund(1000);
        System.out.println(refund.getRefund());
        System.out.println(refund.getRefundDate());

//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//
//        LocalDate startDate = localDate.with(DayOfWeek.THURSDAY).minusWeeks(2);
//        LocalDate endDate = localDate.with(DayOfWeek.WEDNESDAY).minusWeeks(1);
//        LocalDate refundDate = localDate.with(DayOfWeek.WEDNESDAY);
//        System.out.println( startDate );
//        System.out.println( endDate );
//        System.out.println( refundDate );
//        LocalDate nowDate = LocalDate.now();
//        CalculatorDate startDate = CalculatorDate.START_DATE;
//        startDate.calculate(nowDate);

//        Calendar c = Calendar.getInstance();
//        c.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
//        System.out.println(c.getTime());
//        c.set(Calendar.DAY_OF_WEEK, -7);
//        System.out.println(c.getTime());

//        try {
//            Class c = Class.forName("java.lang.String");
//            Method m[] = c.getDeclaredMethods();
//            for(int i = 0; i < m.length; i++)
//                System.out.println(m[i].toString());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        TestClass.TestStr.getStr();
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

        /*/
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
        /**/


    }
}
