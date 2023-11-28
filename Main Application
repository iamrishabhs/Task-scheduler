import java.util.Arrays;
import java.util.Collections;

public class CyberSecurityCareerPlanner {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Creating tasks based on the flowchart
        Task bTech = new Task("B.Tech", Collections.emptyList());
        Task certification = new Task("Certification", Collections.singletonList("B.Tech"));
        Task compTIA = new Task("CompTIA Security+", Collections.singletonList("Certification"));
        // ... other tasks

        // Adding tasks to the scheduler
        scheduler.addTask(bTech);
        scheduler.addTask(certification);
        scheduler.addTask(compTIA);
        // ... other tasks

        // Simulate task completion and get next task
        scheduler.completeTask("B.Tech");
        Task nextTask = scheduler.getNextTask();

        if (nextTask != null) {
            System.out.println("Next task to do: " + nextTask.getName());
        }
    }
}
