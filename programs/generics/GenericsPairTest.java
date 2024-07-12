package programs.generics;

public class GenericsPairTest {
    public static void main(String[] args) {
        Pair<String,Integer,Double> p = new Pair<String, Integer, Double>("hello", 10);
        p.setFirst("aaa");
        p.setThird(10.00);

        Pair<String,String,String> p1 = new Pair("hello","world");
        p1.setThird("aaa");
    }
}

class Pair<S,I,D> {
    private S first;
    private I second;

    private D third;

    private Integer fourth;

    public Pair(S first, I second) {
        this.first = first;
        this.second = second;
    }


    public S getFirst() {
        return this.first;
    }

    public void setFirst(S s) {

    }

    public void setThird(D d) {

    }

    public I getSecond() {
        return this.second;
    }

    public void setSecond(I second) {
        this.second = second;
    }

    public D getThird() {
        return third;
    }

    public Integer getFourth() {
        return fourth;
    }

    public void setFourth(Integer fourth) {
        this.fourth = fourth;
    }
}
