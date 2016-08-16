package FilterPattern;

import java.util.List;

public interface Criteria<T, U> {
    public CarFilterResult<U> getByFilter(List<T> t, U parameter);
}
