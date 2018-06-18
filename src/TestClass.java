/**
 * TestClass
 *
 * @author ckkim on 2018-05-03
 */
public final class TestClass {

    int abc = 0;

    public TestClass(int abc) {
        this.abc = abc;
    }

    public int getAbc() {
        return abc;
    }

    public void setAbc(int abc) {
        this.abc = abc;
    }

    static class TestStr {
        public static String getStr() {
            return "abc";
        }
    }
}
