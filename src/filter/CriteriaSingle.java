package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinlong on 2016/10/18.
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePerson = new ArrayList<Person>();
        for(Person person : persons){
            if(person.getMaritalStatus().equalsIgnoreCase("single")){
                singlePerson.add(person);
            }
        }
        return  persons;
    }
}
