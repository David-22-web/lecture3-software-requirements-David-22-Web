import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<UserStory> backlog = new ArrayList<>();
        backlog.add(new UserStory("US-01", "User Login", MoscowPriority.MUST_HAVE, "Valid login"));
        backlog.add(new UserStory("US-02", "View Dashboard", MoscowPriority.MUST_HAVE, "Loads <2s"));
        backlog.add(new UserStory("US-03", "Export Report", MoscowPriority.SHOULD_HAVE, "PDF/CSV"));
        backlog.add(new UserStory("US-04", "Dark Mode", MoscowPriority.COULD_HAVE, "Toggle"));
        backlog.add(new UserStory("US-05", "AI Chatbot", MoscowPriority.WONT_HAVE, "Chat"));

        BacklogPolicy policy = new BacklogPolicy();
        System.out.println("Must Have Stories: " + policy.getMustHave(backlog));
        System.out.println("Ready for Release: " + policy.canRelease(backlog));
    }
}