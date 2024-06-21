package out.production.TestAccessModifier;



public class AccessModifierTest {

    protected int a = 10;

}


class B extends AccessModifierTest{

    public static void main(String[] args) {
        AccessModifierTest access = new AccessModifierTest();
        access.a = 10;
    }

    int test(){
        return 0;
    }

}
