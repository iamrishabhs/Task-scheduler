import java.util.List;

public class Task {
    private String name;
    private List<String> prerequisites;
    private boolean isCompleted;

    public Task(String name, List<String> prerequisites) {
        this.name = name;
        this.prerequisites = prerequisites;
        this.isCompleted = false;
    }

    // Standard getters and setters

    public String getName() {
        return name;
    }

    public List<String> getPrerequisites() {
        return prerequisites;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
