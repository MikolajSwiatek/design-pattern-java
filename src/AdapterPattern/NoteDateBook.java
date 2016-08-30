package AdapterPattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NoteDateBook implements NoteDateRecord {
    List<Note> notes;

    public NoteDateBook() {
        this.notes = new ArrayList<>();
    }

    @Override
    public void add(String title, String text, Date date) {
        Note note = new Note(title, text, date);
        notes.add(note);
    }

    @Override
    public void remove(String title, Date date) {
        List<Note> note = notes
                .stream()
                .filter(p -> p.getTitle().equals(title) && p.getDate() == date)
                .collect(Collectors.toList());

        if (note.size() != 1) {
            return;
        }
        notes.remove(note.get(0));
    }

    @Override
    public String get(String title) {
        List<Note> note = notes
                .stream()
                .filter(p -> p.getTitle().equals(title))
                .collect(Collectors.toList());

        if (note.size() != 1) {
            return "";
        }

        return note.get(0).getText();
    }

    @Override
    public List<Note> get(Date date) {
        return notes
                .stream()
                .filter(p -> p.getDate() == date)
                .collect(Collectors.toList());
    }

    @Override
    public String get(String title, Date date) {
        List<Note> note = notes
                .stream()
                .filter(p -> p.getTitle().equals(title) && p.getDate() == date)
                .collect(Collectors.toList());

        if (note.size() != 1) {
            return "";
        }

        return note.get(0).getText();
    }

    @Override
    public List<Note> getAll() {
        return notes;
    }

    @Override
    public String toString() {
        return "NoteDateBook{" +
                "notes=" + notes +
                '}';
    }
}
