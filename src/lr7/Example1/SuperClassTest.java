package lr7.Example1;

public class SuperClassTest {

    private String str1;

    SuperClassTest(String strEx) {
        this.str1 = strEx;
    }
    SuperClassTest() {
    }

    @Override
    public String toString() {
        String SuperClassNameAndFieldValue;
        SuperClassNameAndFieldValue = "super" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str1 = " + this.getStr1();

        return SuperClassNameAndFieldValue;
    }
    public String getStr1() {
        return str1;
    }
    public void getStr1(String str1) {
        this.str1 = str1;
    }
}
