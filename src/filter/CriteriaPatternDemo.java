package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by jinlong on 2016/10/19.
 */
public class CriteriaPatternDemo {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male","Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singOrFemale = new OrCriteria(single, male);

        System.out.print("Males: ");
        printPersons(male.meetCriteria(persons));

    }

    public static void printPersons(List<Person> persons) {
        for (Person person:persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
