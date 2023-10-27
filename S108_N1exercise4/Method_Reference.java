package s108_lambdas.S108_N1exercise4;

import java.util.ArrayList;
import java.util.List;
public class Method_Reference {
    private List<String> months;

    public Method_Reference () {
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
        months.forEach(System.out::println);
    }
}
