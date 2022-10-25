import java.time.LocalDateTime;

public class Entry {
    private String title;
    private String text;
    private LocalDateTime dateTime;

    public Entry(String title, String text, LocalDateTime dateTime) {
        this.title = title;
        this.text = text;
        this.dateTime = dateTime;
    }

    public Entry() {
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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
