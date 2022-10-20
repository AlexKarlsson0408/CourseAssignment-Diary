import java.time.LocalDate;

public class Entry {
    private String title;
    private String text;
    private LocalDate date;

    public Entry(String title, String text, LocalDate date) {
        this.title = title;
        this.text = text;
        this.date = date;
    }

    public Entry() {
    }

    @Override
    public String toString() {
        return date + "\n" + title + "\n" + text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
