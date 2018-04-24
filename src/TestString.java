import java.util.Comparator;
import java.util.function.*;

/**
 * TestString
 *
 * @author ckkim on 2018-03-30
 */
public class TestString {

    public static void main(String[] args) {
//        String str = "/app/cloudweb/smartLC/CUG_DATA/KT/540/normal_main_0_0.png";
//        str = str.substring(str.lastIndexOf("/")+1, str.length());
//        System.out.println(str);

//        String str = "abc";
//        String str2 = "abc";
//        String str3 = "abc";
//        String str4 = "abcdef";
//        String str5 = new String("abc");
//        System.out.println(str4 == str5 + "def");
//        System.out.println(str4 == (str5 + "def").intern());
//        System.out.println(str4 == (str5 + " def").intern());
//        System.out.println(str3 == str4);
//        System.out.println(str4 == str5);
//        System.out.println(str4 == str5.intern());
//        System.out.println(str5 == str5.intern());
//        System.out.println(str5.intern());
//        System.out.println(str4 == str5.intern());

        Runnable r = () -> System.out.println("hello functional");
        r.run();

        Supplier<String> s = () -> "hello supplier";
        String result = s.get();
        System.out.println(result);

        Consumer<String> c = System.out::println;
        c.accept("hello consumer");

        Function<String, Integer> f = Integer::parseInt;
        Integer result2 = f.apply("1");
        System.out.println(result2);

        Predicate<String> p = String::isEmpty;
        boolean result3 = p.test("hello");
        System.out.println(result3);

        UnaryOperator<String> u = str -> str + " operator";
        String result4 = u.apply("hello unary");
        System.out.println(result4);

        BinaryOperator<String> b = (str1, str2) -> str1 + " " + str2;
        String result5 = b.apply("hello", "binary");
        System.out.println(result5);

        BiPredicate<String, Integer> bp = (str, num) -> str.equals(Integer.toString(num));
        boolean result6 = bp.test("1", 1);
        System.out.println(result6);

        BiConsumer<String, Integer> bc = (str, num) -> System.out.println(str + " :: " + num);
        bc.accept("숫자", 5);

        BiFunction<Integer, String, String> bf = (num, str) -> String.valueOf(num) + str;
        String result7 = bf.apply(5, "678");
        System.out.println(result7);

        Comparator<String> comparator = String::compareTo;
        int result8 = comparator.compare("a", "bbb");
        System.out.println(result8);

    }
}
