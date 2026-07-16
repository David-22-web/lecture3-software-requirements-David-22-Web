import java.util.List;
import java.util.stream.Collectors;

public class BacklogPolicy {
    
    public List<UserStory> getMustHave(List<UserStory> stories) {
        return stories.stream()
            .filter(s -> s.getPriority() == MoscowPriority.MUST_HAVE)
            .collect(Collectors.toList());
    }

    public boolean canRelease(List<UserStory> stories) {
        return getMustHave(stories).size() > 0;
    }
}