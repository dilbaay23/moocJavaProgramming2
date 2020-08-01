
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    List<Person> list;

    public Employees() {
        list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person p : peopleToAdd) {
            list.add(p);
        }

    }

    public void print() {
        for (Person person : list) {
            System.out.println(list);

        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation() == education) {
                System.out.println(nextInLine);
            }
        }
    }
    public void fire(Education education){
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation() == education) {
                 iterator.remove();
            }
        }
    }

}
