package AdapterPattern;

import java.util.Date;
import java.util.List;

public class NoteAdapter implements NoteRecord, NoteDateRecord {
    NoteDateRecord notes;

    public NoteAdapter() {
        notes = new NoteDateBook();
    }

    @Override
    public void add(String title, String text, Date date) {
        notes.add(title, text, date);
    }

    @Override
    public void remove(String title, Date date) {
        notes.remove(title, date);
    }

    @Override
    public List<Note> get(Date date) {
        return notes.get(date);
    }

    @Override
    public String get(String title, Date date) {
        return notes.get(title, date);
    }

    @Override
    public List<Note> getAll() {
        return notes.getAll();
    }

    @Override
    public void add(String title, String text) {
        notes.add(title, text, null);
    }

    @Override
    public void remove(String title) {
        notes.remove(title, null);
    }

    @Override
    public String get(String title) {
        return notes.get(title);
    }

    @Override
    public List<Note> get() {
        return notes.getAll();
    }

    @Override
    public String toString() {
        return "NoteAdapter{" +
                "notes=" + notes +
                '}';
    }
}
