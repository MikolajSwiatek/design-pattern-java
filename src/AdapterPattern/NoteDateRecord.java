package AdapterPattern;

import java.util.Date;
import java.util.List;

public interface NoteDateRecord {
    public void add(String title, String text, Date date);

    public void remove(String title, Date date);

    public String get(String title);

    public List<Note> get(Date date);

    public String get(String title, Date date);

    public List<Note> getAll();

    public String toString();
}
