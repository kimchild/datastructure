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

        String str = "abc";
        String str2 = "abc";
        String str3 = "abc";
        String str4 = "abcdef";
        String str5 = new String("abc");
        System.out.println(str4 == str5 + "def");
        System.out.println(str4 == (str5 + "def").intern());
        System.out.println(str4 == (str5 + " def").intern());
//        System.out.println(str3 == str4);
//        System.out.println(str4 == str5);
//        System.out.println(str4 == str5.intern());
//        System.out.println(str5 == str5.intern());
//        System.out.println(str5.intern());
//        System.out.println(str4 == str5.intern());

    }
}
