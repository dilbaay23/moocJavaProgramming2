
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList<>();
    }

    public void add(double status) {
        list.add(status);
    }

    public void clear() {
        list.clear();
    }

    public String toString() {
        return list.toString();

    }

    public double maxValue() {
        if (list.isEmpty()){
            return 0;}
        double max = list.get(0);
        for (Double double1 : list) {
            if (double1 > max) {
                max = double1;
            }

        }
        return max;
    }

    public double minValue() {
        if (list.isEmpty()){
            return 0;}
        double min = list.get(0);
        for (Double double1 : list) {
            if (double1 < min) {
                min = double1;
            }
        }

        return min;
    }

    public double average() {
        double sum = 0;
        if (list.isEmpty()){
            return 0;
    }else{
        for (Double double1 : list) {
           sum+=double1;

        }
        return (sum/list.size());

    }
}

}
