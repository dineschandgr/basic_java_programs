package out.production.association;

public class LiskovTest1 {

    public static void main(String[] args) {
        Module m = new Module(100);
        m.displayGrade(m);
        m.displayGrade(new CSCUModule(100));
    }


}


class Module{

    double marks;

    public Module() {
    }

    public Module(double marks) {
        this.marks = marks;
    }

    public void displayGrade(Module m) {
        char grade = m.marksToGrade(marks);
        if (grade == 'A') {
            System.out.println("well done");
        } else if (grade == 'B') {
            System.out.println("good");
        } else if (grade == 'C') {
            System.out.println("ok");
        } else {
            System.out.println("retake again");
        }
    }

    public char marksToGrade(double marks){

        switch ((int) marks){
            case 100:
                return 'A';
            case 90:
                return 'B';
        }

        return '0';
    }

}

class CSCUModule extends Module{

    public CSCUModule(double marks) {
        this.marks = marks;
    }

    public char marksToGrade(double marks){

        System.out.println("inside child");
        switch ((int) marks){
            case 100:
                return 'S';
            case 90:
                return 'U';
        }

        return '0';
    }
}
