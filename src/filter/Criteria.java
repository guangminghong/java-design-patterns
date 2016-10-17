package filter;

import java.util.List;

/**
 * Created by jinlong on 2016/10/18.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
