
public class Student extends Person {

    private int credits;

    public Student(String name, String adress) {
        super(name, adress);

    }

    public void SetCredits() {
        credits++;

    }

    public int credits() {

        return credits;

    }

    public void study() {
        SetCredits();

    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "  Study credits " + credits();
    }

}
