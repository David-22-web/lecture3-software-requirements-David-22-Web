public class UserStory {
    private String id;
    private String description;
    private MoscowPriority priority;
    private String acceptanceCriteria;

    public UserStory(String id, String description, MoscowPriority priority, String acceptanceCriteria) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public String getId() { return id; }
    public MoscowPriority getPriority() { return priority; }
    public String getDescription() { return description; }

    @Override
    public String toString() {
        return id + ": " + description + " [" + priority + "]";
    }
}