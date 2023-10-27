package s108_lambdas.S108_N1exercise3;

import java.util.ArrayList;
import java.util.List;

public class Months_List {
    private List<String> months;

    public Months_List() {
        months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
    }
    public void printMonths() {
        months.forEach(month -> System.out.println(month));
    }
}