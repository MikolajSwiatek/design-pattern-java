package AdapterPattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NoteDateBook implements NoteDateRecord {
    List<Note> notes;

    public NoteDateBook() {
        this.notes = new ArrayList<Note>();
    }

    @Override
    public void add(String title, String text, Date date) {
        Note note = new Note(title, text, date);
        notes.add(note);
    }

    @Override
    public void remove(String title, Date date) {
        Optional<Note> note = notes
                .stream()
                .filter(p -> p.getText().equals(title) && p.getDate() == date)
                .findFirst();

        if (note.isPresent()) {
            notes.remove(note);
        }
    }

    @Override
    public String get(String title) {
        Optional<Note> note = notes
                .stream()
                .filter(p -> p.getText().equals(title))
                .findFirst();

        return note.isPresent() ?
                note.get().getText() :
                "";
    }

    @Override
    public List<Note> get(Date date) {
        List<Note> collect  = notes
                .stream()
                .filter(p -> p.getDate() == date)
                .collect(Collectors.toList());

        return collect;
    }

    @Override
    public String get(String title, Date date) {
        Optional<Note> note = notes
                .stream()
                .filter(p -> p.getText().equals(title) && p.getDate() == date)
                .findFirst();

        return note.isPresent() ?
                note.get().getText() :
                "";
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
