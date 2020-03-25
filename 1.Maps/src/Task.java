import java.util.*;

public class Task {


    String content;
    String user;
    int time;

    public Task(String content, String user, int time) {
        this.content = content;
        this.user = user;
        this.time = time;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "* " + content + " (" + user + ", " + time + ") ";
    }

    public static void main(String[] args) {
        int count;
        Task deployToAzure = new Task("Deploy to Azure", "Bob", 6);
        Task handleUserInput = new Task("Handle user input", "John", 5);
        Task connectDB = new Task("Connect DB", "John", 3);
        Task addUsers = new Task("Add users", "Jessica", 2);
        Task configureLogging = new Task("Configure logging", "John", 1);
        Task prepareDataset = new Task("Prepare dataset", "Bob", 5);

        List<Task> taskList = new ArrayList<>();
        taskList.add(deployToAzure);
        taskList.add(handleUserInput);
        taskList.add(connectDB);
        taskList.add(addUsers);
        taskList.add(configureLogging);
        taskList.add(prepareDataset);

        Map<Task, String> stringListMap = new HashMap<>();
        stringListMap.put(taskList.get(0), "In progress");
        stringListMap.put(taskList.get(1), "In progress");
        stringListMap.put(taskList.get(2), "To do");
        stringListMap.put(taskList.get(3), "To do");
        stringListMap.put(taskList.get(4), "To do");
        stringListMap.put(taskList.get(5), "Done");

        count = Collections.frequency(stringListMap.values(), "In progress");
        System.out.println("In progress(" + count + "):");
        for (Task key : stringListMap.keySet()) {
            String value = stringListMap.get(key);
            if (value.equals("In progress")) {
                System.out.println(key);
            }
        }
        count = Collections.frequency(stringListMap.values(), "To do");
        System.out.println("To do(" + count + "):");
        for (Task key : stringListMap.keySet()) {
            String value = stringListMap.get(key);
            if (value.equals("To do")) {
                System.out.println(key);
            }
        }
        count = Collections.frequency(stringListMap.values(), "Done");
        System.out.println("Done(" + count + "):");
        for (Task key : stringListMap.keySet()) {
            String value = stringListMap.get(key);
            if (value.equals("Done")) {
                System.out.println(key);
            }
        }

        count = 0;
        for(Task key : stringListMap.keySet()) {
            if (key.getUser().equals("John")) {
                count++;
            }
        }
        System.out.println("\nJohn was assigned to " + count + " tasks in this sprint.");

        float time = 0f;
        for(Task key : stringListMap.keySet()) {
            time = time + key.time;
        }
        System.out.printf("Mean approximate time per task is: %.2f", time/taskList.size());
    }
}
