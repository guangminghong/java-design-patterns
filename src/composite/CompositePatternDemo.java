package composite;

/**
 * Created by jinlong on 2016/10/20.
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("Jhon", "CEO", 30000);
        Employee headSales = new Employee("Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee sales1 = new Employee("Richard", "Sales", 10000);
        Employee sales2 = new Employee("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        headSales.add(sales1);
        headSales.add(sales2);

        System.out.println(CEO);

        for (Employee headEmplyee : CEO.getSubordinates()) {
            System.out.println(headEmplyee);
            for (Employee employee : headEmplyee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
