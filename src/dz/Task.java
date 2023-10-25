package dz;

public class Task {

    private String text;
    private boolean success;
    private int id;

    public Task(int id, String text) {
        this.id = id;
        this.text = text;
        this.success = false;
    }

    public String getText() {
        return text;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "|" + text + "|" +success + "\n";
    }
}
