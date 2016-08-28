package AdapterPattern;

import java.util.Date;

public class Note {
    private String title;
    private String text;
    private Date date;

    public Note(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public Note(String title, String text, Date date) {
        this.title = title;
        this.text = text;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        String dateText = date != null ? date.toString() : " is null";

        return "Note{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", date=" + dateText +
                '}';
    }
}
