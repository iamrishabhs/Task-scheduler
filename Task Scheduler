import java.util.*;

public class TaskScheduler {
    private Queue<Task> taskQueue = new LinkedList<>();
    private Map<String, Task> allTasks = new HashMap<>();

    public void addTask(Task task) {
        allTasks.put(task.getName(), task);
        if (canSchedule(task)) {
            taskQueue.offer(task);
        }
    }

    private boolean canSchedule(Task task) {
        for (String prereq : task.getPrerequisites()) {
            Task prereqTask = allTasks.get(prereq);
            if (prereqTask == null || !prereqTask.isCompleted()) {
                return false;
            }
        }
        return true;
    }

    public Task getNextTask() {
        return taskQueue.poll();
    }

    public void completeTask(String taskName) {
        Task task = allTasks.get(taskName);
        if (task != null) {
            task.setCompleted(true);
            // Check if new tasks can be scheduled
            for (Task t : allTasks.values()) {
                if (!t.isCompleted() && canSchedule(t)) {
                    taskQueue.offer(t);
                }
            }
        }
    }

    // Other methods...
}
