package AdapterPattern;

import java.util.List;

public interface NoteRecord {
    public void add(String title, String text);

    public void remove(String title);

    public String get(String title);

    public List<Note> get();

    public String toString();
}
