public class Entry {
    private String title;
    private String text;
    private String date;

    public Entry(String title, String text, String date) {
        this.title = title;
        this.text = text;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
