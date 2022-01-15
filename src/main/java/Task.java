public class Task {
    private String description;
    private boolean isDone;

    public Task(String description){
        this.description = description;
        isDone = false;
    }

    public void setIsDone(boolean bool) {
        isDone = bool;
    }

    public boolean getIsDone(){
        return isDone;
    }

    public String getDescription(){
        return description;
    }
}
