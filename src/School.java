import java.util.List;
import java.util.ArrayList;
public class School {
    private List<String> members;
    public School() {
        this.members = new ArrayList<>();
    }
    public void addMember(String member) {
        members.add(member);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("School members: \n");
        for (String member : members) {
            str.append(member).append("\n");
        }
        return str.toString();
    }

}