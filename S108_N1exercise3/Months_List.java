package S108_N1exercise3;

import java.util.ArrayList;
import java.util.List;

public class Months_List {
    public static void main(String[] args) {
        List<String> months = new ArrayList<>();
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

        //printing elements of the list
        months.forEach(month -> System.out.println(month));

    }
}
