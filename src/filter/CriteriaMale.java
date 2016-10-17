package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinlong on 2016/10/18.
 */
public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons){
            if(person.getGender().equalsIgnoreCase("male")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
