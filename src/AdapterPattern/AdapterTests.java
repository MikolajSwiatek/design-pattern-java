package AdapterPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class AdapterTests {
    private NoteAdapter notes;

    @Before
    public void setUp() {
        notes = new NoteAdapter();
    }

    @Test
    public void whenAddedNewNoteShouldReturnCorrectSize1() {
        notes.add("t1", "text1");

        Assert.assertEquals(1, notes.getAll().size());
    }

    @Test
    public void whenAddedNewNotesAndRemoveOneShouldReturnCorrectSize1() {
        notes.add("t1", "text1");
        notes.add("t2", "text1");
        notes.remove("t1");

        Assert.assertEquals(1, notes.getAll().size());
    }

    @Test
    public void whenAddedNewNoteShouldReturnCorrectValue() {
        notes.add("t1", "text1");

        Assert.assertEquals("t1", notes.getAll().get(0).getTitle());
        Assert.assertEquals("text1", notes.getAll().get(0).getText());
        Assert.assertEquals(null, notes.getAll().get(0).getDate());
    }

    @Test
    public void whenAddedNewNoteWithDateShouldReturnCorrectValue() {
        notes.add("t1", "text1", new Date());

        Assert.assertEquals("t1", notes.getAll().get(0).getTitle());
        Assert.assertEquals("text1", notes.getAll().get(0).getText());
        Assert.assertNotEquals(null, notes.getAll().get(0).getDate());
    }

    @Test
    public void whenGetNoteAndRemoveOneShouldReturnCorrectSize1() {
        notes.add("t1", "text1");
        notes.add("t2", "text");
        String text = notes.get("t1");

        Assert.assertEquals("text1", text);
    }

    @Test
    public void whenGetNotExistwNoteShouldReturnCorrectValue() {
        notes.add("t1", "text1");
        String text = notes.get("t2");

        Assert.assertEquals("", text);
    }

    @Test
    public void whenGetNotesWithDateShouldReturnCorrectValue() {
        Date date = new Date();
        notes.add("t1", "text1", date);
        notes.add("t2", "text1", date);
        notes.add("t3", "text1", null);
        notes.add("t3", "text1", new Date(0));

        Assert.assertEquals(2, notes.get(date).size());
    }

    @Test
    public void CheckGetAndGetAllShouldReturnSametValue() {
        Date date = new Date();
        notes.add("t1", "text1", date);
        notes.add("t2", "text1", date);
        notes.add("t3", "text1", null);
        notes.add("t3", "text1", new Date(0));

        Assert.assertEquals(notes.getAll().size(), notes.get().size());
    }
}
