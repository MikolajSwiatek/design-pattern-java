package AdapterPattern;

import java.util.Date;

public class Main {
    public static void main (String[] args) {
        Date date = new Date();

        NoteAdapter note = new NoteAdapter();
        note.add("t1", "text1", new Date());
        System.out.println(note.getAll());
        note.add("t2", "text2");
        System.out.println(note.getAll());
        note.add("t3", "text3", date);
        System.out.println(note.getAll());

        System.out.println(note.get(date));
        
        note.remove("t2");
        System.out.println(note.getAll());
    }
}
