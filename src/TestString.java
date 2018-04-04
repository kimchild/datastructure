/**
 * TestString
 *
 * @author ckkim on 2018-03-30
 */
public class TestString {

    public static void main(String[] args) {
        String str = "/app/cloudweb/smartLC/CUG_DATA/KT/540/normal_main_0_0.png";
        str = str.substring(str.lastIndexOf("/")+1, str.length());
        System.out.println(str);
    }
}
