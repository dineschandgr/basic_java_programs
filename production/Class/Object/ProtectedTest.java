package out.production.Class.Object;

import out.production.arrays.ArrayTest;


  class Protect{
     final void test(){

    }
}
public class ProtectedTest extends Protect{

    protected int legs;
     String name;
    public final int type = 10;

    public ProtectedTest() {
    }

    protected int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }


    public static void main(String[] args) {
        ProtectedTest protectedTest = new ProtectedTest();
    }
}
