package eyad.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaysOfWeek {
    private List<String> dayswk;


    public DaysOfWeek() {
        dayswk = new ArrayList<>();
    }

    public void createWeekDays(){
        dayswk.add("Monday");
        dayswk.add("Tuesday");
        dayswk.add("Wednesday");
        dayswk.add("Thursday");
        dayswk.add("Friday");
        dayswk.add("Saturday");
        dayswk.add("Sunday");
    }

    public List<String> daysReturn() {
        return dayswk;
    }

    public int daysLength() {
        return dayswk.size();
    }

    public boolean dayRemove(String dia) {
        return dayswk.remove(dia);
    }

    public String daySelect(int indice) {
        if (indice >= 0 && indice < dayswk.size()) {
            return dayswk.get(indice);
        }
        return null;
    }

    public boolean dayInList(String dia) {
        return dayswk.contains(dia);
    }

    public void daysOrden() {
        Collections.sort(dayswk);
    }

    public void daysEmpty() {
        dayswk.clear();
    }
    
}
